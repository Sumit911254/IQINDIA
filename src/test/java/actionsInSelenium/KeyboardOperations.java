package actionsInSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://the-internet.herokuapp.com/key_presses");
	Actions a=new Actions(d);
	
	//a.sendKeys(Keys.CANCEL).build().perform();
	//a.sendKeys(Keys.ARROW_LEFT).build().perform();
	//a.sendKeys(Keys.RETURN).build().perform();
	//a.sendKeys(Keys.ARROW_UP).build().perform();
	a.sendKeys(Keys.ALT).build().perform(); 
	
	
}

}
