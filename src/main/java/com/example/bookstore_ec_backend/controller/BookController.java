package com.example.bookstore_ec_backend.controller;

import com.example.bookstore_ec_backend.api.BooksApi;
import com.example.bookstore_ec_backend.model.Book;
import com.example.bookstore_ec_backend.service.BookService; // Serviceをインポート
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController implements BooksApi {

    // finalにすることで、変更されないことを保証
    private final BookService bookService;

    // コンストラクタでBookServiceを受け取る (依存性の注入)
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public ResponseEntity<Book> getBookById(Long bookId) {
        // 実際の処理はBookServiceに任せる
        Book response = bookService.findBookById(bookId);
        return ResponseEntity.ok(response);
    }
}