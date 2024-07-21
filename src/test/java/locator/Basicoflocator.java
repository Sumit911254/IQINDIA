package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicoflocator {

	public static void main(String[] args) throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://testfire.net/");
			Thread.sleep(2000);
			driver.findElement(By.id("LoginLink")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("uid")).sendKeys("jsmith");
			driver.findElement(By.id("passw")).sendKeys("demo1234");
			Thread.sleep(2000);
			driver.findElement(By.name("btnSubmit")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'News')])")).click();
			Thread.sleep(2000);
			
			
			//driver.navigate().back();0
			//driver.findElement(By.linkText("Transfer Funds")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//img[@src='/images/logo.gif']")).click();
			//driver.findElement(By.partialLinkText("https://www.hcl-software.com/appscan/")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.id("CatLink2")).click();
			//driver.navigate().back();
			//Thread.sleep(3000);
			//driver.quit();
			//driver.findElement(By.xpath("//a[@id='AccountLink']")).click();
		    //driver.findElement(By.xpath("//a[@id='HyperLink6']")).click();
		    //Thread.sleep(2000);
		    //driver.findElement(By.id("LinkHeader4")).click();
		    //driver.navigate().back();
		   //driver.findElement(By.xpath("//a[text()='Get your copy from GitHub']")).click();
		   //driver.findElement(By.xpath("//a[text()='Insurance']")).click();
		   
		    
			
			
		
	}

}
