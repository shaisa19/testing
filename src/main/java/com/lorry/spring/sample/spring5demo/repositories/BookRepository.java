package com.lorry.spring.sample.spring5demo.repositories;

import com.lorry.spring.sample.spring5demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
