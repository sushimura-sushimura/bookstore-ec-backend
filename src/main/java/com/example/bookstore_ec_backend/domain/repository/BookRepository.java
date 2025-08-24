package com.example.bookstore_ec_backend.domain.repository;

import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import org.springframework.stereotype.Repository;
import java.util.Optional;

public interface BookRepository {
  Optional<BookEntity> findById(Long bookId);
}