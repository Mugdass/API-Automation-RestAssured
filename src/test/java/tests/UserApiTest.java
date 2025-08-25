package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class UserApiTest extends BaseTest {

    @Test(priority = 1)
    public void getUserList_ShouldReturn200() {
        Response response = request
                .when()
                .get("/users?page=2")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("data").size() > 0);
    }

    @Test(priority = 2)
    public void createUser_ShouldReturn201() {
        String payload = """
                {
                  "name": "John",
                  "job": "QA Engineer"
                }
                """;

        Response response = request
                .body(payload)
                .when()
                .post("/users")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "John");
    }
}

