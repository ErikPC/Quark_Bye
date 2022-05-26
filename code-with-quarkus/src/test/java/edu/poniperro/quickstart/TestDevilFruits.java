package edu.poniperro.quickstart;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TestDevilFruits {

    @Test
    public void testGet() {
        String string = "[{\"berris\":5000000,\"name\":\"Gomu-Gomu\",\"type\":\"Paramecia\"},{\"berris\":5000000,\"name\":\"Ope-Ope\",\"type\":\"Paramecia\"}]";
        String response = given()
                .when().get("/fruits")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        assertEquals(response, string);
    }
}