package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestingPOM {
	WebDriver driver;
	Actions act;
	
	public InvestingPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@dir=\"ltr\"][@class=\"last-price-value js-streamable-element\"]")WebElement Stock;
	
	public double getInStockVal()
	{
		String val=Stock.getText();
		double value=Double.parseDouble(val);
		return value;
	}
	public void openInvesting()
	{
		driver.navigate().to("https://www.bing.com/ck/a?!&&p=2863ee8b9932464dJmltdHM9MTcwNjc0NTYwMCZpZ3VpZD0wNTMxM2ZkYi05YWY1LTY3NjQtMzMzYi0yYzQ0OWIyNzY2MTQmaW5zaWQ9NTI0MA&ptn=3&ver=2&hsh=3&fclid=05313fdb-9af5-6764-333b-2c449b276614&psq=get+cognizant+stock+prize+for+every+month+in+2023&u=a1aHR0cHM6Ly9pbi5pbnZlc3RpbmcuY29tL2VxdWl0aWVzL2NvZ25pemFudC10ZWNobm9sb2d5LXNvbHV0aW8taGlzdG9yaWNhbC1kYXRh&ntb=1");
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	@FindBy(xpath="//*[@class=\"js-dropdown-display select\"]")WebElement selectDate;
	public void pressDate()
	{
		selectDate.click();
	}
	@FindBy(xpath="//*[text()=\"One Quarter\"]")WebElement oneQuater;
	public void clickOneQuater()
	{
		oneQuater.click();
	}
//	@FindBy(xpath="//*[@class=\"select js-date-from\"]")WebElement fromDate;
//	public void setFromDate()
//	{
//		act=new Actions(driver);
//		fromDate.click();
//		act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).perform();
//		act.keyDown(Keys.BACK_SPACE).perform();
//		fromDate.click();
//		fromDate.sendKeys("01/01/2023");
//	}
//	@FindBy(xpath="//*[@class=\"select js-date-to\"]")WebElement toDate;
//	public void setToDate()
//	{
//		toDate.click();
//		act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).perform();
//		act.keyDown(Keys.BACK_SPACE).perform();
//		toDate.click();
//		toDate.sendKeys("01/01/2024");
//	}
	@FindBy(xpath="//*[@class=\"js-apply-button common-button\"]")WebElement Apply;
	public void pressApply()
	{
		Apply.click();
	}
	By rowSize=By.xpath("//tr[@class=\"common-table-item u-clickable\"]");
	
	public int getRows()
	{
		List<WebElement> r=driver.findElements(rowSize);
		return r.size();
	}
	public String getDate(int r)
	{
		return driver.findElement(By.xpath("//tr[@class=\"common-table-item u-clickable\"]["+r+"]//td[1]")).getText();
	}
	
	public double getStockValue(int r)
	{
		String value=driver.findElement(By.xpath("//tr[@class=\"common-table-item u-clickable\"]["+r+"]//td[2]")).getText();
		double price=Double.parseDouble(value);
		return price;
	}
	//xpath for selecting date button //*[@class="js-dropdown-display select"]
	//xpath for datepicker from //*[@class="select js-date-from"]
	//xpath for datepicker to   //*[@class="select js-date-to"]
	//xpath for aplly button //*[@class="js-apply-button common-button"]
	//xpath for getting the the year stocks //tr[@class="common-table-item u-clickable"]
	//xpath for getting date //tr[@class="common-table-item u-clickable"]["+r"]//td[1]
	//xpath for getting stock prize //tr[@class="common-table-item u-clickable"]["+r"]//td[2]

}
