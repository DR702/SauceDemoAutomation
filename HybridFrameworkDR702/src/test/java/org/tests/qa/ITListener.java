package org.tests.qa;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITListener implements ITestListener{
	
	   public void onStart(ITestResult result) {
	        System.out.println("Test fddgdfhgdfgdfgfgsrwer " + result.getName());
	        
	    } 
	
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed--=rwqwiuqw	uew2ue: " + result.getName());
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed bequgquegqeugqegq: " + result.getName());
 
}
    
    public void onFinish(ITestResult result) {
        System.out.println("Test tertetewtete " + result.getName());
        
    } 
}
