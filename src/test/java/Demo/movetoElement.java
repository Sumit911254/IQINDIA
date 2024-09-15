package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class movetoElement {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
    Actions as=new Actions(d);
    
	WebElement electronic =d.findElement(By.xpath("//span[text()='Electronics']"));
	as.moveToElement(electronic).build().perform();
	
	WebElement camera =d.findElement(By.linkText("Cameras & Accessories"));
	as.moveToElement(camera).build().perform();
	
	WebElement sport=d.findElement(By.linkText("Sports & action"));
	as.moveToElement(sport).click().build().perform();
	Thread.sleep(5000);
	d.quit();
	
	
	
	
}
}
