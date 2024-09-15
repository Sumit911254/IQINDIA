package lestenerTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestLestnerClass implements ITestListener {
	
	@Override 
	public void onTestStart(ITestResult result) {
	    System.out.println("onTestStart");
	  }
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	  }
@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	  }
@Override
     public void onTestSkipped(ITestResult result) {
    	 System.out.println("onTestSkipped");

     }
@Override
     public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	 
    	 System.out.println("onTestFailedButWithinSuccessPercentage");
    	  }
}

