package com.thetestingacademy.ex_ra01;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;

public class Lab260 {
    public static void main(String[] args) {

        // Rest Assured Hello World Program
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")

                .when().get()

                .then().statusCode(200);

    }
}
