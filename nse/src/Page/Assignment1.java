package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static WebDriver driver;
	public  static void assignone()
	{
		System.out.println("dsasdsadasdsada");
		System.out.println(driver.getTitle());
	String title ="QA Automation Tools Trainings and Tutorials | QA Tech Hb";	
	String expected = driver.getTitle();
	
	///Hard Asserts- which stops exection when failed////
	/*Assert.assertEquals(title,expected );
	System.out.println("Pass "+driver.getTitle());*/
	
	/////SoftAsserts - continues to execute een though assertion fails//////
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(title, expected);
	System.out.println("failed but executed with error ");
	sa.assertEquals("QA Automation Tools Trainings and Tutorials | QA Tech Hub", expected);
	System.out.println("Pass "+driver.getTitle());
	
	
	}
	public static void setup(String application)
	{
				//WebDriverManager.chromedriver().setup();
		// WebDriverManager.edgedriver().setup();
		//driver= new EdgeDriver();
//		WebDriverManager.iedriver().setup();
//		driver = new iedriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(application);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		

		
	}
	
	
	
	
	public static void navigatetoFB()
	{
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.println("Current URL:" + driver.getCurrentUrl());
		System.out.println("Naviagted to FB");
		driver.navigate().back();
		System.out.println("Naviagted to back");
		System.out.println("Current URL:" + driver.getCurrentUrl());
		driver.navigate().forward();System.out.println("Naviagted to forward");
		System.out.println("Current URL:" + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().forward();System.out.println("Naviagted to refresh");
		System.out.println("Current URL:" + driver.getCurrentUrl());
		driver.close();
	}
	
	public static void main(String[] args)

	{
		String application= "http://qatechhub.com";
		setup(application);
		assignone();
		navigatetoFB();
		
		
	}

}
