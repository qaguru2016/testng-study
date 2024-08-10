package ca.qaguru.lib;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;
@Listeners(ExtentITestListenerClassAdapter.class)
public class TestBase {
    protected String browser;
    @BeforeMethod
    protected void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    protected void afterMethod(){
        System.out.println("After method");
    }
    @Parameters({"browser"})
    @BeforeClass
    protected void beforeClass(String browser){
        System.out.println("Before class " + browser);
        this.browser = browser;
    }
    @AfterClass
    protected void afterClass(){
        System.out.println("After class");
    }

    @BeforeTest
    protected void beforTest(){
        System.out.println("Before Test :");
    }
    @AfterTest
    protected void afterTest(){
        System.out.println("After Test");
    }
    @BeforeSuite
    protected void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    protected void afterSuite(){
        System.out.println("After Suite");
    }
    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status,msg);
    }
    protected void logBrowser(){
        log(Status.INFO,"Launching the browser - " + this.browser);
    }

}
