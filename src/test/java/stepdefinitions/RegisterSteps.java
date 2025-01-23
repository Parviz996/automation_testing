package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterSteps {

    RegisterPage register = new RegisterPage();

    @And("User visits the url")
    public void userVisitsTheUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @And("Click register section")
    public void clickRegisterSection() throws InterruptedException {
        Thread.sleep(5000);
        register.registerLink.click();

    }

    @And("User writes firstName")
    public void userWritesFirstName() {
    }

    @And("User writes lastName")
    public void userWritesLastName() {
    }

    @And("User writes Address")
    public void userWritesAddress() {
    }

    @And("User writes City")
    public void userWritesCity() {
    }

    @And("User writes State")
    public void userWritesState() {
    }

    @And("User writes Zipcode")
    public void userWritesZipcode() {
    }

    @And("User writes Phone")
    public void userWritesPhone() {
    }

    @And("User writes SSN")
    public void userWritesSSN() {
    }

    @And("User writes Username")
    public void userWritesUsername() {
    }

    @And("User writes Password")
    public void userWritesPassword() {
    }

    @And("User writes Confirm")
    public void userWritesConfirm() {
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() {
    }
}
