package com.example.bookstore_ec_backend.controller;

import com.example.bookstore_ec_backend.api.BooksApi;
import com.example.bookstore_ec_backend.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController implements BooksApi { // 自動生成されたInterfaceを実装

    @Override
    public ResponseEntity<Book> getBookById(Long bookId) {
        // ここに実際の処理を書いていく
        // まずはダミーデータを返して、APIが機能することを確認する
        Book response = new Book();
        response.setId(bookId);
        response.setTitle("API設計入門");
        response.setAuthor("設計 太郎");

        return ResponseEntity.ok(response);
    }
}