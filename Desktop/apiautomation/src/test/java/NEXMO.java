import ApiPostClass.NexmoBody;
import ApiPostClass.PostTCBody;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.List;


public class NEXMO {

    public static void  main(String[]args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);

        for (int i=0;i<list.size();i++)
        {
            list.get(i);
        }
    }

}

