package extandreport_TestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class demo2 {
@Test 
public void gtc21() {
	
	ExtentReports report =new ExtentReports();
	ExtentSparkReporter spark =new ExtentSparkReporter("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ExtentReport\\ext23.png");
	report.attachReporter(spark);
	
//	ExtentTest test=report.createTest("Quality Assurance");
//	
//	test.pass("pass");
//	test.fail("fail");
//	test.warning("warning");
//	test.skip("skip");
//	
//	report.flush();
	
	
	report.createTest("Quality")
	.log(Status.INFO, "info")
	.log(Status.PASS, "pass")
	.log(Status.FAIL, "fail");
	
	report.flush();
	
	
	
}
	
	
	
}
