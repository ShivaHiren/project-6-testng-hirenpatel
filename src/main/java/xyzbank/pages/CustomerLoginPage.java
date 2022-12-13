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

public class CustomerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Login')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Logout')]")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath="//select[@id='userSelect']")
    WebElement name;

    public void yourName() {
        Reporter.log(" Select customer name ");
        selectByIndexFromDropDown(name, 6);

    }

    public void clickOnLoginButton() {
        Reporter.log(" Click on login button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login button ");
    }

    public void clickOnLogoutButton() {
        Reporter.log(" Click on logout button " + logoutButton.toString());
        clickOnElement(logoutButton);
        CustomListeners.test.log(Status.PASS, "Click on logout button ");
    }
}
