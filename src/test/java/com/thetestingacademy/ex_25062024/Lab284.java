package com.thetestingacademy.ex_25062024;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab284 {

    @Parameters("browser")
    @Test(priority = 1)
    public void testDemo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada
        switch (value){
            case "firefox":
                // Firefox Code
                System.out.println("Firefox starting and Running TC");
                break;
            case "chrome" :
                // Chrome Code
                System.out.println("Chrome starting and Running TC");
                break;
            default:
                System.out.println("NO idea WHAT TO START");
        }

    }
}
