package com.example.bookstore_ec_backend.service;

import com.example.bookstore_ec_backend.model.Book;
import org.springframework.stereotype.Service;

@Service // このクラスがビジネスロジックを担うServiceであることをSpringに伝える
public class BookService {

    /**
     * IDで書籍を検索する
     * @param bookId 検索する書籍のID
     * @return 見つかった書籍のDTO
     */
    public Book findBookById(Long bookId) {
        // 今はまだダミーデータを返すロジックをここに記述
        // 将来的には、ここでデータベースからデータを取得する処理を呼び出す
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("クリーンアーキテクチャ入門");
        book.setAuthor("設計 次郎");

        return book;
    }
}