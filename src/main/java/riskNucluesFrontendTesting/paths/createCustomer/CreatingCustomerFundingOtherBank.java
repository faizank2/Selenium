package riskNucluesFrontendTesting.paths.createCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import riskNucluesFrontendTesting.settings.PageObject;

public class CreatingCustomerFundingOtherBank extends PageObject {

    private final String sampleNo = "400050";
    private final String overDueDays = "5";
    private final String overDueAmount = "4000";
    private final String sampleText = "Automated Testing";

    //click
    @FindBy(xpath= "//div[@id='tabs']/ul/li[6]/a")
    private WebElement obligor_FundingWithBank;

     //click
    @FindBy(xpath= "//div[6]/div/div[2]/div/form/div[1]/div/div/fieldset/app-linked-field/form/div/h6/a/i")
    private WebElement FundingWithBank_AddIcon;

    //click
    @FindBy(xpath= "//span/fieldset/app-dropdown/ng-select/div/span")
    private WebElement FundingWithBank_BankDd;

    //click
    @FindBy(xpath= "//div[2]/div[2]/span")
    private WebElement FundingWithBank_BankSelect;


    //input
    @FindBy(xpath= "//input[@id='workingCapitalFundedLimit']")
    private WebElement FundingWithBank_WorkingCapitalLimit;

    //input
    @FindBy(xpath= "//input[@id='workingCapacityOutstanding']")
    private WebElement FundingWithBank_WorkingCapitalFunded;


    //input
    @FindBy(xpath= "//input[@id='longTermLimit']")
    private WebElement FundingWithBank_LongTermLimit;

    //input
    @FindBy(xpath= "//input[@id='longTermOutstanding']")
    private WebElement FundingWithBank_LongTermFunded;

    //input
    @FindBy(xpath= "//input[@id='nonFundedTotalLimit']")
    private WebElement FundingWithBank_NonFundedLimit;

    //input
    @FindBy(xpath= "//input[@id='nonFundedTotalOutStanding']")
    private WebElement FundingWithBank_NonFundedOs;

    //input
    @FindBy(xpath= "//input[@id='totalLimit']")
    private WebElement FundingWithBank_TotalLimit;

    //input
    @FindBy(xpath= "//input[@id='totalOutstanding']")
    private WebElement FundingWithBank_TotalOs;

    //input
    @FindBy(xpath= "//input[@id='overdueAmount']")
    private WebElement FundingWithBank_OverDueAmount;

    //input
    @FindBy(xpath= "//input[@id='overdueDays']")
    private WebElement FundingWithBank_OverDueDays;

    //click
    @FindBy(xpath= "//span[16]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement FundingWithBank_PgProvidedDd;

    //click
    @FindBy(xpath= "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement FundingWithBank_PgProvidedSelect;

    //click
    @FindBy(xpath= "//span[17]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement FundingWithBank_TypeOfChargeDd;

    //click
    @FindBy(xpath= "//div[2]/div/span")
    private WebElement FundingWithBank_TypeOfChargeSelect;

    //input
    @FindBy(xpath= "//input[@id='chargeAmount']")
    private WebElement FundingWithBank_AmountOfCharge;

     //click
    @FindBy(xpath= "//span[19]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement FundingWithBank_RankingOfChargeDd;

    //click
    @FindBy(xpath= "//ng-dropdown-panel/div/div[2]/div")
    private WebElement FundingWithBank_RankingOfChargeSelect;

    //input
    @FindBy(xpath= "//input[@id='margin']")
    private WebElement FundingWithBank_Margin;

    //input
    @FindBy(xpath= "//input[@id='syndicatedLoans']")
    private WebElement FundingWithBank_SyndicateLoan;

    //input
    @FindBy(xpath= "//textarea[@id='facility']")
    private WebElement FundingWithBank_Facility;

    //input
    @FindBy(xpath= "//textarea[@id='security']")
    private WebElement FundingWithBank_Security;

    //input
    @FindBy(xpath= "//textarea[@id='pricingCommission']")
    private WebElement FundingWithBank_PricingCommission;

    //input
    @FindBy(xpath= "//textarea[@id='relationshipRemarks']")
    private WebElement FundingWithBank_RelationshipRemarks;

    //input
    @FindBy(xpath= "//div[3]/button")
    private WebElement FundingWithBank_Save;

    /* Detail of account with other bank Section Start */

    //click
    @FindBy(xpath= "//div[@id='collapseOne']//div[2]//fieldset[1]//app-linked-field[1]//form[1]//div[1]//h6[1]//a[1]//i[1]")
    private WebElement FundingWithBank_AddDetailSec;

    //input
    @FindBy(xpath= "//span//input[@id='title']")
    private WebElement FundingWithBank_AccountTitle;

    //click
    @FindBy(xpath= "//span[2]/fieldset/app-dropdown/ng-select/div/span")
    private WebElement FundingWithBank_AccountNatureDd;

    //click
    @FindBy(xpath= "//div[2]/div/span")
    private WebElement FundingWithBank_AccountNatureSelect;

    //input
    @FindBy(xpath= "//input[@id='accountNo']")
    private WebElement FundingWithBank_AccountNo;

    //click
    @FindBy(xpath= "//span[4]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement FundingWithBank_BranchDd;

    //click
    @FindBy(xpath= "//ngx-treeview-item[2]/div/div/div[2]/label")
    private WebElement FundingWithBank_BranchSelect;

    //click
    @FindBy(xpath= "//input[@id='myDatePicker']")
    private WebElement FundingWithBank_AccountOpenedDateDd;

    //click
    @FindBy(xpath= "//tr[2]/td[5]/span")
    private WebElement FundingWithBank_AccountOpenedDateSelect;

    //click
    @FindBy(xpath= "(//input[@id='myDatePicker'])[2]")
    private WebElement FundingWithBank_AccountBalDateDd;

    //click
    @FindBy(xpath= "//tr[2]/td[5]/span")
    private WebElement FundingWithBank_AccountBalDateSelect;


    //input
    @FindBy(xpath= "//input[@id='currentBalance']")
    private WebElement FundingWithBank_CurrentBalance;


     //click
    @FindBy(xpath= "//div[3]/button")
    private WebElement FundingWithBank_SaveSec;







    public void pressFundingWithBank(){
        this.obligor_FundingWithBank.click();
    }

    public void pressPlusIcon(){
        this.FundingWithBank_AddIcon.click();
    }

    public void pressBankDd(){
        this.FundingWithBank_BankDd.click();
    }

    public void pressBankSelect(){
        this.FundingWithBank_BankSelect.click();
    }

    public void enterWorkingCaptialLimit(){
        this.FundingWithBank_WorkingCapitalLimit.sendKeys(sampleNo);
    }

    public void enterWorkingCaptialFunded(){
        this.FundingWithBank_WorkingCapitalFunded.sendKeys(sampleNo);
    }

    public void enterLongTermLimit(){
        this.FundingWithBank_LongTermLimit.sendKeys(sampleNo);
    }

    public void enterLongTermFunded(){
        this.FundingWithBank_LongTermFunded.sendKeys(sampleNo);
    }

    public void enterNonFundedLimit(){
        this.FundingWithBank_NonFundedLimit.sendKeys(sampleNo);
    }

    public void enterNonFundedOs(){
        this.FundingWithBank_NonFundedOs.sendKeys(sampleNo);
    }

    public void enterTotalLimit(){
        this.FundingWithBank_TotalLimit.sendKeys(sampleNo);
    }

    public void enterTotalOs(){
        this.FundingWithBank_TotalOs.sendKeys(sampleNo);
    }

    public void enterOverDueAmount(){
        this.FundingWithBank_OverDueAmount.sendKeys(overDueAmount);
    }

    public void enterOverDueDays(){
        this.FundingWithBank_OverDueDays.sendKeys(overDueDays);
    }

    public void pressPgProvidedDd(){
        this.FundingWithBank_PgProvidedDd.click();
    }

    public void pressPgProvidedSelect(){
        this.FundingWithBank_PgProvidedSelect.click();
    }

    public void pressTypeOfChargeDd(){
        this.FundingWithBank_TypeOfChargeDd.click();
    }

    public void pressTypeOfChargeSelect(){
        this.FundingWithBank_TypeOfChargeSelect.click();
    }

    public void enterAmountOfCharge(){
        this.FundingWithBank_AmountOfCharge.sendKeys(overDueAmount);
    }

    public void pressRankingOfChargeDd(){
        this.FundingWithBank_RankingOfChargeDd.click();
    }

    public void pressRankingOfChargeSelect(){
        this.FundingWithBank_RankingOfChargeSelect.click();
    }

    public void enterMargin(){
        this.FundingWithBank_Margin.sendKeys(overDueAmount);
    }

    public void enterSyndicateLoan(){
        this.FundingWithBank_SyndicateLoan.sendKeys(sampleNo);
    }

    public void enterFacility(){
        this.FundingWithBank_Facility.sendKeys(sampleText);
    }

    public void enterSecurity(){
        this.FundingWithBank_Security.sendKeys(sampleText);
    }

    public void enterPricingCommission(){
        this.FundingWithBank_PricingCommission.sendKeys(sampleText);
    }

    public void enterRelationshipRemarks(){
        this.FundingWithBank_RelationshipRemarks.sendKeys(sampleText);
    }

    public void pressSave() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        WebElement element = FundingWithBank_Save;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void pressAddDetailSec() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        WebElement element = FundingWithBank_AddDetailSec;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void enterAccountTitle(){
        this.FundingWithBank_AccountTitle.sendKeys(sampleText);
    }

    public void pressAccountNatureDd(){
        this.FundingWithBank_AccountNatureDd.click();
    }

    public void pressAccountNatureSelect(){
        this.FundingWithBank_AccountNatureSelect.click();
    }

    public void enterAccountNo(){
        this.FundingWithBank_AccountNo.sendKeys(sampleText);
    }

    public void pressBranchDd(){
        this.FundingWithBank_BranchDd.click();
    }

    public void pressBranchSelect(){
        this.FundingWithBank_BranchSelect.click();
    }

    public void pressAccountOpenedDateDd(){
        this.FundingWithBank_AccountOpenedDateDd.click();
    }

    public void pressAccountOpenedDateSelect(){
        this.FundingWithBank_AccountOpenedDateSelect.click();
    }

    public void pressAccountBalDateDd(){
        this.FundingWithBank_AccountBalDateDd.click();
    }

    public void pressAccountBalDateSelect(){
        this.FundingWithBank_AccountBalDateSelect.click();
    }


    public void enterCurrentBalance(){
        this.FundingWithBank_CurrentBalance.sendKeys(sampleNo);
    }

    public void pressSaveSec() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        WebElement element = FundingWithBank_SaveSec;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public CreatingCustomerFundingOtherBank(WebDriver driver) {
        super(driver);
    }
}
