package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


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
        String actValue = "One";
        String expValue = "One";
        Assert.assertNotEquals(actValue,expValue,"The values dont match");
        System.out.println("Test finished");
    }
    @Test
    public void purchaseTest4(){
        logBrowser();
        System.out.println("Purchase Test4");
        boolean b = true;
        Assert.assertFalse(b,"Not false");
        System.out.println("Test finished");
    }
    @Test
    public void purchaseTest5(){
        logBrowser();
        System.out.println("Purchase Test5");
        String s = null;
        Assert.assertNotNull(s,"Value is null");
        System.out.println("Test finished");
    }
    @Test
    public void purchaseTest6(){
        logBrowser();
        System.out.println("Purchase Test6");
        SoftAssert softAssert = new SoftAssert();
        String expVal = "One";
        String actVal = "Two";
        softAssert.assertEquals(actVal,expVal,"The values don't match");
        softAssert.assertTrue(false,"The value is not true");
        softAssert.assertAll();
        System.out.println("Test finished");
    }




}
