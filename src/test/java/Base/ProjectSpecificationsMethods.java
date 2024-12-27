package Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.UtilityClass;

public class ProjectSpecificationsMethods  extends UtilityClass
{
	 @BeforeMethod
		public void launchandloaduRL()
		{BrowserLaunch();}
		
	    @AfterMethod
		public void browserClose()
		{closeBrowser();}

	    @BeforeSuite
		public void ReportInitialization ()
		{
			String path = "C:\\Users\\hey\\eclipse-workspace\\MiniProject2ContactListApp\\Reports";
			ExtentSparkReporter reporterobj = new ExtentSparkReporter(path);
			reporterobj.config().setReportName("MiniProject2ContactListAppReport");
			
			extent = new ExtentReports();
			extent.attachReporter(reporterobj);
		}
	    
	    @BeforeClass
		public void testdetails()
		{

			test = extent.createTest(testName, testDescription);
			test.assignCategory(testCategory);
			test.assignAuthor(testAuthor);
		}
	  
	    
	    @AfterSuite
	    public void reportClose ()
	    {
	    	extent.flush();
	    }
			
	}
	
	

