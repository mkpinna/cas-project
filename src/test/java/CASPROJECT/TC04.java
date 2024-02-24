package CASPROJECT;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BeCtsPOM;
import ScreenShot.TakeScreenshot;

public class TC04 extends BasePage{
	BeCtsPOM obj;
	  @Test
	  public void HomePageValidation() throws InterruptedException, IOException
	  {
		  obj=new BeCtsPOM(driver);
		  obj.gotoHome();
		  Thread.sleep(3000);
		  String check =obj.getTitle();
		  beCtsStockPrize=obj.getStockPrize();
		  TakeScreenshot.ScreenshotPage("StockPrize", driver);
		  Assert.assertEquals(check,"Be.Cognizant - Home");

	  }

}
