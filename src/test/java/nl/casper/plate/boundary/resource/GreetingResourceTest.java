package nl.casper.plate.boundary.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.jboss.resteasy.reactive.RestResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testGreetingEndpoint() {
        given()
                .pathParam("name", "Oempaloempa")
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(RestResponse.StatusCode.OK)
                .body(is("Hello Oempaloempa"));
    }

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST"));
    }
}