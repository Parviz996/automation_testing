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
        Thread.sleep(5000);
        billpage.billpaySection.sendKeys(ConfigReader.getProperty("name2"));
//        billpage.billpaySection.click();
    }

    @And("User enter address")
    public void userEnterAddress() {
//        billpage.payeeName.sendKeys(ConfigReader.getProperty("addressSecond"));
        billpage.payeeName.sendKeys(ConfigReader.getProperty("addressSecond"));
    }

    @And("User enter city")
    public void userEnterCity() {
        billpage.payeeCity.sendKeys(ConfigReader.getProperty(""));
    }

    @And("User enter state")
    public void userEnterState() {
    }

    @And("User enter zipcode")
    public void userEnterZipcode() {
    }

    @And("User enter phone")
    public void userEnterPhone() {
    }

    @And("User enter account")
    public void userEnterAccount() {
    }

    @And("User enter verifyAccount")
    public void userEnterVerifyAccount() {
    }

    @And("User enter amount")
    public void userEnterAmount() {
    }

    @And("User click sendPayment button")
    public void userClickSendPaymentButton() {
    }
}
