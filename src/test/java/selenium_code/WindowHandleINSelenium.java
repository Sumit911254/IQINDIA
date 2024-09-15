package selenium_code;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleINSelenium {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String pWindow=driver.getWindowHandle();
		System.out.println(pWindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Window");
		//driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>cWindow=driver.getWindowHandles();
		for(String str: cWindow) {
			
			
		}
		
		
		
		
	}

}
