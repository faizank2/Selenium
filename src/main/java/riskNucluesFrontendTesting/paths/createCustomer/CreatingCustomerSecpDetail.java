package riskNucluesFrontendTesting.paths.createCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import riskNucluesFrontendTesting.settings.PageObject;

import java.io.File;

public class CreatingCustomerSecpDetail extends PageObject {

    private final String SampleReg = "7523000";
    private static String sampleText = "Automated Testing";
    String absolutePath = new File("sampleDoc\\demo.docx").getAbsolutePath();

    //click
    @FindBy(xpath = "//div[@id='tabs']/ul/li[3]/a")
    private WebElement obligor_secpDetails;

    //input
    @FindBy(xpath = "//div[3]/div/div[2]/div/form/div/div/div[2]/fieldset/input")
    private WebElement secpDetails_RegNo;

    //input
    @FindBy(xpath = "(//a[@id='plus']/i)[3]")
    private WebElement secpDetails_Upload;

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
    @FindBy(xpath = "(//button[@type='button'])[21]")
    private WebElement obligor_politicallyExposedUploadClose;
    //Function To upload document End

    //click
    @FindBy(xpath = "(//div[@id='element-to-hide']/div/button[2])[3]")
    private WebElement secpDetails_Save;


    public void pressSecpDetails() {
        this.obligor_secpDetails.click();
    }

    public void enterSecpRegNo() {
        this.secpDetails_RegNo.sendKeys(SampleReg);
    }

    public void pressSecpDetailsUpload() {
        this.secpDetails_Upload.click();
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

    public void pressSave() {
        this.secpDetails_Save.click();
    }


    public CreatingCustomerSecpDetail(WebDriver driver) {
        super(driver);
    }
}
