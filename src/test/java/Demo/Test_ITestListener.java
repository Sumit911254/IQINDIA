package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import junit.framework.Assert;

public class Test_ITestListener implements ITestListener {
@Override
public void onTestStart(ITestResult result) {
   System.out.println("on Test Start");
   
  }
@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("On Test Sucess");
  }
@Override

public void onTestFailure(ITestResult result) {
    
	System.out.println("On Test Failure");
  }
@Override

public void onTestSkipped(ITestResult result) {
	System.out.println("On Test Skip");
    
  }
@Override

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    
	System.out.println("OnTestFailedButWithinSuccessPercentage");
	
  }

}
