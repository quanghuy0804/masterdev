package com.example.nosqlmongo.Service;

import com.example.nosqlmongo.Model.Book;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;


public interface BookService {


    Book finById(String id);
    List<Book> findAll();
    String addBook(Book book);
    void deleteBook(String id);
    String updateBook(String id, Book book);

    List<Book> findByNameOrAuthor(String searchPhrase);

    List<Book> searchByDay(Date firstDay, Date finalDay);

    Page<Book> readAll(int page, int size);
}
