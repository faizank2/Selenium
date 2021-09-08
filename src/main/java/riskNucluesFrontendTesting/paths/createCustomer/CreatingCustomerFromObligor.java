package riskNucluesFrontendTesting.paths.createCustomer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import riskNucluesFrontendTesting.settings.PageObject;

import java.util.Random;

/**
 * This class contain xpath to create full customer from obligor,
 * Contain Basic section Xpath
 */
public class CreatingCustomerFromObligor extends PageObject {

    Random rand = new Random(); //instance of random class
    int upperbound = 200;
    //generate random values from 0-24
    int int_random = rand.nextInt(upperbound);

    private final String BR_CODE = "AutomatedCustomer"+int_random;
    private final String BR_TITLE = "AutomatedCustomer"+int_random;
    private final String BR_CIF = "5";
    private final String BR_REFFERING = "AutomatedOfficer";
    private final String BR_AccountNo = "12356789";
    private final String BR_IdTypeValue = "4220185595633";
    private final String BR_FamilyAssoc = "AutomatedTesting";

    public String getBR_FamilyAssoc() {
        return BR_FamilyAssoc;
    }

    public String getBR_IdTypeValue() {
        return BR_IdTypeValue;
    }

    public String getBR_AccountNo() {
        return BR_AccountNo;
    }

    public String getBR_REFFERING() {
        return BR_REFFERING;
    }

    public String getBR_CIF() {
        return BR_CIF;
    }

    public String getBR_CODE() {
        return BR_CODE;
    }

    public String getBR_TITLE() {
        return BR_TITLE;
    }

    //click
    @FindBy(xpath= "//ul[@id='main-menu-navigation']/li[3]/ul/li/a/span")
    private WebElement menu_obligor;

    //click
    @FindBy(xpath= "(//button[@type='button'])[2]")
    private WebElement obligor_add;

    //input
    @FindBy(xpath= "//input[@id='borrowerCode']")
    private WebElement obligor_brCode;

    //input
    @FindBy(xpath= "//input[@id='title']")
    private WebElement obligor_addtitle;

    //click
    @FindBy(xpath= "//div[@id='collapseOne']/div/form/div/div/div[5]/fieldset/app-dropdown/ng-select/div")
    private WebElement obligor_addExisitingCustomer;


    //click
    @FindBy(xpath= "//ng-dropdown-panel/div/div[2]/div")
    private WebElement obligor_addExisitingCustomerSelect;

    //click CIF
    @FindBy(xpath= "//input[@id='coreBankingId']")
    private WebElement obligor_cifSelect;

    //click initiating unit
    @FindBy(xpath= "//app-dropdown-tree-dynamic-single-select/i")
    private WebElement obligor_iU;

    //click Initiating unit from list
    @FindBy(xpath= "//label[contains(.,'Commercial Banking')]")
    private WebElement obligor_iUSelect;

    //click
    @FindBy(xpath= "//div[9]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement obligor_branch;

    //click
    @FindBy(xpath= "//ngx-treeview-item[3]/div/div/div[2]/label")
    private WebElement obligor_branchSelect;

    //click
    @FindBy(xpath= "//div[10]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement obligor_obligorGroup;

    //click
    @FindBy(xpath= "//div[2]/label")
    private WebElement obligor_obligorGroupSelect;

    //Checking from here
    //click
    @FindBy(xpath= "//div[11]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement obligor_customerType;

    //click
    @FindBy(xpath= "//ngx-treeview-item[4]/div/div/div[2]/label")
    private WebElement obligor_customerTypeSelect;

    //click
    @FindBy(xpath= "//div[@id='collapseOne']/div/form/div/div/div[12]/fieldset/app-dropdown-tree-dynamic-single-select/i")
    private WebElement obligor_legalStatus;

    //click
    @FindBy(xpath= "//ngx-treeview-item[2]/div/div/div[2]/label")
    private WebElement obligor_legalStatusSelect;

    //input
    @FindBy(xpath= "//input[@id='nameOfIntroducer']")
    private WebElement obligor_referringOfficer;

    //input
    @FindBy(xpath= "//input[@id='accountNumber']")
    private WebElement obligor_accountNo;

    //click
    @FindBy(xpath= "//div[15]/fieldset/app-dropdown/ng-select/div")
    private WebElement obligor_accountStartegy;

    //click
    @FindBy(xpath= "//ng-dropdown-panel/div/div[2]/div")
    private WebElement obligor_accountStartegySelect;

    //click
    @FindBy(xpath= "//div[18]/fieldset/app-dropdown/ng-select/div/div/div[2]")
    private WebElement obligor_idType;

    //click
    @FindBy(xpath= "//ng-dropdown-panel/div/div[2]/div")
    private WebElement obligor_idTypeSelect;

    //input
    @FindBy(xpath= "//input[@id='formatValue']")
    private WebElement obligor_idTypeValue;

    //input
    @FindBy(xpath= "//textarea[@id='familyAssociation']")
    private WebElement obligor_familyAssociation;

    //click
    @FindBy(xpath= "//button[contains(.,' Save')]")
    private WebElement obligor_save;

    public CreatingCustomerFromObligor(WebDriver driver) {
        super(driver);
    }

    public void pressObligorMenu(){
        this.menu_obligor.click();
    }

    public void pressObligorAdd(){
        this.obligor_add.click();
    }

    public void enterBrCode(){
        this.obligor_brCode.sendKeys(BR_CODE);
    }

    public void enterBrTitle(){
        this.obligor_addtitle.sendKeys(BR_TITLE);
    }

    public void pressExisitigCustomer(){
        this.obligor_addExisitingCustomer.click();
    }

    public void pressExisitigCustomerOption(){
        this.obligor_addExisitingCustomerSelect.click();
    }

    public void enterCIF(){
        this.obligor_cifSelect.sendKeys(BR_CIF);
    }

    public void pressInitiatingUnit(){
        this.obligor_iU.click();
    }

    public void pressInitiatingUnitValue(){
        this.obligor_iUSelect.click();
    }

    public void pressBranch(){
        this.obligor_branch.click();
    }

    public void pressBranchSelect(){
        this.obligor_branchSelect.click();
    }

    public void pressObligorGroup(){
        this.obligor_obligorGroup.click();
    }

    public void pressObligorGroupSelect(){
        this.obligor_obligorGroupSelect.click();
    }

    public void pressCustomerType(){
        this.obligor_customerType.click();
    }

    public void pressCustomerTypeSelect(){
        this.obligor_customerTypeSelect.click();
        WebElement m= obligor_customerTypeSelect;
        String originalTitle = m.getText();
        System.out.println(originalTitle);
    }

    public void pressLegalStatus(){
        this.obligor_legalStatus.click();
    }

    public void pressLegalStatusSelect(){
        this. obligor_legalStatusSelect.click();
    }

    public void enterReferringOfficer(){
        this.obligor_referringOfficer.sendKeys(BR_REFFERING);
    }

    public void enterObligorNo(){
        this.obligor_accountNo.sendKeys(BR_AccountNo);
    }

    public void pressAccountStrategy(){
        this.obligor_accountStartegy.click();
    }

    public void pressAccountStrategySelect(){
        this.obligor_accountStartegySelect.click();
    }

    public void pressIdType(){
        this.obligor_idType.click();
    }

    public void pressIdTypeSelect(){
        this.obligor_idTypeSelect.click();
    }

    public void enterIdTypeValue(){
        this.obligor_idTypeValue.sendKeys(BR_IdTypeValue);
    }

    public void enterFamilyAssocValue(){
        this.obligor_familyAssociation.sendKeys(BR_FamilyAssoc);
    }

    public void pressSaveButton(){
        this.obligor_save.click();
    }


}
