package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gtccabs.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("sumitkumar273413@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.className("signin-btn")).click();
		driver.quit();
		
		
		
		
		
	}

}
