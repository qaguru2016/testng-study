package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;

public class FunctionalTests extends TestBase {
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

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass in FunctionalTests");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass in FunctionalTests");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod in FunctionalTests");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod in FunctionalTests");
    }

    @Test
    public void funcTest1(){
        System.out.println("funcTest1");
        log(Status.PASS, "funcTest1");
    }
    @Test
    public void funcTest2(){
        System.out.println("funcTest2");
    }
    @Test
    public void funcTest3(){
        System.out.println("funcTest3");
    }

}
