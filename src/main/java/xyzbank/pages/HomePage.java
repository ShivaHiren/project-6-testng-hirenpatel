package xyzbank.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import xyzbank.customlisteners.CustomListeners;
import xyzbank.utility.Utility;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Home')]")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankManagerLogin;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

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


    public void customerLogin(){
        Reporter.log(" Click on customer login tab " + customerLogin.toString());
        clickOnElement(customerLogin);
        CustomListeners.test.log(Status.PASS, "Click on customer login tab ");
    }


}
