package xyzbank.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import xyzbank.customlisteners.CustomListeners;
import xyzbank.utility.Utility;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//button[@ng-click='addCust()']")
    WebElement clickOnAddCustomer;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement enterPostcode;

    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement addCustomer;


    public void clickOnAddCustomer(){
        Reporter.log("Click on  add customer button " + clickOnAddCustomer.toString());
        clickOnElement(clickOnAddCustomer);
        CustomListeners.test.log(Status.PASS, "Click on add customer button ");
    }
    public void enterFirstNameField(String firstname){
        Reporter.log("Enter first name " + firstNameField.toString());
        sendTextToElement(firstNameField,firstname);
        CustomListeners.test.log(Status.PASS, "Enter first name ");
    }
    public void enterLastNameField(String lastName){
        Reporter.log("Enter second name " + lastNameField.toString());
        sendTextToElement(lastNameField,lastName);
        CustomListeners.test.log(Status.PASS, "Enter second name ");
    }
    public void enterPostcode(String postcode){
        Reporter.log("Enter postcode " + enterPostcode.toString());
        sendTextToElement(enterPostcode, postcode);
        CustomListeners.test.log(Status.PASS, "Enter postcode ");
    }
    public void clickOnAddCustomerTab(){
        Reporter.log("Click on  add customer button " + addCustomer.toString());
        clickOnElement(addCustomer);
        CustomListeners.test.log(Status.PASS, "Click on add customer button ");
    }
    public void clickOnPop(){
        acceptAlert();
        CustomListeners.test.log(Status.PASS, "Click on pop up ");
    }
    public String getPopMessage(){
        Reporter.log("Pop up message ");
        CustomListeners.test.log(Status.PASS, "Click on popup message ");
        return getTextFromAlert();
    }
    public void reAddCustomer(){
        sendTextToElement(firstNameField,"Jhon");
        sendTextToElement(lastNameField,"Wick");
        sendTextToElement(enterPostcode, "LL0 10LL");
        clickOnAddCustomerTab();
        acceptAlert();

    }

}
