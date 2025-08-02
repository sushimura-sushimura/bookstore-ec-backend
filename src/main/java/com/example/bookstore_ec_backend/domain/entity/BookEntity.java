package com.example.bookstore_ec_backend.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    private Long id;
    private String title;
    private String author;

    // 追加のフィールドやメソッドが必要であればここに記述
}