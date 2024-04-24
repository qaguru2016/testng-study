package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;

public class SecurityTests extends TestBase {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod in SecurityTests");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod in SecurityTests");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass in SecurityTests");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass in SecurityTests");
    }
    @Test
    public void secTest1(){
        System.out.println("secTest1");
    }

    @Test
    public void secTest2(){
        System.out.println("secTest2");
    }
    @Test
    public void secTest3(){
        System.out.println("secTest3");
    }

}
