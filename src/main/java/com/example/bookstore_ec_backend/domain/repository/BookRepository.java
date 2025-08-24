package com.example.bookstore_ec_backend.domain.repository;

import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BookRepository {
  Optional<BookEntity> findById(Long bookId);
}