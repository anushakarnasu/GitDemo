package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
		
	}
//get feature text from landingpage
	public WebElement getTitle()
	{
		return driver.findElement(title);
		
		
	}
	
	
}
