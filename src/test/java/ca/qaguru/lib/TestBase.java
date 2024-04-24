package ca.qaguru.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.Listeners;

@Listeners(ExtentITestListenerClassAdapter.class)
public class TestBase {
    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status, msg);
    }
}
