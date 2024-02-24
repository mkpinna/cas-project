package CASPROJECT;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AcronymPom;
import PageObjects.BeCtsPOM;
import ScreenShot.TakeScreenshot;
import Utilities.ExcelUtil;

public class TC03 extends BasePage{
	BeCtsPOM obj;
	AcronymPom obj2;
	XSSFRow k1;
	  @Test
	  public void checkAcronym() throws IOException
	  {
		  obj=new BeCtsPOM(driver);
		  obj2=new AcronymPom(driver);
		  obj.pressCompany();
		  obj.selectAcronym();
		  boolean check1=obj2.checkAvailibity(obj2.acr);
		  Assert.assertEquals(check1,true);
		  int count=obj2.getSize();
		  for(int i=1;i<=count;i++)
		  {
			  k1 = ExcelUtil.createRow(i);
			  for(int j=1;j<=2;j++) {
			  String data=obj2.getValue(i,j);
			  System.out.println(data);
			  System.out.print("    "); 
			  ExcelUtil.setData(k1, j, data);

		  }   
			  System.out.println();
			  }
		  for(int i=1;i<=count;i+=9)
		  {
			  WebElement acro=driver.findElement(By.xpath("//tr["+i+"]"));
			  JavascriptExecutor js =(JavascriptExecutor)driver;
			  js.executeScript("arguments[0].scrollIntoView();", acro);
			  TakeScreenshot.Screenshot(i,driver);
		  } 
		  
	  }
}
