package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import pages.billPage;
import utilities.ConfigReader;
import utilities.Driver;

public class billPaySteps {

    billPage billpage = new billPage();

    @And("User enter name")
    public void userEnterName() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);
        billpage.username.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("User enter password")
    public void userEnterPassword() {
        billpage.password.sendKeys(ConfigReader.getProperty("password"));
        billpage.loginbutton.click();
    }

    @And("User click billPay section")
    public void userClickBillPaySection() {
        billpage.billpaySection.click();
//        billpage.billpaySection.sendKeys(ConfigReader.getProperty("name2"));
    }

    @And("User enter payeeName")
    public void userEnterPayeeName() throws InterruptedException {
        Thread.sleep(3000);
        billpage.payeeName.sendKeys(ConfigReader.getProperty("name2"));
    }

    @And("User enter address")
    public void userEnterAddress() throws InterruptedException {
        Thread.sleep(1000);
        billpage.payeeStreet.sendKeys(ConfigReader.getProperty("addressSecond"));
    }

    @And("User enter city")
    public void userEnterCity() {
        billpage.payeeCity.sendKeys(ConfigReader.getProperty("secondCity"));
    }

    @And("User enter state")
    public void userEnterState() {
        billpage.payeeState.sendKeys(ConfigReader.getProperty("state2"));

    }

    @And("User enter zipcode")
    public void userEnterZipcode() throws InterruptedException {
        Thread.sleep(3000);
        billpage.payeeZipcode.sendKeys(ConfigReader.getProperty("zip"));
    }

    @And("User enter phone")
    public void userEnterPhone() {
        billpage.payeePhone.sendKeys(ConfigReader.getProperty("phone"));
    }

    @And("User enter account")
    public void userEnterAccount() {
        billpage.account.sendKeys(ConfigReader.getProperty("account"));
    }

    @And("User enter verifyAccount")
    public void userEnterVerifyAccount() {
        billpage.verifyAccount.sendKeys(ConfigReader.getProperty("account"));
    }

    @And("User enter amount")
    public void userEnterAmount() {
        billpage.amount.sendKeys(ConfigReader.getProperty("amount"));
    }

    @And("User click sendPayment button")
    public void userClickSendPaymentButton() {
        billpage.sendPaymentButton.click();
    }
}
