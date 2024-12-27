package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationsMethods;


public class HomePage extends ProjectSpecificationsMethods
{
	public HomePage (WebDriver driver)
	{
	 HomePage.driver = driver;
	}
	@BeforeClass
    public AddUserPage signupvalidation ()
    {
    	boolean signupbutton = driver.findElement(By.xpath("//button[@id='signup']")).isEnabled();
    	{ System.out.println( "Is the SignUp button is displayed and enabled -"+" "+signupbutton);}
        driver.findElement(By.xpath("//button[@id='signup']")).click();
    	 return new AddUserPage(driver);
    }
    @BeforeClass
    public ContactListPage validloginvalidation()
    {
    	boolean loginbutton = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
    	{System.out.println("Is the login button is displayed and ennabled -"+loginbutton);}
    	driver.findElement(By.xpath("//button[@id='submit']")).click();
    	
    	return new ContactListPage(driver);
    }
    @BeforeClass
    public HomePage invalidloginvalidation()
    {
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prasanth97gmail.com");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("prasanth7");
    	driver.findElement(By.xpath("//button[@id='submit']")).click();
    	
    	String actualmsg = driver.findElement(By.xpath("//span[@id='error']")).getText();
    	String expectedmsg = "Incorrect username or password";
    	if (actualmsg==expectedmsg)
    	{
    		System.out.println("App restricted to enter with invalid credentials");
    	}
    	else 
    	{
    		System.out.println("App does not restricted to enter with invalid credentials");
    	}
    	return this ;
    }
    @AfterClass
    public HomePage logoutvalidation()
    {
    	driver.get("https://thinking-tester-contact-list.herokuapp.com/contactList");
    	driver.findElement(By.xpath("//button[@id='logout']")).click();
    	String currentUrl = driver.getCurrentUrl();
    	Assert.assertEquals(currentUrl, "https://thinking-tester-contact-list.herokuapp.com/");
    	return this;
    }
}
