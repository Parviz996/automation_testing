package stepdefinitions;

import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @And("Enter the username")
    public void enterTheUsername() {
    }

    @And("Enter the password")
    public void enterThePassword() {
    }

    @And("Click Login button")
    public void clickLoginButton() {
    }
}
