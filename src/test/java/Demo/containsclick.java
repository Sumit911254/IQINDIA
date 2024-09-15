package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class containsclick {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    Actions as=new Actions(d);
    
    WebElement click=d.findElement(By.xpath("//span[text()='right click me']"));
    as.contextClick(click).build().perform();
    
    WebElement delete=d.findElement(By.xpath("//span[text()='Delete']"));
    as.contextClick(delete).build().perform();
    
    
	
	
	
	
}
}
