package com.example.bookstore_ec_backend.controller;

import com.example.bookstore_ec_backend.domain.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice // 全ての@RestControllerで発生した例外を横断的にキャッチする
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class) // ResourceNotFoundExceptionが発生したらこのメソッドが呼ばれる
    public ResponseEntity<Map<String, String>> handleResourceNotFoundException(ResourceNotFoundException ex) {
        Map<String, String> errorResponse = Map.of(
            "message", ex.getMessage(),
            "status", String.valueOf(HttpStatus.NOT_FOUND.value())
        );
        // HttpStatus.NOT_FOUND (404) を設定してレスポンスを返す
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}