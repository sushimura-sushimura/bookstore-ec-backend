package com.example.bookstore_ec_backend.domain.repository;

import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import java.util.Optional;

public interface BookRepository {

    /**
     * IDで書籍を検索する
     * @param bookId 検索する書籍のID
     * @return 見つかった書籍のエンティティ
     */
    Optional<BookEntity> findById(Long bookId);

    // 他のメソッドもここに追加可能
}