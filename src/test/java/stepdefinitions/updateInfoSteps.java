package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.updateInfoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class updateInfoSteps {

    updateInfoPage updateinfo = new updateInfoPage();

    @Given("User includes page")
    public void userIncludesPage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);

    }

    @And("User sends name")
    public void userSendsName() throws InterruptedException {
//        updateinfo.username.sendKeys(ConfigReader.getProperty("username"));
        updateinfo.username.sendKeys(ConfigReader.getProperty("username"));
        Thread.sleep(3000);
    }

    @And("User sends password")
    public void userSendsPassword() {
//        updateinfo.password.sendKeys(ConfigReader.getProperty("password"));
        updateinfo.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("User clicked button")
    public void userClickedButton() {
        updateinfo.loginbutton.click();
    }

    @And("Click UpdateContactInfo section")
    public void clickUpdateContactInfoSection() {
        updateinfo.updateInfoSection.click();
    }

    @And("Update address")
    public void updateAddress() throws InterruptedException {
        Thread.sleep(3000);
        updateinfo.address.clear();
        updateinfo.address.sendKeys(ConfigReader.getProperty("addressSecond"));
//        updateinfo.address.sendKeys(ConfigReader.getProperty("address"));
    }

    @And("Update zipcode")
    public void updateZipcode() {
        updateinfo.zipCode.clear();
        updateinfo.zipCode.sendKeys(ConfigReader.getProperty("zip2"));
    }

    @And("Click Update button")
    public void clickUpdateButton() {
        updateinfo.updateProfileButton.click();
    }

    @Then("User should see updated contact info")
    public void userShouldSeeUpdatedContactInfo() {
    }
}
