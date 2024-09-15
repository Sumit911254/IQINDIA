package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement Dropdown = driver.findElement(By.id("course"));
		Select s = new Select(Dropdown);

		// SelectByIndex
		
//		  s.selectByIndex(0);
//		  Thread.sleep(3000);
//		  s.selectByIndex(1);
//		  Thread.sleep(3000);
//		  s.selectByIndex(2); 
//		  Thread.sleep(3000);
//		  s.selectByIndex(3);
//		 
		
	//	SelectByVisibleText
//		
//		s.selectByVisibleText("Dot Net");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Python");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Javascript");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Java");
//		driver.close();
	
		//SelectByValue
		
		s.selectByValue("python");
		Thread.sleep(3000);
		s.selectByValue("java");
		Thread.sleep(3000);
		s.selectByValue("js");
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
