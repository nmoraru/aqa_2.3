package ru.netology.rest;

import org.junit.jupiter.api.Test;


import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV1 {
    File file = new File("/Users/Nikita Moraru/Desktop/Java_netology/aqa_2.3/src/test/resources/testData.json");

    @Test
    void shouldReturnDemoAccounts() {
      given()
          .baseUri("https://postman-echo.com")
          .body(file)
      .when()
          .post("/post")
      .then()
          .statusCode(200)
          .body("data[0].balance.toString()", equalTo("992821429"))
      ;
    }
}
