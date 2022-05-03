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
                        "<img src='https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F2img.net%2Fh%2F24.media.tumblr.com%2Ftumblr_lmjqalqtmX1qah4nko1_500.gif&f=1&nofb=1'%><h1>Bienvenido</h1><h2>Informo que va a estar poblado de cosas de One Piece</h2>"));
    }

}