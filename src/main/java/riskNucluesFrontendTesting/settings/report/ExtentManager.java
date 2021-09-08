package riskNucluesFrontendTesting.settings.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import riskNucluesFrontendTesting.settings.BaseTestClass;

import java.io.File;
import java.util.Date;

/**
 * Edited by faizan
 * This is Reporter baseClass using extentReporter library.
 * Setting of reporter is done through this class.
 */
public class ExtentManager extends BaseTestClass {

    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        String path;
        ExtentSparkReporter spark;
        String fileName = getReportName();
        String directory = System.getProperty("user.dir") + "/reports/";
        new File(directory).mkdirs();
        if (enValue.equalsIgnoreCase("DEV")) {
            path = directory + fileName;
            spark = new ExtentSparkReporter(path);
        } else if (enValue.equalsIgnoreCase("PROD")) {
            spark = new ExtentSparkReporter("./reports/spark.html");
        } else {
            path = directory + fileName;
            spark = new ExtentSparkReporter(path);
        }
        spark.config().setEncoding("utf-8");
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Automation Test Result");
        spark.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.setSystemInfo("Benchmatrix", "RiskNuclues");
        extent.setSystemInfo("Browser", "Chrome");
        extent.attachReporter(spark);

        return extent;
    }

    public static String getReportName() {
        Date d = new Date();
        String fileName = "AutomationReport_" + d.toString().replace(":", "_").replace("", "_") + ".html";
        return fileName;
    }
}
