package riskNucluesFrontendTesting.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Edited by Faizan
 * This class is initializing WebDriver,
 * to be used by classes defined in paths package.
 */
public class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
