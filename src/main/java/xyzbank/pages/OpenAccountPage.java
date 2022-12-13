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

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccountTab;

    @CacheLookup
    @FindBy(xpath = "//select[contains@='Jhon Wick']")
    WebElement customerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyPound;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectCustomerName;


    public void openAccount() {
        Reporter.log(" Click on open account tab " + openAccountTab.toString());
        clickOnElement(openAccountTab);
        CustomListeners.test.log(Status.PASS, " Click on open account tab ");
    }

    public void selectCustomerName() {
        Reporter.log(" Select product in order ");
        selectByIndexFromDropDown(selectCustomerName, 6);
    }

    public void currencyPound() {
        Reporter.log(" Select currency ");
        selectByIndexFromDropDown(currencyPound, 2);
    }

    public void processButton() {
        Reporter.log(" Click on process button " + processButton.toString());
        clickOnElement(processButton);
        CustomListeners.test.log(Status.PASS, " Click on process button  ");
    }

    public void findCustomer() {
        Reporter.log(" Click on find customer tab ");
        WebElement findcustomer;
        CustomListeners.test.log(Status.PASS, "Click on find customer tab ");
    }
}
