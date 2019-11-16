package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginnnPage {

	//write all objects of login page here
	
public WebDriver driver;
	
	By email=By.cssSelector("[id='user_email']");
	By passWord=By.cssSelector("[type='password']");
	By subMit=By.cssSelector("[value='Log In']");
	
	
	public loginnnPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
		
		
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(subMit);
		
		
	}
	public WebElement getPassword()
	{
		return driver.findElement(passWord);
		
		
	}
	
}
