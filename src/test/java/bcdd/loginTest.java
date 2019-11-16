package bcdd;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import pageObjects.loginnnPage;
import resources.base;
//Adding logs
//Generating HTML
//Screenshots  on failure
//Jenkins Integration
public class loginTest extends base
{
	
	@Test(dataProvider="getData")
	public void bloginTest(String Username,String Password) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		//click on login and enter username and password in login page
		landingpage l = new landingpage(driver);
		l.getLogin().click();
		
		loginnnPage lp=new loginnnPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSubmit().click();
		
	}
		@DataProvider
		public Object[][] getData()
		{
			//Row stands for how many different data types test should run
			//column stands for how many values for each test
			Object[][] data = new Object[3][2];
			
			//0th row
			data[0][0]="aaa";
			data[0][1]="aaa";
			//1st row
			data[1][0]="bbb";
			data[1][1]="aaabb";
			//2nd row
			data[2][0]="ccc";
			data[2][1]="aaacc";
			
			return data;
					
					
		}
		
		
		
		
		
		
		
	}


