package edu.poniperro.quickstart;

import org.jboss.resteasy.annotations.Body;
import org.junit.jupiter.api.Test;

import edu.poniperro.quickstart.model.DevilFruit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;

@QuarkusTest
public class TestDevilFruits {

    private Set<DevilFruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

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