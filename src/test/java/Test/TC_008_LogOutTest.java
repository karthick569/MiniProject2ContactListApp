package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.HomePage;

public class TC_008_LogOutTest extends ProjectSpecificationsMethods {

	@BeforeTest
	public void setup ()
	{
		testName = "Logout Test";
		testDescription = "Testing the Contact Editing Functionality";
		testAuthor = "Karthick";
		testCategory = "System Testing";
	}
	
	@Test (priority=7)
	public void LogOutTest()
	{
        HomePage obj = new HomePage (driver);
        obj.logoutvalidation();
       

	}

}
