package com.thetestingacademy.testng;

import org.testng.annotations.*;

public class Lab264 {

    @BeforeSuite
    void demo1() {
        System.out.println("BeforeSuite");
        System.out.println("open Database");
        System.out.println("Read CSV or Excel");
        System.out.println("Read Text / Env or property");
    }

    @BeforeTest
    void demo2() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    void demo3() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4() {
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5() {
        System.out.println("Test");
    }

    @AfterMethod
    void demo6() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7() {
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    void demo9() {
        System.out.println("AfterSuite");
        System.out.println("Close DB Connection");
        System.out.println("Close opened files");
    }
}
