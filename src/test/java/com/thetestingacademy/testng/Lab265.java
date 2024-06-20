package com.thetestingacademy.testng;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab265 {


    @Description("TC#1")
    @Test
    public void testCase(){

        // Assertion ->  Expect Result = Actual Result
        // 200 == 200

        // Two Types Assertions

        // Soft Assertions

        SoftAssert s = new SoftAssert();
        s.assertEquals("pramod","Pramod","Not Equal");
        s.assertEquals("amit","Pramod","Not Equal");
        System.out.println("End of the Program");
        System.out.println("Endof 2");
        s.assertAll();

        // PUT -> token


        // Hard Assertion

//        Assert.assertEquals("pramod","Pramod");
//        System.out.println("End of the program");



    }

}
