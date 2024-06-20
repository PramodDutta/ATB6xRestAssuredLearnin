package com.thetestingacademy.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab262 {

    @Description("TC#1 - Verify GET Request 1")
    @Test
    public void getRequest(){
        System.out.println("TC");
    }

    @Description("TC#1 - Verify GET Request 2")
    @Test(enabled = false)
    public void getRequest2(){
        System.out.println("TC2");
    }

    @Description("TC#1 - Verify GET Request 3")
    @Test
    public void getRequest3(){
        System.out.println("TC3");
    }
}
