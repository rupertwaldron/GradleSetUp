package com.ruppyrup.gradlelastchance.repository;

import com.ruppyrup.gradlelastchance.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
