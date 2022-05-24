package edu.poniperro.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/bye")
                .then()
                .statusCode(200)
                .body(is(
                        "<img src='https://c.tenor.com/fk77xC7Ds8IAAAAd/yamato-yamato-one-piece.gif'><h1>Bienvenido</h1><h2>En este momento estas cargando un fichero en memoria de configuracion.</h2>"));
    }

}