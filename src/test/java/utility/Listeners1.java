package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BestTest;
 
public class Listeners1 extends BestTest implements ITestListener{
    ScreenShot sc;
	public void onTestFailure(ITestResult result) {
		sc=new ScreenShot(); 
		sc.capturescreenshot(driver,result.getMethod().getMethodName()+".png");
	}
	
	
	
}
