package bcdd;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingpage;
import resources.base;

@Test
public class validatingTitle extends base
{
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	public void bloginTitle() throws IOException
	{
		
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		Log.info("Driver is initialized");
		//click on login and enter username and password in login page
		landingpage l = new landingpage(driver);
		//compare text from the browser with actual text..--error
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		Log.info("FEATURED COURSES is initialized");
		
		
		
		
	}

}
