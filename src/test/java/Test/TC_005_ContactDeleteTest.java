package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.ContactListPage;

public class TC_005_ContactDeleteTest extends ProjectSpecificationsMethods {

	@BeforeTest
	public void setup ()
	{
		testName = "ContactDeleting Test";
		testDescription = "Testing the Contact Deleting Functionality";
		testAuthor = "Karthick";
		testCategory = "System Testing";
	}
	
	@Test  (priority=4)
	public void ContactdeleteTest()
	{
		  ContactListPage obj = new ContactListPage (driver);
		  obj.contactdelete();

	}

}
