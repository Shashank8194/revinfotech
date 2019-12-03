import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import sun.lwawt.macosx.CSystemTray;

import javax.annotation.meta.When;

public class AddingParams {


    //How to use parameters with Rest Assured API's
    @Test(enabled = true)
    public void Params() {

        Response response = given().
                param("id", "2172797").
                param("appid", "b6907d289e10d714a6e88b30761fae22").
                when().get("https://samples.openweathermap.org/data/2.5/weather");

        Integer resp = response.getStatusCode();


        System.out.println(response);
        System.out.println(response.asString());

        if (resp == 200) {
            System.out.println("API is working" + resp);

        } else {
            System.out.println("API is not working fine" + resp);
        }

        String reportID=response.
                then().
                contentType(ContentType.JSON)
                .extract()
                .path("weather[0].description");
        System.out.println("Output from Extraction is " +reportID);


        float lon=response.
                then()
                .contentType(ContentType.JSON)
                .extract()
                .path("coord.lon");
        System.out.println("Longitude is" +lon);

        float lat=response.
                then()
                .contentType(ContentType.JSON)
                .extract()
                .path("coord.lat");
        System.out.println("Longitude is" +lat);


        ValidatableResponse respbycord=given()
                .param("lat",lat)
                .param("lon",lon)
                .when()
                .get("https://samples.openweathermap.org/data/2.5/weather")
                .then()
                .contentType(ContentType.JSON);
                /*.extract();
               // .path("weather[0].description");*/



        System.out.println("Response from Coord is " + respbycord);


        Assert.assertEquals(reportID,respbycord);
    }



}
