package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcronymPom {
	WebDriver driver;
	
	public AcronymPom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@title=\"Acronyms\"]")
	public WebElement acr;
	
	public boolean checkAvailibity(WebElement ele)
	{
		return ele.isDisplayed();
	}
	
	By size=By.tagName("tr");
	
	public int getSize()
	{
		List <WebElement> li=driver.findElements(size);
		int len=li.size();
		return len;
		
	}
	
	//This Action is done to get the text from 
	public String getValue(int i,int j)
	{
		String data=driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
		return data;
	}
}
