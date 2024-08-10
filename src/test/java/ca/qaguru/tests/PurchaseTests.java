package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;

public class PurchaseTests extends TestBase {

    @Test
    public void purchaseTest1(){
        logBrowser();
        super.log(Status.INFO,"Verification done");
        System.out.println("Purchase Test1");

    }
    @Test
    public void purchaseTest2(){
        logBrowser();
        System.out.println("Purchase Test2");
    }
    @Test
    public void purchaseTest3(){
        logBrowser();
        System.out.println("Purchase Test3");
        Assert.fail("Some verification failed");
    }

}
