package bcdd;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;


public class listeners implements ITestListener {
	base b = new base();
	
	public void onTestFailure(ITestResult result)
	{
		;
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
