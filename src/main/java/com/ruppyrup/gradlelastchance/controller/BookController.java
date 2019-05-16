package com.ruppyrup.gradlelastchance.controller;

import com.ruppyrup.gradlelastchance.model.Book;
import com.ruppyrup.gradlelastchance.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService) {
        log.warn("BookController constructor {} ", bookService);
        this.bookService = bookService;
    }
    @GetMapping(value = "/book/{id}")
    public Mono<Book> getBookById(@PathVariable String id) {
        return bookService.findById(id);
    }
    @GetMapping(value = "/books")
    public Flux<Book> getAllBooks() {
        return bookService.findAll();
    }
    @PostMapping(value = "/book")
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.save(book);
    }
}
