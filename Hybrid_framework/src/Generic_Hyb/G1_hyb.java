package Generic_Hyb;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class G1_hyb implements Frame_constants  
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws IOException
	{
		System.setProperty(chrome_key,chrome_value);
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dst= new File("./merephoto/fb.jpg.jpg");
	    FileHandler.copy(src, dst);
	   
		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
