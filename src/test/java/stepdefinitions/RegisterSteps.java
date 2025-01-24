package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

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
        register.firstName.sendKeys(ConfigReader.getProperty("firstName"));
    }

    @And("User writes lastName")
    public void userWritesLastName() {
        register.lastName.sendKeys(ConfigReader.getProperty("lastName"));
    }

    @And("User writes Address")
    public void userWritesAddress() {
        register.address.sendKeys((ConfigReader.getProperty("address")));
    }

    @And("User writes City")
    public void userWritesCity() {
        register.city.sendKeys((ConfigReader.getProperty("city")));
    }

    @And("User writes State")
    public void userWritesState() {
        register.state.sendKeys((ConfigReader.getProperty("state")));
    }

    @And("User writes Zipcode")
    public void userWritesZipcode() {
        register.zipCode.sendKeys((ConfigReader.getProperty("zip")));
    }

    @And("User writes Phone")
    public void userWritesPhone() {
        register.phoneNumber.sendKeys(ConfigReader.getProperty("phone"));
    }

    @And("User writes SSN")
    public void userWritesSSN() {
        register.ssn.sendKeys((ConfigReader.getProperty("ssn")));
    }

    @And("User writes Username")
    public void userWritesUsername() {
        register.username.sendKeys((ConfigReader.getProperty("username")));
    }

    @And("User writes Password")
    public void userWritesPassword() {
        register.password.sendKeys((ConfigReader.getProperty("password")));
    }

    @And("User writes Confirm")
    public void userWritesConfirm() {
        register.repeatedPassword.sendKeys((ConfigReader.getProperty("password")));
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() {
        register.registerButton.click();

        String expectedResult = "Your account was created successfully. You are now logged in.";
        String actualResult =  driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")).getText();

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test uğurla tamamlandı.");
        } else {
            System.out.println("Test uğursuz oldu: Expected = " + expectedResult + ", Actual = " + actualResult);
        }
    }

}
