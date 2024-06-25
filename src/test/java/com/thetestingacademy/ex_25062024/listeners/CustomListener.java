package com.thetestingacademy.ex_25062024.listeners;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomListener implements IExecutionListener, ISuiteListener {

    @Override
    public void onExecutionStart() {
        System.out.println("onExecutionStart");
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");
    }

    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");
        System.out.println("onExecutionFinish");


        // Send email to the QA lead
        // Write Java code to write the Email to QA lead



    }
}
