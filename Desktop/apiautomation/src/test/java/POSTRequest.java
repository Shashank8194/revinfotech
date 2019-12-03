import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class POSTRequest {
    @Test
    public void RegistrationSuccessful()
    {
        RestAssured.baseURI ="https://api.nexmo.com";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("api_key", "e05e2cd2"); // Cast
        requestParams.put("api_secret", "c16fde3c");
        requestParams.put("sig", "vNh6vpnyKgit7jluPfkkvQssGlGD2Rs3TKEHQefz83nZHQml5z");
        /*requestParams.put("Password", "password1");

        requestParams.put("Email",  "sample2ee26d9@gmail.com");*/

RequestSpecification APIBOdy =request.body("{\n" +
        "  \"product\": \"SMS\",\n" +
        "  \"start_date\": \"2019-10-26T00:00:00+0000\",\n" +
        "  \"end_date\": \"2019-10-27T00:00:00+0000\",\n" +
        "  \"sms_type\":\"MT\"\n" +
        "}").header("Content-Type","application/json");
        APIBOdy.contentType(ContentType.JSON);
        Response response = request.post("/v2/reports/");

        System.out.println(response.getBody().asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, "201");
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
    }
}
