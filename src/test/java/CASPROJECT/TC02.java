package CASPROJECT;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BeCtsPOM;
import ScreenShot.TakeScreenshot;

public class TC02 extends BasePage{
	BeCtsPOM obj;
	  @Test
	  public void VerifyUser() throws InterruptedException, IOException
	  {
		  obj=new BeCtsPOM(driver);
		  obj.pressUser();
		  TakeScreenshot.ScreenshotPage("UserPressed", driver);
		  String name=obj.getUserDetails();
		  String value="Murali Krishna, Pinna (Cognizant)";
		  Assert.assertEquals(name,value);
	  }
}
