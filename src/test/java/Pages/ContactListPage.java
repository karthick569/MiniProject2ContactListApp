package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;

public class ContactListPage extends ProjectSpecificationsMethods
{

	public ContactListPage (WebDriver driver)
	{ContactListPage.driver=driver;}
	
	@BeforeClass
	public AddContactPage contactaddition() throws InterruptedException
	{   
		Thread.sleep(10);
		if (driver.getCurrentUrl().equals("https://thinking-tester-contact-list.herokuapp.com/contactList"))
		{System.out.println("The Page is redierected to the contact list with valid details");}
		else
		{System.out.println("The Page is not redierected to the contact list with valid details");}
		
		WebElement addcontact = driver.findElement(By.xpath("//button[@id=\"add-contact\"]"));
		Actions mouse = new Actions (driver);
		mouse.click(addcontact).perform();
		return new AddContactPage(driver);
	}
	
	@BeforeClass
	public EditingPage contactdelete()
	{
		driver.findElement(By.xpath("//div/table/tr/td[2]")).click();
		return new EditingPage(driver);
	}
	@BeforeClass
	public HomePage logoutbutton()
	{
		WebElement logoutbutton = driver.findElement(By.xpath("//button[@id='logout']"));
		Assert.assertTrue(logoutbutton.isDisplayed());
		logoutbutton.click();
		return new HomePage(driver);
	}
	
}
