package ca.qaguru.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;

@Listeners(ExtentITestListenerClassAdapter.class)
public class TestBase {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite in FunctionalTests");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite in FunctionalTests");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest in FunctionalTests");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest in FunctionalTests");
    }
    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status, msg);
    }

}
