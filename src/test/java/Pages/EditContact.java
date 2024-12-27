package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;

public class EditContact extends ProjectSpecificationsMethods
{
	
	public EditContact (WebDriver driver)
	{EditContact.driver=driver;}
	
	@BeforeClass
	public EditingPage editingexistingcontacts() throws InterruptedException
	{   Thread.sleep(15);
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("RamKarthick");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramkarthick49@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).clear();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9042543211");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		return new EditingPage(driver);
	}
	
	
	
	

}
