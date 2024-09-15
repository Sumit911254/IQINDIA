package takesscreensort;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotBYTE64 {
	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		String path="C:\\Users\\Sumit Kumar\\eclipse-workspace\\App1\\ScreenSort\\base.png";
		driver.get("https://www.youtube.com/watch?v=eas6e321o_s&t=955s");
		FileOutputStream fos =new FileOutputStream(path);
		String Base64Code =ts.getScreenshotAs(OutputType.BASE64);
		byte[]bytearr=Base64.getDecoder().decode(Base64Code);
		
	   fos.write(bytearr);
		
		
		
		
		
	}

}
