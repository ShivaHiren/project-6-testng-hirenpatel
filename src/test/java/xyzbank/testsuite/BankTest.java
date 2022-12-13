package xyzbank.testsuite;


import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import xyzbank.customlisteners.CustomListeners;
import xyzbank.pages.*;
import xyzbank.testbase.BaseTest;

@Listeners(CustomListeners.class)

public class BankTest extends BaseTest {
    AddCustomerPage addCustomerPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        addCustomerPage = new AddCustomerPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage = new HomePage();
        openAccountPage = new OpenAccountPage();
        accountPage = new AccountPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {

        homePage.clickOnBankManagerLogin();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.enterFirstNameField("Jhon");
        addCustomerPage.enterLastNameField("Wick");
        addCustomerPage.enterPostcode("LL1 10LL");
        addCustomerPage.clickOnAddCustomerTab();
        Assert.assertTrue(addCustomerPage.getPopMessage().contains("Customer added successfully"));
        addCustomerPage.clickOnPop();
    }


    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {

        homePage.clickOnBankManagerLogin();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.reAddCustomer();
        customersPage.clickHomeButton();
        customersPage.clickOnBankManagerLogin();
        openAccountPage.openAccount();
        openAccountPage.selectCustomerName();
        openAccountPage.currencyPound();
        openAccountPage.processButton();
        Assert.assertTrue(addCustomerPage.getPopMessage().contains("Account created successfully"));
        addCustomerPage.clickOnPop();
    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {

        homePage.clickOnBankManagerLogin();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.reAddCustomer();
        customersPage.clickHomeButton();
        homePage.customerLogin();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        Assert.assertEquals("Logout", "Logout");
        customerLoginPage.clickOnLogoutButton();
        Assert.assertEquals("Your Name", "Your Name");

    }


    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        customersPage.clickOnBankManagerLogin1();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.reAddCustomer();
        Thread.sleep(500);
        customersPage.openAccount();
        customerLoginPage.yourName();
        openAccountPage.currencyPound();
        openAccountPage.processButton();
        customersPage.clickOnOkButtonOfPopup();
        Thread.sleep(500);
        homePage.clickHomeButton();
        customersPage.recustomerLogin();
        customersPage.customerName1();
        accountPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        Thread.sleep(500);
        accountPage.enterAmount("1000");
        accountPage.clickOnDeposit();
        Assert.assertEquals("Deposit Successful", "Deposit Successful");

    }


    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        customersPage.clickOnBankManagerLogin1();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.reAddCustomer();
        customersPage.clickHomeButton();
        Thread.sleep(500);
        homePage.clickOnBankManagerLogin();
        customersPage.openAccount();
        customerLoginPage.yourName();
        openAccountPage.currencyPound();
        openAccountPage.processButton();
        customersPage.clickOnOkButtonOfPopup();
        Thread.sleep(500);
        homePage.clickHomeButton();
        homePage.customerLogin();
        openAccountPage.selectCustomerName();
        accountPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount("1000");
        accountPage.clickOnDeposit();
        Thread.sleep(500);
        accountPage.clickOnwithdrawlButton();
        Thread.sleep(500);
        customersPage.enterWithdrawlAmount("50");
        customersPage.clickOnWithdrawButtonAgain();
        Assert.assertEquals("Transaction Successful", "Transaction Successful");

    }
}