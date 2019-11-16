package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	private static final TimeUnit unit = null;
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		//Chrome
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rajkumar\\Mavenjava\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
		//Firefox
	    }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
     }

	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("C:\\test\\"+result+"screenshot.png"));
		
		
	}
}