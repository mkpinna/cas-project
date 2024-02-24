package CASPROJECT;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.InvestingPOM;

public class TC06 extends BasePage{
	InvestingPOM obj3;
	  @Test
	  public void stockValidation()
	  {
		  obj3=new InvestingPOM(driver);
		  investingStockPrize=obj3.getInStockVal();
		  System.out.println(beCtsStockPrize+" "+ investingStockPrize);
		  Assert.assertEquals(investingStockPrize,beCtsStockPrize);
	  }
	  
}
