package riskNucluesFrontendTesting.paths.createCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import riskNucluesFrontendTesting.settings.PageObject;

import java.io.File;

public class CreatingCustomerAdditionalInformation extends PageObject {

    private static String sampleText = "Automated Testing";
    String absolutePath = new File("sampleDoc\\demo.docx").getAbsolutePath();

    //click
    @FindBy(xpath = "//a[@id='base-AI']")
    private WebElement obligor_additionalInfo;

    //click
    @FindBy(xpath = "//div[2]/div/div[2]/div/form/div/div/div/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_largeExpoDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_largeExpoDdSelect;

    //input
    @FindBy(xpath = "//div[2]/fieldset/textarea")
    private WebElement obligor_largeExpoDdText;

    //click
    @FindBy(xpath = "//div[3]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_politicallyExposedDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_politicallyExposedDdSelect;

    //input
    @FindBy(xpath = "//div[4]/fieldset/textarea")
    private WebElement obligor_politicallyExposedDdText;

    //click
    @FindBy(xpath = "//div[3]/fieldset/span/a/i")
    private WebElement obligor_politicallyExposedUpload;

    //Function To upload document Start
    //input
    @FindBy(xpath = "//app-document-upload/form/div/div/div[2]/fieldset/input")
    private WebElement obligor_politicallyExposedUploadTitle;

    //input
    @FindBy(xpath = "//div[5]/fieldset/textarea")
    private WebElement obligor_politicalyExposedUploadDisc;

    //click
    @FindBy(xpath = "//span[@id='basic-addon4']/i")
    private WebElement obligor_politicallyExposedUploadBtn;

    //input
    @FindBy(xpath = "//input[@type='file']")
    private WebElement obligor_politicallyExposedUploadPath;

    //click
    @FindBy(xpath = "//button[contains(.,'Upload')]")
    private WebElement obligor_politicallyExposedUploadSubmit;

    //click
    @FindBy(xpath = "//button[contains(.,'Close')]")
    private WebElement obligor_politicallyExposedUploadClose;
    //Function To upload document End

    //click
    @FindBy(xpath = "//div[@id='collapseOne']/div/form/div/div/div[6]/fieldset/app-dropdown/ng-select/div/div/div[2]")
    private WebElement obligor_nabDd;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_nabSelect;

    //input
    @FindBy(xpath = "//textarea[@id='nabListCustomerDescription']")
    private WebElement obligor_nabDdText;

    //click
    @FindBy(xpath = "//div[6]/fieldset/span/a/i")
    private WebElement obligor_nabDdUpload;

    //click
    @FindBy(xpath = "//div[9]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_aggregatedExpo;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_aggregatedExpoSelect;

    //input
    @FindBy(xpath = "//textarea[@id='aggregatedOutstandingExposureDescription']")
    private WebElement obligor_aggregatedExpoText;

    //click
    @FindBy(xpath = "//div[9]/fieldset/span/a/i")
    private WebElement aggregatedExpoUpload;

    //click
    @FindBy(xpath = "//div[11]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_RelatedParty;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_RelatedPartySelect;

    //input
    @FindBy(xpath = "//textarea[@id='relatedPartyDescription']")
    private WebElement obligor_RelatedPartyText;

    //click
    @FindBy(xpath = "//div[11]/fieldset/span/a/i")
    private WebElement RelatedPartyUpload;

    //click
    @FindBy(xpath = "//div[14]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_eCIB;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div")
    private WebElement obligor_eCIBSelect;

    //input
    @FindBy(xpath = "//textarea[@id='ecibDescription']")
    private WebElement obligor_eCIBText;

    //click
    @FindBy(xpath = "//div[14]/fieldset/span/a/i")
    private WebElement eCIBUpload;

    //click
    @FindBy(xpath = "//div[17]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_groupECIB;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div")
    private WebElement obligor_groupECIBSelect;

    //input
    @FindBy(xpath = "//textarea[@id='groupEcibDescription']")
    private WebElement obligor_groupECIBText;

    //click
    @FindBy(xpath = "//div[17]/fieldset/span/a/i")
    private WebElement groupECIBUpload;

    //click
    @FindBy(xpath = "//div[20]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_customerDefault;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_customerDefaultSelect;

    //click
    @FindBy(xpath = "//div[20]/fieldset/span/a/i")
    private WebElement customerDefaultUpload;

    //click
    @FindBy(xpath = "//div[23]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement obligor_customerExternal;

    //click
    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement obligor_customerExternalSelect;

    @FindBy(xpath = "(//div[@id='element-to-hide']/div/button[2])[2]")
    private WebElement obligor_save;

    public void pressAdditionalInfo() {
        this.obligor_additionalInfo.click();
    }

    public void pressLargeExposureDd() {
        this.obligor_largeExpoDd.click();
    }

    public void pressLargeExposureDdSelect() {
        this.obligor_largeExpoDdSelect.click();
    }

    public void enterLargeExposureText() {
        this.obligor_largeExpoDdText.sendKeys(sampleText);
    }

    public void pressPoliticallyExposedDd() {
        this.obligor_politicallyExposedDd.click();
    }

    public void pressPoliticallyExposedDdSelect() {
        this.obligor_politicallyExposedDdSelect.click();
    }

    public void enterPoliticallyExposedDdText() {
        this.obligor_politicallyExposedDdText.sendKeys(sampleText);
    }

    public void pressPoliticallyExposedDdUpload() {
        this.obligor_politicallyExposedUpload.click();
    }

    public void uploadAttachment() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        this.obligor_politicallyExposedUploadTitle.sendKeys(sampleText);
        this.obligor_politicalyExposedUploadDisc.sendKeys(sampleText);
        this.obligor_politicallyExposedUploadPath.sendKeys(absolutePath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Upload')]")));
        this.obligor_politicallyExposedUploadSubmit.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-title")));
        WebElement m = driver.findElement(By.cssSelector(".toast-title"));
        String originalTitle = m.getText();
        String expectedTitle = "File demo.docx Uploaded";
        Assert.assertEquals(originalTitle, expectedTitle);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        WebElement element = obligor_politicallyExposedUploadClose;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void pressNabList() {
        this.obligor_nabDd.click();
    }

    public void pressNabListSelect() {
        this.obligor_nabSelect.click();
    }

    public void pressNabListDdText() {
        this.obligor_nabDdText.sendKeys(sampleText);
    }

    public void pressNabListDdUpload() {
        this.obligor_nabDdUpload.click();
    }


    public void pressAggregatedExpo() {
        this.obligor_aggregatedExpo.click();
    }

    public void pressAggregatedExpoSelect() {
        this.obligor_aggregatedExpoSelect.click();
    }

    public void pressAggregatedExpoText() {
        this.obligor_aggregatedExpoText.sendKeys(sampleText);
    }

    public void pressAggregatedExpoUpload() {
        this.aggregatedExpoUpload.click();
    }

    public void pressRelatedParty() {
        this.obligor_RelatedParty.click();
    }

    public void pressRelatedPartySelect() {
        this.obligor_RelatedPartySelect.click();
    }

    public void pressRelatedPartyText() {
        this.obligor_RelatedPartyText.sendKeys(sampleText);
    }

    public void pressRelatedPartyUpload() {
        this.RelatedPartyUpload.click();
    }

    public void pressECIB() {
        this.obligor_eCIB.click();
    }

    public void pressECIBSelect() {
        this.obligor_eCIBSelect.click();
    }

    public void pressECIBText() {
        this.obligor_eCIBText.sendKeys(sampleText);
    }

    public void pressECIBUpload() {
        this.eCIBUpload.click();
    }

    public void pressGroupECIB() {
        this.obligor_groupECIB.click();
    }

    public void pressGroupECIBSelect() {
        this.obligor_groupECIBSelect.click();
    }

    public void pressGroupECIBText() {
        this.obligor_groupECIBText.sendKeys(sampleText);
    }

    public void pressGroupECIBUpload() {
        this.groupECIBUpload.click();
    }

    public void pressCustomerDefault() {
        this.obligor_customerDefault.click();
    }

    public void pressCustomerDefaultSelect() {
        this.obligor_customerDefaultSelect.click();
    }


    public void CustomerDefaultUpload() {
        this.customerDefaultUpload.click();
    }

    public void pressCustomerExternal() {
        this.obligor_customerExternal.click();
    }


    public void pressCustomerExternalSelect() {
        this.obligor_customerExternalSelect.click();
    }

    public void pressSaveButton() {
        this.obligor_save.click();
    }

    public CreatingCustomerAdditionalInformation(WebDriver driver) {
        super(driver);
    }
}
