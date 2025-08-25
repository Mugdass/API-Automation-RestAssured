package utils;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected RequestSpecification request;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
        request = RestAssured.given().header("Content-Type", "application/json");
    }
}

