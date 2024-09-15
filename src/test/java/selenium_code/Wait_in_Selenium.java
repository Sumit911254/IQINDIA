package selenium_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_in_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
	d.get("https://www.hyrtutorials.com/p/waits-demo.html");
	d.findElement(By.id("btn1")).click();
	WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
	d.findElement(By.id("txt1")).sendKeys("sumit");
	d.close();
	
	
	
		
		
		
		
		
		
		
		
		
	}
}
