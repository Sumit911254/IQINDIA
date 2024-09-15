package testNGcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginWithTestNG {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://testfire.net/login.jsp");
	  driver.findElement(By.name("uid")).sendKeys("jsmith");
	  driver.findElement(By.id("passw")).sendKeys("demo1234");
	  driver.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(2000);
	  driver.close();
	  
	  
	  
  }
}
