package com.example.nosqlmongo.Service;

import com.example.nosqlmongo.Model.Book;
import com.example.nosqlmongo.Repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Query.query;

@Service
@AllArgsConstructor
@EnableAutoConfiguration
@SuppressWarnings("UnnecessaryLocalVariable")

public class ServiceImpl implements BookService {

    @Autowired
    private BookRepo repo;

    @Override
    public Book finById(String id) {
        Optional<Book> book = repo.findById(id);
        return book.get();
    }

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Book> findAll() {
        return this.repo.findAll();
    }


    @Override
    public String addBook(Book book) {
        repo.save(book);
        return "ok";
    }

    @Override
    public void deleteBook(String id) {
    repo.deleteById(id);
    }

    @Override
    public String updateBook(String id, Book book) {
        Book update = this.finById(id);
        update.setBookName(book.getBookName());
        update.setAuthorName(book.getAuthorName());
        update.setPublicationDate(book.getPublicationDate());
        update.setDetail(book.getDetail());
        repo.save(update);
        return "ok";
    }

    @Override
    public List<Book> findByNameOrAuthor(String TextSearch) {
        TextCriteria criteria = TextCriteria.forDefaultLanguage().matching(TextSearch);
        List<Book> book = mongoTemplate.find(query(criteria),Book.class);
        return book;
    }

    @Override
    public List<Book> searchByDay(Date firstDay, Date finalDay) {
        Query query = new Query();
        query.addCriteria(Criteria.where("publicationDate").lt(finalDay).gt(firstDay));
        List<Book> books = mongoTemplate.find(query,Book.class);
        return books;
    }

    @Override
    public Page<Book> readAll(int page, int size) {
        Page<Book> sortByDay = repo.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "Date")));
        return sortByDay;
    }

}
