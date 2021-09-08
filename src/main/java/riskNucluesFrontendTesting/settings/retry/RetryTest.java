package riskNucluesFrontendTesting.settings.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import riskNucluesFrontendTesting.settings.BaseTestClass;


/**
 * Edited by Faizan
 * This is Retry baseClass.
 * It keeps track of failure test to repeat them once.
 */
public class RetryTest extends BaseTestClass implements IRetryAnalyzer {
    private int count = 0;
    private static int maxTry = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (count < maxTry) {
                count++;
                iTestResult.setStatus(ITestResult.FAILURE);
                System.out.println("Something Went Wrong re-running Test "
                        + iTestResult.getName() + " Retry: " + count + "/" + maxTry);

                retryCount=1;
                return true;
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }
}
