package xyzbank.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import xyzbank.customlisteners.CustomListeners;
import xyzbank.utility.Utility;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Login')]")
    WebElement accountLogin;

    @CacheLookup
    @FindBy(xpath="//button[@ng-click='deposit()']")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement enterAmount;

    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement clickOnDepositButton;

    @CacheLookup
    @FindBy(xpath="//button[@ng-click='withdrawl()']")
    WebElement withdrawlButton;

    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement clickOnWithdrawButton;

    public void clickOnWithdrawButton(){
        Reporter.log("Click on Withdraw button " + clickOnWithdrawButton.toString());
        clickOnElement(clickOnWithdrawButton);
        CustomListeners.test.log(Status.PASS, "Click on Withdraw button ");
    }

    public void clickOnwithdrawlButton(){
        Reporter.log("Click on Withdraw button " + withdrawlButton.toString());
        clickOnElement(withdrawlButton);
        CustomListeners.test.log(Status.PASS, "Click on Withdraw button ");
    }
    public void clickOnDeposit(){
        Reporter.log("Click on  logout button " + clickOnDepositButton.toString());
        clickOnElement(clickOnDepositButton);
        CustomListeners.test.log(Status.PASS, "Click on logout button ");
    }

   public void enterAmount(String amount){
       Reporter.log("Enter amount " + enterAmount.toString());
       sendTextToElement(enterAmount,amount);
       CustomListeners.test.log(Status.PASS, "Enter amount ");
   }

    public void clickOnDepositButton(){
        Reporter.log("Click on  deposit button " + depositButton.toString());
        clickOnElement(depositButton);
        CustomListeners.test.log(Status.PASS, "Click on deposit button ");
    }
    public void clickOnLoginButton(){
        Reporter.log("Click on  log in button " + accountLogin.toString());
        clickOnElement(accountLogin);
        CustomListeners.test.log(Status.PASS, "Click on log in button ");
    }

}
