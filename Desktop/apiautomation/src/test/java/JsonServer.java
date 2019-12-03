
import ApiPostClass.PostTCBody;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import sun.lwawt.macosx.CSystemTray;

public class JsonServer {

    @Test(enabled = false)
    public void TC_01() {

        Response response=given()
                .when()
                .get("http://localhost:3000/posts");

        System.out.print("Get Response is" +response.asString());

    }

    @Test(enabled = false)
    public void PostTC()
    {
        Response post=given()
                .body("{\"id\":\"3\"," +
                        " \"title\":\"Shashank\"," +
                        "\"author\":\"ShashankAuthor\"}")
                .contentType(ContentType.JSON)
                .post("http://localhost:3000/posts");

        System.out.println("Data Posted is" +post.asString());
    }

    @Test
    public void PostByMethods()
    {
        PostTCBody postTCBody=new PostTCBody();
        postTCBody.setId(6);
        postTCBody.setTitle("API Automation");
        postTCBody.setAuthor("By Shashank");

      Response response=  given()
                .when()
                .contentType(ContentType.JSON)
                .body(postTCBody)
                .post("http://localhost:3000/posts");

        System.out.println("PostTCBody response is" + response.asString());
    }


}
