package selenium_code;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_in_Selenium_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.hyrtutorials.com/p/waits-demo.html");
	d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	d.findElement(By.id("btn1")).click();
	d.findElement(By.id("txt1")).sendKeys("sumit");
	d.findElement(By.id("btn2")).click();
	d.findElement(By.id("txt2")).sendKeys("kumar");
	d.close();
	
	
		
		
		
		
		
		
		
		
		
	}
}
