package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.AddContactPage;
import Pages.ContactListPage;

public class TC_004_ContactAddtionTest extends ProjectSpecificationsMethods {

	@BeforeTest
	public void setup ()
	{
		testName = "ContactAddition Test";
		testDescription = "Testing the LogIn Functionality";
		testAuthor = "Karthick";
		testCategory = "System Testing";
	}
	
	@Test  (priority=3)
	
	public void ContactaddititonTest () throws InterruptedException
	{
        ContactListPage obj = new ContactListPage (driver);
        obj.contactaddition();
        obj.contactdelete();
        AddContactPage obj1 = new AddContactPage(driver);
        obj1.validcontactaddition1();
        obj1.validcontactaddition2();
        obj1.validcontactaddition3();
        obj1.alphabeticalordervalidation();
        obj1.misseddatavalidation();

	}

}
