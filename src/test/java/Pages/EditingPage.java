package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;

public class EditingPage extends ProjectSpecificationsMethods
{
	public EditingPage  (WebDriver driver)
	{EditingPage.driver=driver;}
	
	@BeforeClass
	public EditContact contacteditingvalidation()
	{
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("https://thinking-tester-contact-list.herokuapp.com/contactDetails"))
		{  System.out.println("The page is redirected to the contactdetais page"); }
		else	
		{ System.out.println("The page is not redirected to the contactdetais page");}
		
		driver.findElement(By.xpath("//button[contains(@id,'edit')]")).click();
		return new EditContact(driver);
	}
	 
	@BeforeClass
	public ContactListPage aftereditingvalidation () throws InterruptedException
	{   Thread.sleep(10);
		String bvcityname = driver.findElement(By.xpath("//span[@id='city']")).getText();
		String avcityname =  driver.findElement(By.xpath("//span[@id='city']")).getText();
		if(bvcityname.equals(avcityname))
		{     System.out.println("The other fields are not affected");   }
		else
		{     System.out.println("The other fields are affected");   }
		
	WebElement contactlistbutton =	driver.findElement(By.xpath("//button[@id='return']"));
	contactlistbutton.click();
	return new ContactListPage(driver);
		
	}
	
	@BeforeClass
	public ContactListPage contactdeletevalidation() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='delete']")).click();
		Thread.sleep(10);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ContactListPage(driver);
	}
	
	
}












