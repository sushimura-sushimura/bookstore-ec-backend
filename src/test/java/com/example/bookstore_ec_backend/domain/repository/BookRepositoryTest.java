// package com.example.bookstore_ec_backend.domain.repository;

// import com.example.bookstore_ec_backend.domain.entity.BookEntity;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// import org.springframework.dao.DataIntegrityViolationException;

// import java.util.Optional;

// import static org.junit.jupiter.api.Assertions.*;

// @DataJpaTest
// class BookRepositoryTest {

//     @Autowired
//     private BookRepository bookRepository;

//     @Test
//     @DisplayName("存在するIDで検索した場合、そのエンティティが返る")
//     void findById_whenBookExists_shouldReturnBookEntity() { // メソッド名を英語に（慣習）
//         // Arrange
//         BookEntity savedBook = bookRepository.saveAndFlush(new BookEntity(null, "Test Book", "Test Author"));
//         assertNotNull(savedBook.getId());

//         // Act
//         Optional<BookEntity> foundBookOptional = bookRepository.findById(savedBook.getId());

//         // Assert
//         assertTrue(foundBookOptional.isPresent());
//         BookEntity foundBook = foundBookOptional.get();
//         assertEquals("Test Book", foundBook.getTitle());
//     }

//     @Test
//     @DisplayName("存在しないIDで検索した場合、空のOptionalが返る")
//     void findById_whenBookDoesNotExist_shouldReturnEmptyOptional() {
//         // Act
//         Optional<BookEntity> foundBookOptional = bookRepository.findById(999L);
//         // Assert
//         assertFalse(foundBookOptional.isPresent());
//     }

//     @Test
//     @DisplayName("titleがnullの場合、制約違反で例外がスローされる")
//     void save_whenTitleIsNull_shouldThrowException() {
//         // Arrange
//         BookEntity bookWithNullTitle = new BookEntity(null, null, "Valid Author");
//         // Act & Assert
//         assertThrows(DataIntegrityViolationException.class, () -> {
//             bookRepository.saveAndFlush(bookWithNullTitle);
//         });
//     }

//     @Test
//     @DisplayName("titleが100文字を超える場合、制約違反で例外がスローされる")
//     void save_whenTitleIsTooLong_shouldThrowException() {
//         // Arrange
//         String longTitle = "a".repeat(101);
//         BookEntity bookWithLongTitle = new BookEntity(null, longTitle, "Valid Author");
//         // Act & Assert
//         assertThrows(DataIntegrityViolationException.class, () -> { // 例外の型を統一
//             bookRepository.saveAndFlush(bookWithLongTitle);
//         });
//     }

//     @Test
//     @DisplayName("authorがnullの場合、制約違反で例外がスローされる")
//     void save_whenAuthorIsNull_shouldThrowException() {
//         // Arrange
//         BookEntity bookWithNullAuthor = new BookEntity(null, "Valid Title", null);
//         // Act & Assert
//         assertThrows(DataIntegrityViolationException.class, () -> {
//             bookRepository.saveAndFlush(bookWithNullAuthor);
//         });
//     }

//     @Test
//     @DisplayName("authorが100文字を超える場合、制約違反で例外がスローされる")
//     void save_whenAuthorIsTooLong_shouldThrowException() {
//         // Arrange
//         String longAuthor = "a".repeat(101);
//         BookEntity bookWithLongAuthor = new BookEntity(null, "Valid Title", longAuthor);
//         // Act & Assert
//         assertThrows(DataIntegrityViolationException.class, () -> { // 例外の型を統一
//             bookRepository.saveAndFlush(bookWithLongAuthor);
//         });
//     }
// }