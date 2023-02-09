package Page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	
	public static WebDriver driver;
	
	
	public static void main(String args[])
	
	{
	String appUrl= "https://www.ebay.com/";
	Setup(appUrl);
	searchProduct();		
	
		
		
	}

	private static void searchProduct() {
		// TODO Auto-generated method stub
		
		WebElement item = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		item.sendKeys("Apple");
		
		
	//WebElement selectCategory = driver.findElement(By.)
		Select selectcategory = new Select(driver.findElement(By.xpath("//div[@id='gh-cat-box']//select[1]")));
				selectcategory.selectByVisibleText("Cell Phones & Accessories");
		WebElement searchButton = driver.findElement(By.xpath("//input[@id ='gh-btn']"));
		
		searchButton.click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 500);

	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='All Listings Current view']")));
	*/
	 waitForSeconds(3);
		WebElement results= driver.findElement(By.xpath("//h1[text()='+ results for ']"));
		WebElement results1= driver.findElement(By.tagName("h1"));
		System.out.println("results Printed as : "+results1.getText());
		
		WebElement fivthelement = driver.findElement(By.xpath("//div[@id='srp-river-results']/ul/li[5]"));
		System.out.print("fivthelement"+'\n'+fivthelement.getText());
		
		
		
		
		List <WebElement> testresults = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul[1]/li//div[@class='s-item__title']"));
		System.out.println('\n'+testresults.size());
		
		Iterator itr = testresults.iterator();
	Actions action = new Actions(driver);
	while(itr.hasNext())
	{
	 WebElement ele = (WebElement) itr.next();
	 action.moveToElement(ele).build().perform();
	 System.out.println('\n'+ele.getText());
	// System.out.println('\n'+ele.getAttribute("href"));
	}
				
	
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
