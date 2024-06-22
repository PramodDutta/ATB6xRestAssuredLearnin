package com.thetestingacademy.ex_22062024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab271 {

    @Test
    public void testBDDStylePOSTPositive() {
        // POST Request
        // URL
        // BODY - PAYLOAD - JSON
        // HEADER - Content Type

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        RestAssured
                .given().baseUri(BASE_URL).basePath(BASE_PATH)
                .contentType(ContentType.JSON).log().all().body(payload)

                .when().log().all().post()


                .then().log().all().statusCode(200);


    }

}
