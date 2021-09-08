package testPlans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import riskNucluesFrontendTesting.paths.createCustomer.*;
import riskNucluesFrontendTesting.paths.WorkFlow;
import riskNucluesFrontendTesting.settings.BaseTestClass;
import riskNucluesFrontendTesting.settings.Utils;
import riskNucluesFrontendTesting.settings.listeners.IListener;
import riskNucluesFrontendTesting.settings.retry.RetryTest;

import java.util.concurrent.TimeUnit;


@Listeners(IListener.class)
public class TestPlan extends BaseTestClass {


    /**
     * Will perform login on portal and redirect on main page.
     */
    @Test(testName = "Performing Login", retryAnalyzer = RetryTest.class, priority = 0)
    public static void doLogin() throws InterruptedException {
        driver.get(Utils.Base_URL() + "login");
        Thread.sleep(10);
        log.info("Browser Navigated To :" + Utils.Base_URL() + "login");
        WorkFlow workFlow = new WorkFlow(driver);
        workFlow.enterUsername();
        log.info("Username Entered :" + workFlow.getUSER_NAME());
        workFlow.enterPassword();
        log.info("Password Entered :" + workFlow.getPASSWORD());
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        workFlow.pressSubmitButton();
        log.info("Submit button Pressed");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".menu-content:nth-child(4) .menu-title")));
        log.info("Waiting For Page To Load");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Credit Applications')]")));
    }

    /**
     * Will click on obligor menu from main page, and then add button
     * Creating Customer From Obligor And Filling Basic Information  Section.
     */
    @Test(testName = "Creating Customer Obligor", retryAnalyzer = RetryTest.class, priority = 1)
    public static void createCustomer() throws InterruptedException {
        Thread.sleep(10);
        CreatingCustomerFromObligor ccfo = new CreatingCustomerFromObligor(driver);
        ccfo.pressObligorMenu();
        log.info("Obligor Menu Clicked");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        log.info("Waiting for page to load");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,' Add')]")));
        ccfo.pressObligorAdd();
        log.info("Add Button pressed in obligor");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        log.info("Waiting for page to load");
        Thread.sleep(100);
        ccfo.enterBrCode();
        log.info("BR CODE VALUE: " + ccfo.getBR_CODE());
        ccfo.enterBrTitle();
        log.info("Title Added VALUE: " + ccfo.getBR_TITLE());
        ccfo.pressExisitigCustomer();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressExisitigCustomerOption();
        log.info("Exisiting Customer is selected");
        ccfo.enterCIF();
        log.info("CIF value added: " + ccfo.getBR_CIF());
        ccfo.pressInitiatingUnit();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressInitiatingUnitValue();
        log.info("Initiating Unit Value is select");
        ccfo.pressBranch();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressBranchSelect();
        log.info("Branch Value is select");
        ccfo.pressObligorGroup();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressObligorGroupSelect();
        log.info("Obligor group value is select");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        js.executeScript("window.scrollBy(0,500)");
        ccfo.pressCustomerType();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressCustomerTypeSelect();
        log.info("Cutomer Type is select");
        ccfo.pressLegalStatus();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressLegalStatusSelect();
        log.info("Legal Status is select");
        ccfo.enterReferringOfficer();
        log.info("Entered Reffering Officer: " + ccfo.getBR_REFFERING());
        ccfo.enterObligorNo();
        log.info("Entered AccountNo: " + ccfo.getBR_AccountNo());
        ccfo.pressAccountStrategy();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressAccountStrategySelect();
        log.info("Account Strategy Value is Selected");
        ccfo.pressIdType();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccfo.pressIdTypeSelect();
        log.info("ID Type Value is Selected");
        ccfo.enterIdTypeValue();
        log.info("Entered Id Value: " + ccfo.getBR_IdTypeValue());
        ccfo.enterFamilyAssocValue();
        log.info("Entered Family Association Value: " + ccfo.getBR_FamilyAssoc());
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(300);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,' Save')]")));
        ccfo.pressSaveButton();
        log.info("Save Button is pressed");
        Thread.sleep(100);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-1000)");
    }

    /**
     * Creating Customer From Obligor And Filling Additional Information Section.
     */
    @Test(testName = "Creating Customer Additional Info", retryAnalyzer = RetryTest.class, priority = 2)
    public static void createCustomerAdditional() throws InterruptedException {
        System.out.println("Value is " + retryCount);
        if (retryCount > 0) {
            js.executeScript("window.scrollBy(0,-1000)");
        }
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(600);
        CreatingCustomerAdditionalInformation ccai = new CreatingCustomerAdditionalInformation(driver);
        ccai.pressAdditionalInfo();
        log.info("Additional Information Section is Clicked");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(200);
        log.info("Waiting for page to load");
        Thread.sleep(500);
        ccai.pressLargeExposureDd();
        Thread.sleep(200);
        ccai.pressLargeExposureDdSelect();
        log.info("Large Exposure is Select from DropDown");
        ccai.enterLargeExposureText();
        log.info("Large Exposure Text is entered");
        ccai.pressPoliticallyExposedDd();
        ccai.pressPoliticallyExposedDdSelect();
        log.info("Politically Exposed is Select from DropDown");
        ccai.enterPoliticallyExposedDdText();
        log.info("Politically Exposed Text is entered");
        ccai.pressPoliticallyExposedDdUpload();
        log.info("Politically Exposed upload icon is entered");
        Thread.sleep(200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccai.uploadAttachment();
        log.info("Politically Exposed upload Successfully Done");
        Thread.sleep(100);
        ccai.pressNabList();
        ccai.pressNabListSelect();
        log.info("Customer On Nab list Drop Down Select ");
        ccai.pressNabListDdText();
        log.info("Customer On Nab list text entered ");
        ccai.pressNabListDdUpload();
        ccai.uploadAttachment();
        log.info("Customer On Nab list upload Success ");
        Thread.sleep(100);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(100);
        ccai.pressAggregatedExpo();
        ccai.pressAggregatedExpoSelect();
        log.info("Aggregated Expo Drop Down Select ");
        ccai.pressAggregatedExpoText();
        log.info("Aggregated Expo text entered ");
        ccai.pressAggregatedExpoUpload();
        ccai.uploadAttachment();
        log.info("Aggregated Expo upload Success ");
        Thread.sleep(100);
        ccai.pressRelatedParty();
        ccai.pressRelatedPartySelect();
        log.info("Related Party Drop Down Select ");
        ccai.pressRelatedPartyText();
        log.info("Related Party text entered ");
        ccai.pressRelatedPartyUpload();
        ccai.uploadAttachment();
        log.info("Related Party upload Success ");
        Thread.sleep(100);
        ccai.pressECIB();
        ccai.pressECIBSelect();
        log.info("eCIB Drop Down Select ");
        ccai.pressECIBText();
        log.info("eCIB text entered ");
        ccai.pressECIBUpload();
        ccai.uploadAttachment();
        log.info("eCIB upload Success ");
        Thread.sleep(100);
        ccai.pressGroupECIB();
        ccai.pressGroupECIBSelect();
        log.info("Group eCIB Drop Down Select ");
        ccai.pressGroupECIBText();
        log.info("Group eCIB text entered ");
        ccai.pressGroupECIBUpload();
        ccai.uploadAttachment();
        log.info("Group eCIB upload Success ");
        Thread.sleep(100);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(100);
        ccai.pressCustomerDefault();
        ccai.pressCustomerDefaultSelect();
        log.info("Customer Default Drop Down Select ");
        ccai.CustomerDefaultUpload();
        ccai.uploadAttachment();
        log.info("Customer Default upload Success ");
        Thread.sleep(100);
        ccai.pressCustomerExternal();
        ccai.pressCustomerExternalSelect();
        log.info("Customer Externally Rated Drop Down Selected ");
        Thread.sleep(100);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-title")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='element-to-hide']/div/button[2])[2]")));
        ccai.pressSaveButton();
        log.info("Save Button is pressed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
//        while ((wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")))))
//        {
//            WebElement m = driver.findElement(By.cssSelector(".toast-title"));
//            String originalTitle = m.getText();
//            String expectedTitle = "Inserted";
//            Assert.assertEquals(originalTitle, expectedTitle);
//        }
        log.info("Data Inserted Successfully");
        js.executeScript("window.scrollBy(0,-1000)");
    }

    @Test(testName = "Creating Customer SECP Details", retryAnalyzer = RetryTest.class, priority = 2)
    public static void createCustomerSecpDetails() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(2000);
        CreatingCustomerSecpDetail ccsd = new CreatingCustomerSecpDetail(driver);
        ccsd.pressSecpDetails();
        log.info("SECP Detail Section is pressed");
        Thread.sleep(200);
        ccsd.enterSecpRegNo();
        log.info("Registration No. entered");
        ccsd.pressSecpDetailsUpload();
        log.info("Upload Icon is pressed");
        ccsd.uploadAttachment();
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='element-to-hide']/div/button[2])[3]")));
        ccsd.pressSave();
        log.info("Save Button is pressed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        log.info("Data Inserted Successfully");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)");
    }


    @Test(testName = "Creating Customer Classification Details", retryAnalyzer = RetryTest.class, priority = 3)
    public static void createCustomerClassificationDetails() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(600);
        CreatingCustomerSecpDetail ccsd = new CreatingCustomerSecpDetail(driver);
        CreatingCustomerClassification ccc = new CreatingCustomerClassification(driver);
        ccc.pressClassification();
        log.info("Classification Detail Section is pressed");
        Thread.sleep(200);
        ccc.enterEmployeesNo();
        log.info("No of employees entered");
        ccc.enterNetSale();
        log.info("Net Sale entered");
        ccc.enterObligorEquity();
        log.info("Obligor equity amount entered");
        ccc.pressClassificationStrDd();
        Thread.sleep(100);
        ccc.pressClassificationStrDdSelect();
        log.info("Suspicious transaction is select");
        ccc.pressClassificationStrDdUpload();
        log.info("Suspicious transaction upload icon clicked");
        Thread.sleep(200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccsd.uploadAttachment();
        log.info("Upload success");
        Thread.sleep(100);
        ccc.pressMarketPositionDd();
        ccc.pressMarketPositionDdSelect();
        log.info("Market Position Select");
        ccc.pressMarketPositionUpload();
        log.info("Upload icon pressed");
        Thread.sleep(200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccsd.uploadAttachment();
        log.info("Upload success");
        Thread.sleep(100);
        ccc.pressSafeNameDd();
        ccc.pressSafeNameDdSelect();
        log.info("Safe Name Select");
        ccc.pressSafeNameDdUpload();
        log.info("Upload icon pressed");
        Thread.sleep(200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccsd.uploadAttachment();
        log.info("Upload success");
        Thread.sleep(100);
        ccc.pressAuditedAmountDd();
        ccc.pressAuditedAmountDdSelect();
        log.info("Audited amount select");
        ccc.pressAuditedAmountUpload();
        log.info("Upload icon pressed");
        Thread.sleep(200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(100);
        ccsd.uploadAttachment();
        log.info("Upload success");
        log.info("*************** Moving To Regulatory Classification ***************");
        js.executeScript("window.scrollBy(0,450)");
        Thread.sleep(200);
        ccc.pressRegIndustryIcon();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccc.pressRegIndustrySelect();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(200);
        log.info("Regulatory industry selected");
        ccc.pressCountryIcon();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccc.pressCountrySelect();
        log.info("Country selected");
        ccc.pressBaselCategory();
        ccc.pressBaselCategorySelect();
        Thread.sleep(200);
        log.info("Basel category selected");
        ccc.pressObjectiveClassDd();
        ccc.pressObjectiveClassSelect();
        log.info("Objective Classification selected");
        Thread.sleep(200);
        ccc.pressSubjectiveClassDd();
        ccc.pressSubjectiveClassSelect();
        log.info("Subjective Classification selected");
        Thread.sleep(200);
        js.executeScript("window.scrollBy(0,500)");
        ccc.pressInternalIndustryDd();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccc.pressInternalIndustrySelect();
        log.info("Internal Industry selected");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(200);
        ccc.enterBusinessProfile();
        log.info("Business profile text entered");
        ccc.pressBusinessProfileUpload();
        log.info("Upload icon pressed");
        ccsd.uploadAttachment();
        log.info("Upload Success");
        Thread.sleep(1000);
        ccc.pressSave();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        js.executeScript("window.scrollBy(0,-1000)");
    }

    @Test(testName = "Creating Customer Financial Summary Details", retryAnalyzer = RetryTest.class, priority = 4)
    public static void createCustomerFinancialSummary() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(600);
        CreatingCustomerFinancialSummary ccfs = new CreatingCustomerFinancialSummary(driver);
        ccfs.pressObligorFinancial();
        log.info("Financial Summary Section is pressed");
        Thread.sleep(200);
        ccfs.enterLrtA();
        log.info("Linkage Ratio Total (BBFS) Entered");
        ccfs.enterLrfA();
        log.info("Linkage Ratio Funded (eCIB) Entered");
        ccfs.enterLrfB();
        log.info("Linkage Ratio Funded (BBFS) Entered");
        ccfs.enterLrtB();
        log.info("Linkage Ratio Total (eCIB) Entered");
        ccfs.enterCapitalMarket();
        log.info("Capital Market Exposure Entered");
        ccfs.pressFinancialSave();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
    }

    @Test(testName = "Creating Customer Funding With Other Bank Details", retryAnalyzer = RetryTest.class, priority = 5)
    public static void createCustomerFundingOtherBank() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(600);
        CreatingCustomerFundingOtherBank ccfob = new CreatingCustomerFundingOtherBank(driver);
        ccfob.pressFundingWithBank();
        log.info("Funding With Other Bank Section Selected");
        ccfob.pressPlusIcon();
        log.info("Plus icon is pressed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccfob.pressBankDd();
        Thread.sleep(100);
        ccfob.pressBankSelect();
        log.info("Bank Selected");
        ccfob.enterWorkingCaptialLimit();
        log.info("Working Capital(Funded) Limit Entered");
        ccfob.enterWorkingCaptialFunded();
        log.info("Working Capital(Funded) O/s Entered");
        ccfob.enterLongTermLimit();
        log.info("Long Term (Funded) Limit Entered");
        ccfob.enterLongTermFunded();
        log.info("Long Term (Funded) O/s Entered");
        ccfob.enterNonFundedLimit();
        log.info("Non-Funded Limits Entered");
        ccfob.enterNonFundedOs();
        log.info("Non-Funded O/s Entered");
        ccfob.enterTotalLimit();
        log.info("Total Limit Entered");
        ccfob.enterTotalOs();
        log.info("Total O/s Entered");
        ccfob.enterOverDueAmount();
        log.info("Over due amount Entered");
        ccfob.enterOverDueDays();
        log.info("Over due days Entered");
        ccfob.pressPgProvidedDd();
        Thread.sleep(100);
        ccfob.pressPgProvidedSelect();
        log.info("Pg Provided entered");
        ccfob.pressTypeOfChargeDd();
        Thread.sleep(100);
        ccfob.pressTypeOfChargeSelect();
        log.info("Type of charge selected");
        ccfob.enterAmountOfCharge();
        log.info("Amount of charge entered");
        ccfob.pressRankingOfChargeDd();
        Thread.sleep(100);
        ccfob.pressRankingOfChargeSelect();
        log.info("Ranking of charge selected");
        ccfob.enterMargin();
        log.info("Margin Entered");
        ccfob.enterSyndicateLoan();
        log.info("Syndicate loan entered");
        js.executeScript("window.scrollBy(0,500)");
        ccfob.enterFacility();
        log.info("Facility entered");
        ccfob.enterSecurity();
        log.info("Security entered");
        ccfob.enterPricingCommission();
        log.info("Pricing/Commission entered");
        ccfob.enterRelationshipRemarks();
        Thread.sleep(100);
        ccfob.pressSave();
        log.info("Save button pressed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccfob.pressAddDetailSec();
        log.info("Detail of account with other bank icon selected");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccfob.enterAccountTitle();
        log.info("Account title entered");
        ccfob.pressAccountNatureDd();
        Thread.sleep(100);
        ccfob.pressAccountNatureSelect();
        log.info("Nature of account selected");
        ccfob.enterAccountNo();
        log.info("Account no. entered");
        ccfob.pressBranchDd();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        ccfob.pressBranchSelect();
        log.info("Branch selected");
        Thread.sleep(100);
        ccfob.pressAccountOpenedDateDd();
        Thread.sleep(100);
        ccfob.pressAccountOpenedDateSelect();
        log.info("Account opened date selected");
        ccfob.pressAccountBalDateDd();
        Thread.sleep(100);
        ccfob.pressAccountBalDateSelect();
        log.info("Current balance date selected");
        ccfob.enterCurrentBalance();
        Thread.sleep(100);
        ccfob.pressSaveSec();
        log.info("Save button pressed");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-foreground-spinner")));
        Thread.sleep(2000);
    }
}
