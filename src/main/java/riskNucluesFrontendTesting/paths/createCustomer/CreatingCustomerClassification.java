package riskNucluesFrontendTesting.paths.createCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import riskNucluesFrontendTesting.settings.PageObject;

public class CreatingCustomerClassification extends PageObject {

    private static String sampleText = "Automated Testing";
    private static String NoEmployees = "50";
    private static String NetSale = "400000";
    private static String ObligorEquity = "5000";


    //click
    @FindBy(xpath = "//a[@id='base-Classification']")
    private WebElement obligor_Classification;

    //input
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[2]/fieldset/input")
    private WebElement classification_Employees;

    //input
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[3]/fieldset/input")
    private WebElement classification_NetSale;

    //input
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[4]/fieldset/input")
    private WebElement classification_ObligorEquity;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[6]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_StrDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[3]")
    private WebElement classification_StrDdSelect;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[6]/fieldset/span/a/i")
    private WebElement classification_StrDdUpload;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[7]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_MarketPositionDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div")
    private WebElement classification_MarketPositionDdSelect;

    //click
    @FindBy(xpath = "//div[7]/fieldset/span/a/i")
    private WebElement classification_MarketPositionUpload;

    //click
    @FindBy(xpath = "//div[8]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_SafeNameDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement classification_SafeNameDdSelect;

    //click
    @FindBy(xpath = "//div[8]/fieldset/span/a/i")
    private WebElement classification_SafeNameUpload;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[9]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_AduitedAmountDd;

    //click
    @FindBy(xpath = "//span[contains(.,'Non-Qualified')]")
    private WebElement classification_AduitedAmountDdSelect;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[9]/fieldset/span/a/i")
    private WebElement classification_AduitedAmountUpload;

    /* Regulatory Classification Section in Page Xpath */


    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[11]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement classification_RegulatoryIndustryIcon;

    //click
    @FindBy(xpath = "//div[2]/label")
    private WebElement classification_RegulatoryIndustrySelect;

    //click
    @FindBy(xpath = "//div[@id='collapseOne']/div/form/div/div/div[13]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement classification_CountryIcon;

    //click
    @FindBy(xpath = "//div[2]/label")
    private WebElement classification_CountrySelect;

    //click
    @FindBy(xpath = "(//div[@id='collapseOne']/div/form/div/div/div[14]/fieldset/app-dropdown/ng-select/div/span)[3]")
    private WebElement classification_BaselCategoryDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement classification_BaselCategorySelect;

    //click
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[15]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_ObjectiveClassDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div")
    private WebElement classification_ObjectiveClassSelect;

    //click
    @FindBy(xpath = "//div[16]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement classification_SubjectiveClassDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement classification_SubjectiveClassSelect;

    /* Internal Classification Section */

    //click
    @FindBy(xpath = "//div[18]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement classification_InternalIndusDd;

    //click
    @FindBy(xpath = "//div[2]/label")
    private WebElement classification_InternalIndusSelect;

    //input
    @FindBy(xpath = "//div[20]/fieldset/textarea")
    private WebElement classification_BusinessProfileText;

    //input
    @FindBy(xpath = "//div[4]/div/div[2]/div/form/div/div/div[20]/fieldset/span/a/i")
    private WebElement classification_BusinessProfileUpload;


    //click
    @FindBy(xpath = "(//button[@id='btnstyle'])[11]")
    private WebElement classification_Save;


    public void pressClassification() {
        this.obligor_Classification.click();
    }

    public void enterEmployeesNo() {
        this.classification_Employees.sendKeys(NoEmployees);
    }

    public void enterNetSale() {
        this.classification_NetSale.sendKeys(NetSale);
    }

    public void enterObligorEquity() {
        this.classification_ObligorEquity.sendKeys(ObligorEquity);
    }

    public void pressClassificationStrDd() {
        this.classification_StrDd.click();
    }

    public void pressClassificationStrDdSelect() {
        this.classification_StrDdSelect.click();
    }

    public void pressClassificationStrDdUpload() {
        this.classification_StrDdUpload.click();
    }

    public void pressMarketPositionDd() {
        this.classification_MarketPositionDd.click();
    }

    public void pressMarketPositionDdSelect() {
        this.classification_MarketPositionDdSelect.click();
    }

    public void pressMarketPositionUpload() {
        this.classification_MarketPositionUpload.click();
    }

    public void pressSafeNameDd() {
        this.classification_SafeNameDd.click();
    }

    public void pressSafeNameDdSelect() {
        this.classification_SafeNameDdSelect.click();
    }

    public void pressSafeNameDdUpload() {
        this.classification_SafeNameUpload.click();
    }

    public void pressAuditedAmountDd() {
        this.classification_AduitedAmountDd.click();
    }

    public void pressAuditedAmountDdSelect() {
        this.classification_AduitedAmountDdSelect.click();
    }

    public void pressAuditedAmountUpload() {
        this.classification_AduitedAmountUpload.click();
    }

    /* Regulatory Classification Section */


    public void pressRegIndustryIcon() {
        this.classification_RegulatoryIndustryIcon.click();
    }

    public void pressRegIndustrySelect() {
        this.classification_RegulatoryIndustrySelect.click();
    }

    public void pressCountryIcon() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        WebElement element = classification_CountryIcon;
        wait.until(ExpectedConditions.elementToBeClickable(classification_CountryIcon));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void pressCountrySelect() {
        this.classification_CountrySelect.click();
    }

    public void pressBaselCategory() {
        this.classification_BaselCategoryDd.click();
    }

    public void pressBaselCategorySelect() {
        this.classification_BaselCategorySelect.click();
    }

    public void pressObjectiveClassDd() {
        this.classification_ObjectiveClassDd.click();
    }

    public void pressObjectiveClassSelect() {
        this.classification_ObjectiveClassSelect.click();
    }

    public void pressSubjectiveClassDd() {
        this.classification_SubjectiveClassDd.click();
    }

    public void pressSubjectiveClassSelect() {
        this.classification_SubjectiveClassSelect.click();
    }

    public void pressInternalIndustryDd() {
        this.classification_InternalIndusDd.click();
    }

    public void pressInternalIndustrySelect() {
        this.classification_InternalIndusSelect.click();
    }

    public void enterBusinessProfile() {
        this.classification_BusinessProfileText.sendKeys(sampleText);
    }

    public void pressBusinessProfileUpload() {
        this.classification_BusinessProfileUpload.click();
    }

    public void pressSave() {
        this.classification_Save.click();
    }

    public CreatingCustomerClassification(WebDriver driver) {
        super(driver);
    }
}
