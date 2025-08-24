package com.example.bookstore_ec_backend.infrastructure.repository;

import org.springframework.stereotype.Repository;

import com.example.bookstore_ec_backend.domain.repository.BookRepository;
import com.example.bookstore_ec_backend.infrastructure.mybatis.BookMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisBookRepository implements BookRepository{
  private final BookMapper bookMapper;
  
  @Override
  public Optional<BookEntity> findById(Long bookId) {
    return bookMapper.findById(bookId);
  }
}
