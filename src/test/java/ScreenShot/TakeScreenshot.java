package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void Screenshot(int r,WebDriver driver) throws IOException
	{
		  TakesScreenshot ts= (TakesScreenshot)driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"\\Acronyms\\"+r+".png");
		  FileUtils.copyFile(src,trg);
	}
	
	public static void ScreenshotPage(String page,WebDriver driver) throws IOException
	{
		  TakesScreenshot ts= (TakesScreenshot)driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"\\Validation\\"+page+".png");
		  FileUtils.copyFile(src,trg);
	}
	
	

}
