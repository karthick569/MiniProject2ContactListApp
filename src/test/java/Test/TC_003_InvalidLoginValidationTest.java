package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.HomePage;

public class TC_003_InvalidLoginValidationTest extends ProjectSpecificationsMethods {

	
	@BeforeTest
	public void setup ()
	{
		testName = "InValidLogIn  Test";
		testDescription = "Testing the LogIn Functionality";
		testAuthor = "Karthick";
		testCategory = "Smoke Testing";
	}
	
	
	@Test  (priority=2)
	public void InavalidloginTest()
	{
		 HomePage obj = new HomePage (driver);
		 obj.invalidloginvalidation();

	}

}
