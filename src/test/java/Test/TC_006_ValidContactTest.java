package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.AddContactPage;

public class TC_006_ValidContactTest extends ProjectSpecificationsMethods {

	@BeforeTest
	public void setup ()
	{
		testName = "ValidContact Test";
		testDescription = "Testing the valid Contact Adding Functionality";
		testAuthor = "Karthick";
		testCategory = "System Testing";
	}
	
	@Test  (priority=5)
	public void ValidcontactTest() throws InterruptedException
	{
        AddContactPage obj = new AddContactPage(driver);
        obj.validcontactaddition1();
        obj.validcontactaddition2();
        obj.validcontactaddition3();
        obj.alphabeticalordervalidation();
        obj.misseddatavalidation();
        obj.wrongdatevalidation();
        obj.contactdisplayvalidation();

	}

}
