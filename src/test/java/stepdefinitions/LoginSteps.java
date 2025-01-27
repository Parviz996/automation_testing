package stepdefinitions;

import io.cucumber.java.en.And;
import lombok.extern.slf4j.Slf4j;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

@Slf4j
public class LoginSteps {

    LoginPage login = new LoginPage();

    @And("Enter the username")
    public void enterTheUsername() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);
        login.username.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("Enter the password")
    public void enterThePassword() {
        login.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Click Login button")
    public void clickLoginButton() {
        login.loginbutton.click();
    }
}
