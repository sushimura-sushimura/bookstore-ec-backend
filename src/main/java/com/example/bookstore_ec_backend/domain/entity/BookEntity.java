package com.example.bookstore_ec_backend.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    private Long id;
    private String title;
    private String author;

    // 追加のフィールドやメソッドが必要であればここに記述
}