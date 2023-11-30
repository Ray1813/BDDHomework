package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;

	public void initDriver() {

		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");

		driver = new EdgeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	
	public void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy_HHmmss");
		
		String label = formatter.format(date);
		
		File fileDestination = new File(System.getProperty("user.dir") + "/Screenshot/" + label + ".png");
		
		try {
			FileUtils.copyFile(sourceFile, fileDestination);
		} catch (IOException e) {
			e.printStackTrace();
			


		}
	}

	public int generateRandomNum(int boundryNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundryNum);
		return generatedNum;
	}
}

