import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class Nexmo1 {

    @Test(enabled = false)
    public void Test() {


        //Initializing Rest API's URL
        String APIUrl = "https://api.nexmo.com/v1/reports/";

        //Initializing payload or API body
        String APIBody = "{\n" +
                "    \"end_date\": \"2019-07-02T00:00:00+0000\",\n" +
                "    \"product\": \"SMS\",\n" +
                "    \"sms_type\": \"MT\",\n" +
                "    \"start_date\": \"2019-07-01T00:00:00+0000\"\n" +
                "}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"

        RequestSpecification APIParams=given().queryParam("api_key", "e05e2cd2");

        System.out.println(APIParams);

        // Building request using requestSpecBuilder
        RequestSpecBuilder builder = new RequestSpecBuilder();

        //Setting API's body
        builder.setBody(APIBody).addHeader("content-type","application/json");

        //Setting content type as application/json or application/xml
       // builder.setContentType("application/json; charset=UTF-8");

        RequestSpecification requestSpec = builder.build();

        //Making post request with authentication, leave blank in case there are no credentials- basic("","")

        Response response = given()
       .queryParam ("api_key","e05e2cd2")
                .spec(requestSpec).when().post(APIUrl);

        System.out.println(response);
   //     JSONObject JSONResponseBody=new JSONObject((Map<String, ?>) response.getBody().asString());
       // JSONObject JSONResponseBody = new JSONObject(response.get);

        //Fetching the desired value of a parameter
        //String result = JSONResponseBody.getString({key});

        //Asserting that result of Norway is Oslo
       // Assert.assertEquals(result, "{expectedValue}");

    }
@Test(enabled = true)
    public void Test2()
    {
        {
            RestAssured.baseURI ="https://api.nexmo.com";
            RequestSpecification request = RestAssured.given();

            JSONObject requestParams = new JSONObject();
            requestParams.put("api_key", "e05e2cd2"); // Cast
            requestParams.put("api_secret", "c16fde3c");
            requestParams.put("sig", "vNh6vpnyKgit7jluPfkkvQssGlGD2Rs3TKEHQefz83nZHQml5z");
            //requestParams.put("Password", "password1");

           // requestParams.put("Email",  "sample2ee26d9@gmail.com");
            request.header("conten-type","application/json");
            request.body(requestParams.toJSONString());
            Response response = request.post("/v1/reports");

            Long time= response.then().extract().timeIn(TimeUnit.SECONDS);


            System.out.println("Time is " + time);
            System.out.println("Response is " + response.asString());

            int statusCode = response.getStatusCode();
           // Assert.assertEquals(statusCode, "201");
            String successCode = response.jsonPath().get("SuccessCode");
           // Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
        }
    }
    }

