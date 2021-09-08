package riskNucluesFrontendTesting.paths.createCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import riskNucluesFrontendTesting.settings.PageObject;

public class CreatingCustomerFinancialSummary extends PageObject {

    private final String sampleNo = "4500006";

    //click
    @FindBy(xpath = "//div[@id='tabs']/ul/li[5]")
    private WebElement obligor_FinancialSummary;

    //click
    @FindBy(xpath = "//div[5]/div/div[2]/div/form/div/div/div/fieldset/input")
    private WebElement FinancialSummary_LinkageRatioTotalA;

    //click
    @FindBy(xpath = "//div[5]/div/div[2]/div/form/div/div/div[2]/fieldset/input")
    private WebElement FinancialSummary_LinkageRatioFundedA;

    //click
    @FindBy(xpath = "//div[5]/div/div[2]/div/form/div/div/div[3]/fieldset/input")
    private WebElement FinancialSummary_LinkageRatioFundedB;

    //click
    @FindBy(xpath = "//div[5]/div/div[2]/div/form/div/div/div[4]/fieldset/input")
    private WebElement FinancialSummary_LinkageRatioTotalB;

    //click
    @FindBy(xpath = "//div[5]/fieldset/input")
    private WebElement FinancialSummary_CapitalMarketExposure;

    //click
    @FindBy(xpath = "//div[5]/div/div[2]/div/form/div[2]/div/button[2]")
    private WebElement FinancialSummary_Save;


    public void pressObligorFinancial() {
        this.obligor_FinancialSummary.click();
    }

    public void enterLrtA() {
        this.FinancialSummary_LinkageRatioTotalA.sendKeys(sampleNo);
    }

    public void enterLrfA() {
        this.FinancialSummary_LinkageRatioFundedA.sendKeys(sampleNo);
    }

    public void enterLrfB() {
        this.FinancialSummary_LinkageRatioFundedB.sendKeys(sampleNo);
    }

    public void enterLrtB() {
        this.FinancialSummary_LinkageRatioTotalB.sendKeys(sampleNo);
    }

    public void enterCapitalMarket() {
        this.FinancialSummary_CapitalMarketExposure.sendKeys(sampleNo);
    }

    public void pressFinancialSave() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        WebElement element = FinancialSummary_Save;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }


    public CreatingCustomerFinancialSummary(WebDriver driver) {
        super(driver);
    }
}
