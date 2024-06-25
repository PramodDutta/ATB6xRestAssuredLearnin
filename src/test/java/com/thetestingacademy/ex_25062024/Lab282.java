package com.thetestingacademy.ex_25062024;

import org.testng.annotations.Test;

public class Lab282 {



    @Test
    public void getToken() {
        System.out.println("I will run first");
    }
    @Test
    public void getBookingID() {
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = {"getToken","getBookingID"})
    public void testPUTRequest() {
        System.out.println("testPUT");
    }

    @Test(dependsOnMethods = {"getToken","getBookingID"})
    public void testDeleteRequest() {
        System.out.println("testPUT");
    }
}
