package extandreport_TestNG;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogEvent {
	@Test
	public void Logs() throws IOException { 	 
		
		
	ExtentReports extentreports =new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ExtentReport\\report3.html");
	extentreports.attachReporter(spark);
	
	ExtentTest test1= extentreports.createTest("GTC1");
	test1
	.log(Status.PASS, "this is pass")
	.log(Status.FAIL, "this is fail")
	.log(Status.INFO, "test information")
	.log(Status.SKIP,"Skip the test")
    .log(Status.WARNING, "Warning 1")
    .log(Status.WARNING, "Warning2");
	 test1.assignAuthor("<b>Sumit Kumar</b>");
     String JSONData= "{'Name':'QA','Address':'23'}";
	   
	   
	test1.info(MarkupHelper.createCodeBlock(JSONData,CodeLanguage.JSON));
	
	
	
	extentreports.flush();
	
	//Desktop.getDesktop().browse(new File ("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ExtentReport\\Report3.html").toURI());


	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
