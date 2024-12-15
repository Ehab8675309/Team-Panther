package Utilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" New test Started " + result.getName());
        ExtentManager.createTest(result.getMethod().getMethodName(), "erforming " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" Method Succeeded and " + result.getName());
        ExtentManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" Method Failed, taking screenshot " + result.getName());
        ExtentManager.getTest().fail("Test failed");
        try{
            ExtentManager.getTest().info("Screenshort of a failure page ").fail(MediaEntityBuilder.createScreenCaptureFromBase64String(CommonMethods.takeScreenShot64(), "Screenshot of the failure page").build());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentManager.getTest().skip("Test skipped");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(" on Start - " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.flushReports();
    }
}
