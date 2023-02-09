package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import org.testng.ITestResult;
//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utilityfolder.Config;



@CucumberOptions(features = "./features",
        glue = {"StepDef"},
        tags={"@Testing"},
        plugin = {"pretty" ,"html:target/site/cucumber-pretty" ,
        "json:target/cucumber.json" ,
       "junit:Folder_Name/cucumber.xml"},
        monochrome = true)
public class TestRunner{
    private TestNGCucumberRunner testNGCucumberRunner;
    
    
    @BeforeSuite(alwaysRun = true)
    public void startReport() {
        Config.getExtent();
           }

    @AfterSuite(alwaysRun = true)
    public void endReport()
    {
       Config.extent.flush();
    }
    
   
    @AfterMethod
    public void getResult(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE) {
            Config.test.log(Status.FAIL, "Test Case Failed :" + result.getName());
            Config.test.log(Status.FAIL, "Test Case Failed:" + result.getThrowable());
        } else if(result.getStatus()==ITestResult.SKIP){
        	Config.test.log(Status.SKIP,"Test Case skipped:"+result.getName());
        }
     }
    

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception{
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        
    }

    @Test(dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature){
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
   }
    @DataProvider
    public Object[] features(){
        return testNGCucumberRunner.provideFeatures();
    }
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception{
        testNGCucumberRunner.finish();
    }


}
