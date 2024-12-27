package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationsMethods;
import Pages.EditContact;
import Pages.EditingPage;

public class TC_007_EditingContactsTest extends ProjectSpecificationsMethods {

	
	@BeforeTest
	public void setup ()
	{
		testName = "Editing Contact Test";
		testDescription = "Testing the Contact Editing Functionality";
		testAuthor = "Karthick";
		testCategory = "System Testing";
	}
	
	@Test  (priority=6)
	public void EditingContactTest() throws InterruptedException 
	{
		EditContact obj = new EditContact(driver);
		EditingPage obj1 = new EditingPage (driver);
		obj.editingexistingcontacts();
		obj1.contacteditingvalidation();
		obj1.aftereditingvalidation();
		obj1.contactdeletevalidation();
		
	}

}
