package Spark;

import Kafka.DataTrackingOuter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.expressions.UserDefinedFunction;
import org.apache.spark.sql.types.DataTypes;
import serialize.Deserialize;

import static org.apache.spark.sql.functions.*;

public class StreamingMD {
    public static void main(String[] args) throws Exception {

        Logger.getLogger("org").setLevel(Level.OFF);

        // Define a Spark Session
        SparkSession spark = SparkSession
                .builder()
                .appName("Spark Kafka Integration using Structured Streaming")
//                .master("local")
//                .config("spark.driver.bindAddress", "127.0.0.1")
                .getOrCreate();

        UserDefinedFunction strLen = udf(
                (byte[] data) -> new Deserialize<>(DataTrackingOuter.DataTracking.parser()).deserialize("huydq129task9", data).toString()
                , DataTypes.StringType);

        spark.udf().register("strLen", strLen);
        Dataset<Row> ds = spark
                .readStream()
                .format("kafka")
                .option("kafka.bootstrap.servers", "172.17.80.26:9092")
                .option("subscribe", "huydq129task9")
                .option("startingOffsets", "earliest")
                .load();

        Dataset<Row> DF =
                ds.selectExpr("CAST(key as string)","strLen(value) as value",
                                "CAST(topic as STRING)", "CAST(offset as long)", "CAST(partition as long)",
                                "YEAR(timestamp) as year", "MONTH(timestamp) as month",
                                "DAY(timestamp) as day", "hour(timestamp) as hour")
                        .select(col("key"),
                                split(col("value"),",").getItem(0).as("version"),
                                split(col("value"),",").getItem(1).as("Name"),
                                split(col("value"),",").getItem(3).as("Phone_Id"),
                                split(col("value"),",").getItem(4).as("Lon"),
                                split(col("value"),",").getItem(5).as("lat"),
                                col("topic"), col("partition"), col("offset"), col("year"),
                                col("month"), col("day"), col("hour"));
        DF.writeStream()
                .outputMode("append")
                .format("parquet")
                .option("checkpointLocation", "/user/huydq129/checkpoint")
                .option("path", "/user/huydq129/data_tracking/output")
                .partitionBy("year","month", "day", "hour")
                .start().awaitTermination();
    }
}
