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
          .body(file)
      .when()
          .post("/post")
      .then()
          .log().all()
          .statusCode(200)
          .body("data[0].balance", equalTo(992821429))
      ;
    }
}
