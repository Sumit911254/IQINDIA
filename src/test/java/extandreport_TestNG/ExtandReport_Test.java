package extandreport_TestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import junit.framework.Assert;

public class ExtandReport_Test {

	@Test
	public void test1() {
		
	ExtentReports extentreport=new ExtentReports();
	ExtentSparkReporter sparkreport=new ExtentSparkReporter ("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ExtentReport//report3.html");
	extentreport.attachReporter(sparkreport);
	
	ExtentTest test2=extentreport.createTest("QA");
	test2.fail("fail");
	test2.pass("pass");
	//extentreport.createTest("QC");
	
	test2.assignAuthor("Sumit Kumar");
	
		
	}
	@Test 
	public void test2() {
		
        ExtentReports extentreport=new ExtentReports();
		ExtentTest test3 =extentreport.createTest("QC");
		test3.fail("This test is fail");
		test3.pass("This is pass");
		test3.assignAuthor("Rohit");

		
		test3.assignAuthor("Sumit Kumar");
		extentreport.flush();
			
		
		
		
	}
	
}
