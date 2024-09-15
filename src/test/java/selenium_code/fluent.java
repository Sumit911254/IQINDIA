package selenium_code;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluent {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver(); 
		d.manage().window().maximize();
        //d.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");	
        //FluentWait Fluent=new FluentWait(Duration.ofSeconds(10))
        Wait<WebDriver>wait =new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(10))
       .pollingEvery(Duration.ofSeconds(2));
      //.ignoring(NoSuchElementException.class);
        d.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");	
        d.findElement(By.id("btn1")).click();
        WebElement we =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
        we.sendKeys("sumit");
     //   d.findElement(By.id("btn2")).click();
//        WebElement we2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//        we2.sendKeys("kumar");
//        d.quit();
        		
		
		
	}
	
	
	
	
	
}
