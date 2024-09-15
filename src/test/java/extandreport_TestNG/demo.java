package extandreport_TestNG;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class demo {
	
	@Test
	public void gtc() throws IOException {
		ExtentReports extentreports =new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\fol\\demo1.html");
		extentreports.attachReporter(sparkreporter);
		ExtentTest test1 =extentreports.createTest("Hello moto");
		 test1.pass("test is pass");
		 test1.fail("test is fail");
		 test1.info("info");
		 test1.assignAuthor("Sumit kumar");
		
		extentreports.flush();
		
		Desktop.getDesktop().browse(new File ("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\fol\\demo1.html").toURI());
		
		
		
		
		
	}
	
	

}
