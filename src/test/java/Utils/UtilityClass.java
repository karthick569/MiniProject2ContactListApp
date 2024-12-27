package Utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class UtilityClass 
{
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testCategory, testAuthor;

	@BeforeMethod
	public void BrowserLaunch()
	{
		 driver = new ChromeDriver();
		 driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
    public static String screenshot (String name) throws IOException
    {
    	String path = "C:\\Users\\hey\\eclipse-workspace\\MiniProject2ContactListApp\\Snap"+name+".png";
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dest = new File(path);
    	FileUtils.copyFile(src, dest);
    	return path;
    }
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
