package com.example.BookService.controller;

import com.example.BookService.entity.Book;
import com.example.BookService.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    // CRUD operations

    // GET endpoint to retrieve all books
    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookRepository.FindAll();
    }
}
