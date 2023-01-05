package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;

    @PostMapping(value = "/book")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

}
