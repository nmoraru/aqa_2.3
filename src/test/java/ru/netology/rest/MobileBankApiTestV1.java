package ru.netology.rest;

import org.junit.jupiter.api.Test;


import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV1 {
    File file = new File("src/test/resources/testData.json");

    @Test
    void shouldReturnDemoAccounts() {
      given()
          .baseUri("https://postman-echo.com")
          .body("Hi")
      .when()
          .post("/post")
      .then()
          .statusCode(200)
          .body("data", equalTo("Hi"))
      ;
    }
}
