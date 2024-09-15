package selenium_code;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		d.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
	    Alert Al = d.switchTo().alert();
	    Thread.sleep(3000);
	    Al.accept();
	    WebElement output=d.findElement(By.xpath("//div[@id='output']"));
	    Thread.sleep(3000);
	    String s=output.getText();
	    System.out.println(s);
	
		
		

}}
