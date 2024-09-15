package actionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	Actions a=new Actions(d);
	
	WebElement Fashion =d.findElement(By.xpath("//span[text()='Fashion']"));
	a.moveToElement(Fashion).build().perform();
	
	WebElement FootWare=d.findElement(By.xpath("//a[text()='Women Footwear']"));
	a.moveToElement(FootWare).build().perform();
	
	WebElement heels=d.findElement(By.xpath("//a[text()='Women Heels']"));
	a.moveToElement(heels).build().perform();
	a.click(heels).build().perform();
	
	
	
	
}

}
