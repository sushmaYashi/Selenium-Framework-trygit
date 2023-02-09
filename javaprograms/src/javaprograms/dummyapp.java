package javaprograms;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dummyapp {
	
	public static WebDriver driver;
	public static void setup(String application)
	{
	WebDriverManager.chromedriver().setup();
	driver.get(application);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		

}
	
	public static void ElementListUsage() {
		
		String value="";
		System.out.println("Printing elements from the row");
		List<WebElement> precedingitems = driver.findElements(By.xpath("\r\n" + 
				"//*[contains(text(),'Indus Towers')]/parent::td/ancestor::tr/preceding-sibling::tr"));
		
		Iterator<WebElement> itr = precedingitems.iterator();
		while(itr.hasNext())
		
		{
			WebElement ele = itr.next();
			value = ele.getText();
			System.out.println(value);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String application = "https://money.rediff.com/gainers/bse/daily/groupa";
		setup(application);
		ElementListUsage();
		
	}
	
}