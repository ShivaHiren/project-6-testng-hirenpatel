package xyzbank.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import xyzbank.customlisteners.CustomListeners;
import xyzbank.utility.Utility;

public class CustomersPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Home')]")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankManagerLogin1;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccount;

  @CacheLookup
  @FindBy(xpath="(//button[@class='btn btn-primary btn-lg'])[2]")
   WebElement clickOnBankManagerLogin;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Customer Login')]")
    WebElement reCustomerLogin;

    @CacheLookup
    @FindBy(xpath="//input[@ng-model='amount']")
    WebElement withdrawlAmount;

    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement clickOnWithdrawButton;

    public void clickOnWithdrawButtonAgain(){
        Reporter.log("Click on Withdraw button " + clickOnWithdrawButton.toString());
        clickOnElement(clickOnWithdrawButton);
        CustomListeners.test.log(Status.PASS, "Click on Withdraw button ");
    }

    public void recustomerLogin(){
        Reporter.log(" Click on customer loin tab " + reCustomerLogin.toString());
        clickOnElement(reCustomerLogin);
        CustomListeners.test.log(Status.PASS, "Click on customer login tab ");
    }

    public void clickOnBankManagerLogin1(){
        Reporter.log(" Click on bank manager tab " + clickOnBankManagerLogin1.toString());
        clickOnElement(clickOnBankManagerLogin1);
        CustomListeners.test.log(Status.PASS, " Click on bank manager tab ");
    }
    public void clickOnOkButtonOfPopup(){
        acceptAlert();
    }

    public void enterWithdrawlAmount(String amount){
        Reporter.log("Enter amount " + withdrawlAmount.toString());
        sendTextToElement(withdrawlAmount,amount);
        CustomListeners.test.log(Status.PASS, "Enter amount ");
    }
    public void openAccount() {
        Reporter.log(" Click on open button " + openAccount.toString());
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS, "Click on open button ");}

    public void customerName1() {
        Reporter.log(" Select product in order ");
        Select productOrder = new Select(driver.findElement(By.xpath("//select[@id='userSelect']")));
        productOrder.selectByIndex(6);
    }

    public void clickHomeButton() {
        Reporter.log(" Click on home button " + homeButton.toString());
        clickOnElement(homeButton);
        CustomListeners.test.log(Status.PASS, "Click on home button ");
    }
    public void clickOnBankManagerLogin(){
        Reporter.log(" Click on bank manager tab " + clickOnBankManagerLogin.toString());
        clickOnElement(clickOnBankManagerLogin);
        CustomListeners.test.log(Status.PASS, " Click on bank manager tab ");
    }

}
