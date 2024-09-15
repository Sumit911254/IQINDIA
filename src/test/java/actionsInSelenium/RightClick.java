package actionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions a=new Actions(d);
	
	WebElement copy=d.findElement(By.xpath("//span[text()='right click me']"));
	a.contextClick(copy).build().perform();
	
	WebElement edit=d.findElement(By.xpath("//span[text()='Cut']"));
	a.click(edit).build().perform();
	
	
}

}
