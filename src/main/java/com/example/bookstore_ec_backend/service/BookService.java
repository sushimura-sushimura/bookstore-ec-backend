package com.example.bookstore_ec_backend.service;

import com.example.bookstore_ec_backend.domain.repository.BookRepository;
import com.example.bookstore_ec_backend.domain.entity.BookEntity;
import com.example.bookstore_ec_backend.model.Book;
import org.springframework.stereotype.Service;

@Service // このクラスがビジネスロジックを担うServiceであることをSpringに伝える
public class BookService {
  private final BookRepository bookRepository;
  public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    /**
     * IDで書籍を検索する
     * @param bookId 検索する書籍のID
     * @return 見つかった書籍のDTO
     */
    public Book findBookById(Long bookId) {
        // 今はまだダミーデータを返すロジックをここに記述
        // 将来的には、ここでデータベースからデータを取得する処理を呼び出す
        BookEntity entity = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + bookId));

        Book dto = new Book();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setAuthor(entity.getAuthor());

        return dto;
    }
}