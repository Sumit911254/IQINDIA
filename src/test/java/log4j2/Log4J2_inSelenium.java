package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4J2_inSelenium {
@Test
public void Test()  {
 Logger log=LogManager.getLogger("Log4J2_inSelenium.class");
	
 WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testfire.net/");
	log.info("Browser lunch");
	driver.findElement(By.id("LoginLink")).click();
	log.error("Error");
	driver.findElement(By.id("uid")).sendKeys("jsmith");
	driver.findElement(By.id("passw")).sendKeys("demo1234");
     log.info("User Log In Successful");
	driver.findElement(By.name("btnSubmit")).click();

	driver.findElement(By.xpath("(//a[contains(text(),'News')])")).click();
	log.fatal("Fatal");
	 //driver.navigate().back();
	 
	 driver.findElement(By.linkText("Transfer Funds")).click();
	 
	 driver.findElement(By.xpath("//img[@src='/images/logo.gif']")).click();
	 log.info("Fund Transfer Successfully");
	// driver.findElement(By.partialLinkText(
	// "https://www.hcl-software.com/appscan/")).click(); //Thread.sleep(3000);
	// log.info("Click HCL Link");
	 driver.findElement(By.id("CatLink2")).click(); //driver.navigate().back();
	 
	 driver.findElement(By.xpath("//a[@id='AccountLink']")).click();
	 log.warn("Warning");
	 driver.findElement(By.xpath("//a[@id='HyperLink6']")).click();
	 driver.quit();
	 log.info("Back to Home page");
	 //driver.findElement(By.id("LinkHeader4")).click();
	
	 //driver.quit();
	 
	
	
	
	
	
	
	
}
	
	
	
	
}
