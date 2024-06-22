package com.thetestingacademy.ex_22062024.CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab270 {

    RequestSpecification rs = RestAssured.given();

    @Test
    public void getRequestNonBDDStyle() {
        // given
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/560037");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);

    }

    @Test
    public void getRequestNonBDDStyle2() {
        // given
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/560037");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);


    }
}
