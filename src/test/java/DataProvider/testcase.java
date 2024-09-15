package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase {

	@Test(dataProvider = "testfire.net", dataProviderClass = testcase.class)
	public void Gtc01(String uname, String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://testfire.net/");
		driver.findElement(By.id("LoginLink")).click();
		driver.findElement(By.id("uid")).sendKeys(uname);
		driver.findElement(By.id("passw")).sendKeys(pwd);
		driver.findElement(By.name("btnSubmit")).click();
		driver.quit();
		System.out.println(" ");
	}

	
	  @Test(dataProvider="Gtccab",dataProviderClass=testcase.class) public static
	  void Gtc02(String Email,String password){
	  
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
	  driver.get("https://www.gtccabs.com/");
	  
	  driver.findElement(By.linkText("Log In")).click();
	 
	 driver.findElement(By.id("Email")).sendKeys(Email);
	 driver.findElement(By.id("Password")).sendKeys(password);
	 
	  driver.findElement(By.className("signin-btn")).click(); driver.quit(); //}
	 

}
	  }
