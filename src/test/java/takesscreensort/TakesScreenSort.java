package takesscreensort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenSort {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
	    d.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    
	    TakesScreenshot ts=(TakesScreenshot)d;
	    
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    
	    File des =new File ("C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ScreenSort\\demoo12.png");
	    FileUtils.copyFile(src, des);
	
	
		
		
	}

}


