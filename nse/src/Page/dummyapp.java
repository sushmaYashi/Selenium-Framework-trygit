package Page;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
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
	 driver = new ChromeDriver();
	driver.get(application);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		

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
	
	
	
	
	
	public static void windowsHandling()
	{
		String parentWindow="";
		String childwindow="";
		
		WebElement clickchild1= driver.findElement(By.xpath("//span[@title='Remote']"));
		WebElement clickchild2= driver.findElement(By.xpath("//a[@title='Remote']/following-sibling::a[1]"));
		WebElement clickchild3= driver.findElement(By.xpath("//a[@title='Remote']/following-sibling::a[2]"));
		
		parentWindow = driver.getWindowHandle();
		
		clickchild1.click();
		clickchild2.click();
		clickchild3.click();

		Set noOfWindows = driver.getWindowHandles();
		Iterator <String> itr = noOfWindows.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			if(!parentWindow.equalsIgnoreCase(temp))
			{
				driver.switchTo().window(temp);
			   System.out.println(driver.switchTo().window(temp).getTitle()+'\n');
			  // driver.close();
			} 
			   else
			   {
				   driver.switchTo().window(temp);
				   System.out.println('\n'+"Parent window: "+driver.switchTo().window(temp).getTitle()+'\n');
			   }
			driver.switchTo().defaultContent();
		
			
		}
		
		driver.close();
		
	}
	
	public static void usageofHashMaps()
	{
		List<WebElement> company= driver.findElements(By.xpath("//*[contains(text(),\"One97 Communications\")]/parent::td/ancestor::tr/preceding-sibling::tr"));
		int i=1;
		Iterator<WebElement> itr = company.iterator();
		HashMap<String,String> elementValues = new HashMap<String,String>();
		while (itr.hasNext())
		{
		WebElement ele = itr.next();
		String value = ele.getText();
		elementValues.put("Element "+ i, value);
	i++;
		}
	displayhashkeypair(elementValues);	
	}
	
	
	
	
	
	
	
	private static void displayhashkeypair(HashMap<String, String> elementValues) {
		// TODO Auto-generated method stub
	Set<Entry<String , String>> elementset = elementValues.entrySet();
	Iterator< Entry<String, String>>	itr= elementset.iterator();
	
	while (itr.hasNext())
	{
		Entry<String, String> ele = itr.next();
		System.out.println("Key: "+ ele.getKey()+ "Value: "+ele.getValue());
		
		
	}
	
		
		
	}

	public static void main(String[] args) {
		
		String application = "https://money.rediff.com/gainers/bse/daily/groupa";
		setup(application);
//			ElementListUsage();
//		String application1 = "https://www.naukri.com/";
//		setup(application1);
//		windowsHandling();
		usageofHashMaps();
		
	
		
	}
	
}