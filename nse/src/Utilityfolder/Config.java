package Utilityfolder;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Config {
	public static Properties properties;
	public static WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	
	public static final String reportPath =".\\Reports\\testResults.html";

	public static String config(String property) throws Exception{
        try {
            properties = new Properties();
            FileInputStream reader = new FileInputStream(System.getProperty("user.dir")+"\\nse\\src\\Utilityfolder\\config.properties");
            properties.load(reader);
            
        } catch (Exception e) {
            e.printStackTrace();
            
            //throw new RuntimeException("config.properties not found at " + propertiesFilePath);
        }
        return properties.getProperty(property);
    }
	
	
	
	
	
	
	public static WebDriver getBrowser(String browser)throws Exception{
        if(browser == "chrome"){
           System.setProperty("webdriver.chrome.driver",config("chromeDriverPath"));
        	driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(config("url"));
        }else if( browser == "firefox"){
            System.setProperty("webdriver.gecko.driver",config("fireFoxDriverPath"));
            driver =new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(config("url"));
        }else if(browser == "IE"){
            System.setProperty("webdriver.ie.driver",config("ieDriverPath"));
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get(config("url"));
        }
        return driver;
    }
	
	public static ExtentReports getExtent(){
        extent = new ExtentReports();
        extent.attachReporter(getHtmlReporter());
        return extent;
    }

    private static ExtentHtmlReporter getHtmlReporter() {
        htmlReporter = new ExtentHtmlReporter(reportPath);
        return htmlReporter;
    }

    public static ExtentTest createTest(String name, String description){
        test = extent.createTest(name, description);
        return test;
    }

	
	public static void tearDown() {
		driver.close();
	}

}
