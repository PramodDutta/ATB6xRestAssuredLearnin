package com.thetestingacademy.ex_25062024;

import org.testng.annotations.Test;

public class Lab281 {

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }


}
