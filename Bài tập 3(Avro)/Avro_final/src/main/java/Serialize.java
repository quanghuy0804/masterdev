import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import src.main.java.family;
import src.main.java.Member;


public class Serialize {
    public static void main(String args[]) throws IOException {
    family gd1 = new family();
    List<Member> member1 = new ArrayList<>();
    Member father = new Member();
    Member mother = new Member();
    father.setName(" VA");
    mother.setName("Nguyi B");
    father.setId(01);
    mother.setId(02);
    member1.add(mother);
    member1.add(father);
    gd1.setHost("Nguyen Van A");
    gd1.setId(01);
    gd1.setPhonenumber(124);
    gd1.setCulture(true);
    gd1.setAddress("ha noi");
    gd1.setMemlist(member1);

    family gd2 = new family();
    List<Member> member2 = new ArrayList<>();
    Member father1 = new Member();
    Member mother1 = new Member();
    father1.setName("Nguyen Van c");
    mother1.setName("Nguyen Thi d");
    father1.setId(01);
    mother1.setId(02);
    member2.add(mother1);
    member2.add(father1);
    gd2.setHost("Nguyen Van c");
    gd2.setId(01);
    gd2.setPhonenumber(124);
    gd2.setCulture(true);
    gd2.setAddress("TP Ho Chi Minh");
    gd2.setMemlist(member2);

        DatumWriter<family> familyDatumWriter = new SpecificDatumWriter<family>(family.class);
        DataFileWriter<family> familyFileWriter = new DataFileWriter<family>(familyDatumWriter);

        familyFileWriter.create(gd1.getSchema(), new File("C:\\Users\\Admin\\Desktop\\ArvoProject\\Avro_final\\src\\main\\java\\family.avro"));
        familyFileWriter.append(gd1);
        familyFileWriter.append(gd2);

        familyFileWriter.close();

    }
}


