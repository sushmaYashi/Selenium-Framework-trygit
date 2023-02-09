package Page;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assign2  {
	
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		String application = "https://www.facebook.com/";
		
		setup(application);
		
		fillForm();
	}
	
	public static void setup(String application)
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get(application);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		

}
	public static void fillForm()
	{
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 WebDriverWait wait = new WebDriverWait(driver,100);
		 WebElement surname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]"));
		 
		// wait.until(ExpectedConditions.visibilityOfElementLocated(surname));
		 surname.sendKeys("dsdsad");
		 
		 
	}
	
	
}