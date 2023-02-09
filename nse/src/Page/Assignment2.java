
/*Scenario:
Open a Chrome browser.
Navigate to “http://www.fb.com”
Verify that the page is redirected to “http://www.facebook.com”, by getting the current URL. (use if-else condition to verify this condition or use Assert.assertequals() in case you are familiar with TestNG or JUnit)
Verify that there is a “Create an account” section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, “Re-enter mobile number”, new password.
Update the date of birth in the drop-down.
Select gender.
Click on “Create an account”.
Verify that the account is created successfully.
*/
package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	
	public static WebDriver driver;
	
	public static void main (String[] args)
	{
		String application="https://www.facebook.com/";
		setupBrowser(application);
		enterform();
		
	}
	
	public static void setupBrowser(String application)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(application);
		driver.manage().window().maximize();
		/*Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		String url= driver.getCurrentUrl();
	    System.out.println("Navigated to current url: "+ url);
	    
	
	 System.out.println("Navigated to current url: "+ url);*/
	
	}
public static void enterform()
{
	
	 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

	//driver.switchTo().activeElement().sendKeys("new");
	//WebElement signupText = driver.findElement(By.xpath("//div[text()='Sign Up']"));
	//WebDriverWait wait = new WebDriverWait(driver, 500);
	//wait.until(ExpectedConditions.visibilityOf(signupText));

	/*WebElement userName = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
	WebElement reg_email = driver.findElement(By.xpath("//*[@name='reg_email__']"));
	
	
	userName.sendKeys("sushmao");
	lastname.sendKeys("lastname");
	reg_email.sendKeys("sushma_lastname");
	
	
	
	
	
	WebElement reg_passwd = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));*/
	
	
	///reg_passwd.sendKeys("sushma@12345");
	
	
	
	
	
	driver.switchTo().activeElement().sendKeys("pleaseenter");
	
	driver.findElement(By.name("firstname")).sendKeys("Test");
	driver.findElement(By.name("lastname")).sendKeys("User");
	driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
	
	Select selDate = new Select(driver.findElement(By.id("day")));
	Select selMonth = new Select(driver.findElement(By.id("month")));
	Select selYear = new Select(driver.findElement(By.id("year")));
	
	selDate.selectByVisibleText("21");
	selMonth.selectByVisibleText("Jun");
	selYear.selectByVisibleText("1989");
	

	WebElement female_ID = driver.findElement(By.xpath("//*[text()='Female']"));
	female_ID.click();
	WebElement signup_button = driver.findElement(By.xpath("//button[@id='u_o_s_id']"));
	signup_button.click();


}


	

}
