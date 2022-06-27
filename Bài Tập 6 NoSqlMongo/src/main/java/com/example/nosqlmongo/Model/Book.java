package com.example.nosqlmongo.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@ToString
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder

@Document(collection = "huydq")
public class Book{
    @Id
    private String id;
    @Indexed()
    private String bookName;
    private String authorName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
    private String Detail;
}
