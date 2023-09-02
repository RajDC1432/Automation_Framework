package Generic_Hyb;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot1 extends G1_hyb
{
	public void getphoto(WebDriver driver) throws IOException
	{
		String photo="./Photos";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replace(":", "-");
	TakesScreenshot t=(TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dst= new File("./merephoto/fb.jpg");
	FileHandler.copy(src, dst);
	}
}
