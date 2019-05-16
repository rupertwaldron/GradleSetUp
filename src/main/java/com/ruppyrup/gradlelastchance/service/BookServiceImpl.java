package com.ruppyrup.gradlelastchance.service;

import com.ruppyrup.gradlelastchance.model.Book;
import com.ruppyrup.gradlelastchance.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        log.warn("Bookservice constructor");
        this.bookRepository = bookRepository;
    }
    @Override
    public Mono<Book> findById(String id) {
        return bookRepository.findById(id);
    }
    @Override
    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }
    @Override
    public Mono<Book> save(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public Mono<Void> deleteById(String id) {
        return bookRepository.deleteById(id);
    }
}
