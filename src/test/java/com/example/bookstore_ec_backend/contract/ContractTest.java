package com.example.bookstore_ec_backend.contract;

import com.atlassian.oai.validator.restassured.OpenApiValidationFilter; // <-- 正しいimport
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContractTest {

    private static final String OPENAPI_SPEC_PATH = "api/openapi.yaml";

    private final OpenApiValidationFilter validationFilter = new OpenApiValidationFilter(OPENAPI_SPEC_PATH);

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
        RestAssured.basePath = "/";
    }

    @Test
    public void getBookById_契約通りであること() {
        // H2データベースは空なので、存在しないIDをリクエストして404が返ることを検証
        given()
            .filter(validationFilter)
            .pathParam("bookId", 999) // 存在しないID
        .when()
            .get("/books/{bookId}")
        .then()
            .statusCode(404);
    }
}