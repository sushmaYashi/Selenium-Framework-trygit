package Page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment3 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		String application = "https://flipkart.com";
		
		setup(application);
		countlink();
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
	public static void countlink() throws InterruptedException 
	{
	
	    driver.findElement(By.xpath("//div[@class='_2QfC02']//button")).click();
	    
	    List<WebElement> ele = driver.findElements(By.tagName("a"));
	    System.out.println("Size of links"+ele.size());
	    Iterator itr = ele.iterator();
	    while (itr.hasNext())
	    {
	    	WebElement link =  (WebElement) itr.next();
	    	String value = link.getText();
			System.out.println('\n'+value);
			System.out.println('\n'+link.getAttribute("href"));
			System.out.println('\n'+"========================================================");
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	}
	
	
	
	
}
