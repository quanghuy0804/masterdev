import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;


public class Run {
    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName("Read_Parquet_File")
//                .master("local").config("spark.driver.bindAddress", "127.0.0.1") (chạy trong local)
                .getOrCreate();

        Dataset<Row> parquetFileDF = spark.read()
                .parquet("/user/huydq129/Input/small_data.parquet");
        parquetFileDF.createOrReplaceTempView("parquetFile");


        Dataset<Row> DF1 = spark.sql("SELECT device_model,count(Distinct user_id) as count " +
                "FROM parquetFile WHERE device_model is not NUll " +
                "GROUP BY device_model");
        DF1.repartition(1)
                .write().mode("overwrite")
                .parquet("/user/huydq129/device_model_num_user");


        Dataset<Row> DF2 = spark.sql("SELECT  device_model, collect_set(user_id) as list_user_id " +
                "FROM parquetFile WHERE device_model is not NUll " +
                "GROUP BY device_model");
        DF2.repartition(1)
                .write().mode("overwrite").format("orc")
                .save("/user/huydq129/device_model_list_user");

        Dataset<Row> DF3 = spark.sql("SELECT (concat_ws('_',user_id, device_model)) as user_id_device_model, button_id, count(*) as count" +
                " FROM parquetFile WHERE button_id is not NUll AND device_model is not NUll  " +
                "GROUP BY user_id_device_model, button_id ");
        DF3.repartition(1)
                .write().mode("overwrite")
                .parquet("/user/huydq129/button_count_by_user_id_device_model");
    }
}

