package CASPROJECT;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.BeCtsPOM;
import ScreenShot.TakeScreenshot;

public class TC01 extends BasePage{
	BeCtsPOM obj;
	  @Test
	  public void Login() throws InterruptedException, IOException
	  {
		  obj=new BeCtsPOM(driver);
		  
		  try
		  {
		  obj.sendpass();
		  obj.pressLoginButton();
		  Thread.sleep(10000);
		  obj.pressLoginButton();
		  }
		  catch(Exception e)
		  {
			  System.out.println("No Login Page Loaded");
		  }
		  TakeScreenshot.ScreenshotPage("HomePage", driver);
		  String check =obj.getTitle();
		  Assert.assertEquals(check,"Be.Cognizant - Home");
	  }

}
