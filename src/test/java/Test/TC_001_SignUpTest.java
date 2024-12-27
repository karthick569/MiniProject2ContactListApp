package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.HomePage;

public class TC_001_SignUpTest extends ProjectSpecificationsMethods{
     
	@BeforeTest
	public void setup ()
	{
		testName = "SignUp Test";
		testDescription = "Testing the SignUp Functionality";
		testAuthor = "Karthick";
		testCategory = "Smoke Testing";
	}
	
	
	@Test (priority = 0)
	public void SignUpTest()
	{
        HomePage obj = new HomePage (driver);
        obj.signupvalidation();
        obj.closeBrowser();

	}

}
