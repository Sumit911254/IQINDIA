package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input")).sendKeys("sumit");
		//driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input")).sendKeys("kumar");
		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("sumit@123");
		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("112200");
		driver.findElement(By.xpath("//div[contains(text(),'Motorola Edge 50 Fusion 5G')]")).click();
		driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[4]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Motorola Edge 50 Fusion (Hot Pink, 128 GB)')]")).click();
		//Thread.sleep(3000);
	
		
	}

}
