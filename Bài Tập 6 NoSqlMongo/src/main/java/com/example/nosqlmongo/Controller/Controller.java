package com.example.nosqlmongo.Controller;
import com.example.nosqlmongo.Model.Book;
import com.example.nosqlmongo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class Controller {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") String id){
        return bookService.finById(id);
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        return this.bookService.addBook(book);
    }

    @GetMapping("/findAllBooks")
    public List<Book> getAll() {
        return bookService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id) {
         this.bookService.deleteBook(id);
    }

    @PutMapping("/update/{id}")
    public String updateBook(@PathVariable("id") String id ,@RequestBody Book book) {
    return this.bookService.updateBook(id,book);
    }
    @GetMapping("/search/text")
    public List<Book> getBookByNameOrAuthor(@RequestParam(value = "text") String TextSearch) {
        return bookService.findByNameOrAuthor(TextSearch);
    }
    @GetMapping("/between-date/{firstDay}/{finalDay}")
    public List<Book> searchDay(@PathVariable("firstDay") @DateTimeFormat(pattern = "yyyy-MM-dd") Date firstDay, @PathVariable("finalDay") @DateTimeFormat(pattern = "yyyy-MM-dd") Date finalDay) {
        return bookService.searchByDay(firstDay,finalDay);
    }
    @GetMapping("/findWithPage")
    public Page<Book> getAllBooks(@RequestParam("page") int page, @RequestParam("size") int size) {
        return this.bookService.readAll(page, size);
    }
}


