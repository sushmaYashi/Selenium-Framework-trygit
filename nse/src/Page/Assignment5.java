package Page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {
	
	public static WebDriver driver;
	
	
	public static void main(String args[])
	
	{
	
	String appUrl= "http://www.snapdeal.com";
	Setup(appUrl);
	signin();		
	
		
		
	}


	private static void signin() {
		// TODO Auto-generated method stub
		
		WebElement signinButton = driver.findElement(By.xpath("//div[contains(@class,'myAccountTab accountHeaderClass')]//div"));
		WebElement login = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		WebElement validuser = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@id='checkUser']"));
		waitForSeconds(1);
		signinButton.click();
		Actions action = new Actions(driver);
		action.moveToElement(signinButton).build().perform();
		login.click();
		waitForSeconds(1);
		validuser.sendKeys("9701079191");		continueButton.click();
	}


	private static void Setup(String appUrl) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get(appUrl);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	
	}
	
	public static void waitForSeconds(int sec)
	{
		try {
			Thread.sleep(sec*1000);
			}
		catch(InterruptedException e){}
	}



}
