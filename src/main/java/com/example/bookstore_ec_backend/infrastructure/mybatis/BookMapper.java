package com.example.bookstore_ec_backend.infrastructure.mybatis;

import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BookMapper {
    Optional<BookEntity> findById(Long bookId);
}