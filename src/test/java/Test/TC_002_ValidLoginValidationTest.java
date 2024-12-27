package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationsMethods;
import Pages.HomePage;

public class TC_002_ValidLoginValidationTest extends ProjectSpecificationsMethods{
     
	@BeforeTest
	public void setup ()
	{
		testName = "ValidLogIn  Test";
		testDescription = "Testing the LogIn Functionality";
		testAuthor = "Karthick";
		testCategory = "Smoke Testing";
	}
	
	
	@Test (priority=1)
	public void ValidloginTest() 
	{
		 HomePage obj = new HomePage (driver);
         obj.validloginvalidation();

	}

}
