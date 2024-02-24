package CASPROJECT;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utilities.ExcelUtil;

public class BasePage {
	public static WebDriver driver;
	public static double beCtsStockPrize;
	public static double investingStockPrize;
	
	 @BeforeTest
	  @Parameters({"browser"})
	  public void beforeClass(String br) throws InterruptedException, FileNotFoundException {
		  if(br.equals("chrome"))
			  driver=new ChromeDriver();
		  else if(br.equals("edge"))
			  driver=new EdgeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.navigate().to("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		  driver.manage().window().maximize();
		  ExcelUtil.excelInit();
	  }
	  @AfterTest
	  public void afterClass() throws IOException {
		  ExcelUtil.closeExcel();
		  driver.quit();
	  }


}
