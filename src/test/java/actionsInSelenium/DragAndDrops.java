package actionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrops {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		Actions as=new Actions(d);
		
		WebElement frame=d.findElement(By.xpath("//iframe[@class='demo-frame']"));
		d.switchTo().frame(frame);
		Thread.sleep(3000);
		
		WebElement src=d.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg=d.findElement(By.xpath("//div[@id='droppable']"));
		
		//as.dragAndDrop(src, trg).release().build().perform();
		
		
		 as.clickAndHold(src).moveToElement(trg).build().perform();
		Thread.sleep(4000);
		d.quit();
		
		
		
		
		
		
		
		
	}
	

}
