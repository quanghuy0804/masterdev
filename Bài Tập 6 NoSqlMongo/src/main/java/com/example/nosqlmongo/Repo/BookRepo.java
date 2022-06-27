package com.example.nosqlmongo.Repo;

import com.example.nosqlmongo.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepo extends MongoRepository<Book, String> {

}
