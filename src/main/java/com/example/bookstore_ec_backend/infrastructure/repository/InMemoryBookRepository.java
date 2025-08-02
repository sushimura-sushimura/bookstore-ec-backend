package com.example.bookstore_ec_backend.infrastructure.repository;
import com.example.bookstore_ec_backend.domain.repository.BookRepository;
import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryBookRepository implements BookRepository {
    private static final Map<Long, BookEntity> bookStore = new ConcurrentHashMap<>();

    static {
        // ダミーデータを初期化
        bookStore.put(1L, new BookEntity(1L, "クリーンアーキテクチャ入門", "設計 次郎"));
        bookStore.put(2L, new BookEntity(2L, "API設計入門", "設計 太郎"));
    }

    @Override
    public Optional<BookEntity> findById(Long bookId) {
        return Optional.ofNullable(bookStore.get(bookId));
    }
}