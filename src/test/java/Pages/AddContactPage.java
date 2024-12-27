package Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;

public class AddContactPage extends ProjectSpecificationsMethods
{
	public AddContactPage (WebDriver driver)
	{AddContactPage.driver=driver;}
	@BeforeClass
	public AddContactPage validcontactaddition1() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("RamKumar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1995-08-11");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramkumar46@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9011543210");
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("7A,Govindha Street");
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Ramapuram");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Trichy");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("607004");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		return this;
	}
	@BeforeClass
	public AddContactPage validcontactaddition2() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1995-07-11");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar40@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9010543210");
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("7A,Aravindha Street");
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Kuppam");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Dindugal");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("607007");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		return this;
	}
	@BeforeClass
	public AddContactPage validcontactaddition3() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kishore");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1999-03-31");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kishoree40@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9005143210");
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("12B,Saroja Street");
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Odai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kancheepuram");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("607001");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		return this ;
	}
	
	@BeforeClass
	public AddContactPage alphabeticalordervalidation() throws InterruptedException
	{
		Thread.sleep(10);
		@SuppressWarnings("unchecked")
		List<WebElement> nameElements =  (List<WebElement>) driver.findElement(By.xpath ("//table/tr/td[2]"));
		List<String> initials = new ArrayList<>();
		for (WebElement element : nameElements )
		{
			String name = element.getText();
			if(!name.isEmpty())
			{
				String[] nameParts = name.split("\\s+");
				if (nameParts.length > 1)
				{
					initials.add(nameParts[1].substring(0, 1));
					
				}
			}
		}
		List<String> sortedInitials = new ArrayList<>(initials);
		Collections.sort(sortedInitials);
		Assert.assertEquals(initials, sortedInitials);
	
		return this;
		
	}
	@BeforeClass
	public AddContactPage misseddatavalidation() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(@id,'add')]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1990-07-19");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravi75@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9010846528");
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("12B, Narayana Street");
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Sangarapuram");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("607009");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(20);
		WebElement errormessage = driver.findElement(By.xpath("//span[@id='error']"));
		String actualerrormessage = errormessage.getText();
		if(actualerrormessage.contains("Contact validation failed"))
		{
			System.out.println("Contact is not added with missed details");
		}
		else
		{
			System.out.println("Contact is added with missed details");
		}
		
		return this;
	}
	
	@BeforeClass
	public void wrongdatevalidation() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(@id,'add')]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("19-07-1990");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravi75@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9010846528");
		driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("12B, Narayana Street");
		driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Sangarapuram");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("607009");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@id='submit']")).click();	
		
		Thread.sleep(20);
		WebElement errormessage = driver.findElement(By.xpath("//span[@id='error']"));
		String actualerrormessage = errormessage.getText();
		if(actualerrormessage.contains("Birthdate is invalid"))
		{
			System.out.println("Birthdate is entered in wrong format");
		}
		else
		{
			System.out.println("Birthdate is entered in correct format");
		}
		String url = "https://thinking-tester-contact-list.herokuapp.com/contactList";
		driver.navigate().to(url);
		
	}
	@BeforeClass
	public EditingPage contactdisplayvalidation() throws InterruptedException
	{   
		Thread.sleep(10);
		List<WebElement> phoneElements = driver.findElements(By.xpath("//tr/td[5]"));
		for (WebElement phoneElement : phoneElements)
		{
			String phonenumber = phoneElement.getText();
			Assert.assertTrue(phonenumber.startsWith("+91"), phonenumber);
		}
		
		driver.findElement(By.xpath("//tr//td[2]")).click();
		return new EditingPage(driver);
	}
	

	
	
	
}








