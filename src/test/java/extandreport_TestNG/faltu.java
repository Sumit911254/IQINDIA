package extandreport_TestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class faltu {
	@Test
	public void gtc() {
		
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ScreenSort\\faltu.png");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("test");
		test
		
		.log(Status.FAIL, "fail")
		.log(Status.INFO, "information")
		.log(Status.PASS, "pass")
		.log(Status.SKIP, "skip")
		.log(Status.WARNING,"warning");
		test.assignAuthor("sumit kumar");
		
		//report.flush();
		
		String JSONdata= "{'Name':'QA','Address':'23'}";
		
		test.info(MarkupHelper.createCodeBlock(JSONdata,CodeLanguage.JSON));
	
		report.flush();
		
	}

}
