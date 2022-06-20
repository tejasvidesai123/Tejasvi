package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public void capturescreenshot(WebDriver driver,String filename ) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(sourceFile,new File("./Suraj/"+filename));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Screenshot saved successfully");
				
		}
}
