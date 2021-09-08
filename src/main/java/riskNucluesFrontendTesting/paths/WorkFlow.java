package riskNucluesFrontendTesting.paths;

import riskNucluesFrontendTesting.settings.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkFlow extends PageObject {

    private final String USER_NAME = "admin";
    private final String PASSWORD = "123";
    private final String SearchKeyword = "full";

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getSearchKeyword() {
        return SearchKeyword;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }



    @FindBy(xpath= "//input[@type='text']")
    private WebElement user_name;

    @FindBy(xpath= "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement submit_button;

    @FindBy(xpath= "//span[contains(.,'Credit Applications')]")
    private WebElement menu_ca;

    @FindBy(xpath= "//input[@type='search']")
    private WebElement search_ca;

    @FindBy(xpath= "//input[@type='search']")
    private WebElement search_type;

    @FindBy(xpath= "//span[contains(.,'FullCustomerTesting')]")
    private WebElement selectFromSearch;

    @FindBy(css= ".ft-eye")
    private WebElement selectEye;

    public WorkFlow(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(){
        this.user_name.sendKeys(USER_NAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void pressCa(){
        this.menu_ca.click();
    }

    public void pressCaSearch(){
        this.search_ca.click();
    }

    public void typeFullCustomer(){
        this.search_type.sendKeys(SearchKeyword);
    }

    public void selectFromSearch(){
        this.selectFromSearch.click();
    }

    public void selectEye(){
        this.selectEye.click();
    }
}
