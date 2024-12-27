package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;

public class AddUserPage extends ProjectSpecificationsMethods
{
	public AddUserPage (WebDriver driver)
	{AddUserPage.driver=driver;}
	
	@BeforeClass
	public ContactListPage signup() throws InterruptedException
	{   
		Thread.sleep(10);
		if ( driver.getCurrentUrl().equals("https://thinking-tester-contact-list.herokuapp.com/addUser"))
		{
		 System.out.println("The page redierected to the Add User Page");
		}
		else
		{ 
			System.out.println("The page is not redierected to the Add User Page");
		}
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rajesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("L");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajesh96@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rajesh3");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		 return new ContactListPage(driver);
	}
	
}
