package riskNucluesFrontendTesting.settings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.Properties;

/**
 * Edited by Faizan
 * This is a baseClass for initialization of chrome driver and logger Initially.
 * This class is extending in other classes.
 */
public class BaseTestClass {
    private static final Properties prop = new Properties();
    private static final ChromeOptions opt = new ChromeOptions();
    public static final WebDriver driver = setBrowser();
    public static JavascriptExecutor js = (JavascriptExecutor) driver;
    public static Logger log = LogManager.getLogger(BaseTestClass.class);
    public static String enValue;
    public static String urlValue;
    public static Integer retryCount=0;

    static {
        try {
            urlValue = getUrl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            enValue = getEnv();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public static void setupSetting() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
//        System.setProperty("webdriver.gecko.driver", RiskNucluesFrontendTesting.Settings.Utils.FIREFOX_DRIVER_LOCATION);
    }

    @AfterTest
    public static void closeSetting() {

        driver.close();
    }

    public static String getEnv() throws IOException {
        String enValue;
        prop.load(BaseTestClass.class.getClassLoader().getResourceAsStream("MyProject.properties"));
        enValue = prop.getProperty("env");
        System.out.println("******************Build will start on:" + enValue + " mode ******************");
        return enValue;
    }

    public static String getUrl() throws IOException {
        String urlValue;
        prop.load(BaseTestClass.class.getClassLoader().getResourceAsStream("MyProject.properties"));
        urlValue = prop.getProperty("url");
        System.out.println("******************Build will start on:" + urlValue + " mode ******************");
        return urlValue;
    }

    public static WebDriver setBrowser() {
        try {

            if (getEnv().equalsIgnoreCase("enValue")) {
                opt.addArguments("--start-maximized");
            } else if (getEnv().equalsIgnoreCase("PROD")) {
                opt.addArguments("window-size=1920,1080", "headless");
            } else {
                opt.addArguments("--start-maximized");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ChromeDriver(opt);
    }

}


