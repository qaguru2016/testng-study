package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InventoryTests extends TestBase {

    @Test
    public void inventoryTest1(){
        logBrowser();
        System.out.println("Inventory Test1");
    }
    @Test
    public void inventoryTest2(){
        logBrowser();
        System.out.println("Inventory Test2");
    }
    @Test
    public void inventoryTest3(){
        logBrowser();
        System.out.println("Inventory Test3");
    }

    @Test(dataProvider = "dpLogin", dataProviderClass = InventoryTests.class)
    public void loginTest(String username, String password){
        System.out.println("Username : "+ username + ", Password : "+ password);
    }

    @DataProvider(name = "dpLogin")
    public Object[][] loginData(){
        return new Object[][]{
                {"john","alpha"},
                {"david","beta"},
                {"sara", "gamma"}
        };
    }
}
