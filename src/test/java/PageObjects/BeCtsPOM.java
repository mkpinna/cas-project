package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeCtsPOM {
	WebDriver driver;
	
	public BeCtsPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="passwd") WebElement pwd;
	
	public void sendpass()
	{
		pwd.sendKeys("Sriram@#2023");
	}
	
	@FindBy(id="idSIButton9")WebElement button;
	
	public void pressLoginButton()
	{
		 button.click();
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	@FindBy(xpath="//div[@class = 'ohcfXYh6LUBy5DS5kNUjRQ==']")WebElement user;
	
	public void pressUser()
	{
		user.click();
	}
	@FindBy(xpath="//div[@id=\'mectrl_currentAccount_primary\']")WebElement userName;
	
	public String getUserDetails()
	{
		return userName.getText();
	}
	@FindBy(xpath="//button[@name=\"Company\"]")WebElement company;
	
	public void pressCompany()
	{
		company.click();
	}
	
	@FindBy(xpath="//ul[@role = 'presentation']/li[2]//a")WebElement pressAcr;
	
	public void selectAcronym()
	{
		pressAcr.click();
	}
	
	@FindBy(xpath="//*[@name=\"be.cognizant\"]")WebElement home;
	public void gotoHome()
	{
		home.click();
	}
	

	
	By stockValue=By.xpath("//*[@id=\"vpc_WebPart.pnpStockInformation.external.5b8c6db2-f462-40aa-9cfe-6e64d258595f\"]/div/div/div/div/div[1]/div[1]");
	//@FindBy(className="stockValue_60e60a8c")WebElement stockValue;
	
	public double getStockPrize() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		Thread.sleep(5000);
		WebElement seeall=driver.findElement(By.xpath("//*[text()=\"See all\"]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",seeall);
		WebElement stockValue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vpc_WebPart.pnpStockInformation.external.5b8c6db2-f462-40aa-9cfe-6e64d258595f\"]/div/div/div/div/div[1]/div[1]")));
		String val=stockValue.getText();
		double value=Double.parseDouble(val);
		return value;
	}


	




	
	
}
