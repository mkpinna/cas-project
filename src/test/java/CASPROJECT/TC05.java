package CASPROJECT;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.InvestingPOM;
import ScreenShot.TakeScreenshot;

public class TC05 extends BasePage{
	InvestingPOM obj3;
	
	  @Test
	  public void validateInvestingHome() throws InterruptedException, IOException
	  {
		  obj3=new InvestingPOM(driver);
		  obj3.openInvesting();
		  TakeScreenshot.ScreenshotPage("InvestingHomePage", driver);
		  String tit=obj3.getTitle();
		  Assert.assertEquals(tit,"Cognizant (CTSH) Historical Prices - Investing.com India");	  
}
}
