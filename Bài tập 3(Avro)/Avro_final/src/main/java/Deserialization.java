import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import java.io.File;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import src.main.java.family;
import src.main.java.Member;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
public class Deserialization {
    public static void main(String args[]) throws IOException {

        //DeSerializing the objects
        DatumReader<family> familyDatumReader = new SpecificDatumReader<family>(family.class);

        //Instantiating DataFileReader
        DataFileReader<family> dataFileReader = new DataFileReader<family>(new
                File("C:\\Users\\Admin\\Desktop\\ArvoProject\\Avro_final\\src\\main\\java\\family.avro"), familyDatumReader);
        family em = null;

        while (dataFileReader.hasNext()) {

            em = dataFileReader.next(em);
            System.out.println(em);

            
        }
    }
}
