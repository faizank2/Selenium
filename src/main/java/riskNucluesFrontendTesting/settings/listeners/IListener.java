package riskNucluesFrontendTesting.settings.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import riskNucluesFrontendTesting.settings.BaseTestClass;
import riskNucluesFrontendTesting.settings.report.ExtentManager;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

/**
 * Edited by Faizan
 * This is listener baseClass, which will keep track of test failure and success.
 * Report generation is also done from this class.
 */
public class IListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult result) {
       ExtentTest test = extent.createTest(result.getTestClass().getName()+ " :: " +
               result.getMethod().getMethodName());
       extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Successful</b>";
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
        extentTest.get().log(Status.PASS,m);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
        String assertMessage = (result.getThrowable().getMessage());
        extentTest.get().fail("<details><summary<b><font color=red>Exception Occured, Click to see details:"
                + "</font></b></summary>" + exceptionMessage.replaceAll(",", "<br>") + "</details> \n");
        extentTest.get().fail("<message><summary<b><font color=red>Exception Message:"
                + "</font></b></summary>" + assertMessage.replaceAll(",", "<br>") + "</message> \n");
        WebDriver driver = ((BaseTestClass)result.getInstance()).driver;
        String path = takeScreenshot(driver,result.getMethod().getMethodName());
        try {
            extentTest.get().fail("<b><font color=red>" + "ScreenShot of failure" + "</font></b>",
                    MediaEntityBuilder.createScreenCaptureFromPath(path).build());
        }catch (Exception e){
            extentTest.get().fail("Test Failed, cannot attach Screenshot");
        }

        String logText = "<b>Test Method " + methodName + " Failed</b>";
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
        extentTest.get().log(Status.FAIL,m);

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Skipped</b>";
        String assertMessage = (result.getThrowable().getMessage());
        extentTest.get().skip("<message><summary<b><font color=red>Exception Message:"
                + "</font></b></summary>" + assertMessage.replaceAll(",", "<br>") + "</message> \n");
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
        extentTest.get().log(Status.SKIP,m);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("---------Build Started:"+context.getName()+"---------");
        System.out.println("---------Moving On To Perform Test---------");
    }

    @Override
    public void onFinish(ITestContext context) {
       if (extent!=null){
           extent.flush();

       }
    }

    public static String takeScreenshot(WebDriver driver, String methodName){

        String fileName = getScreenShotName(methodName);
        String directory = System.getProperty("user.dir") + "/screenshots/";
        new File(directory).mkdirs();
        String path = directory + fileName;

        try {
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(path));
            System.out.println("****************************");
            System.out.println("ScreenShot stored at:" +path);
            System.out.println("****************************");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return path;
    }

    public static String getScreenShotName(String methodName){
        Date d = new Date();
        String fileName = methodName + "_" + d.toString().replace(":","_").replace("","_")+ ".png";
        return fileName;
    }

}
