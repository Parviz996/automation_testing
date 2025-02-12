package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.updateInfoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class updateInfoSteps {

    updateInfoPage  updateinfo = new updateInfoPage();

    @Given("User includes page")
    public void userIncludesPage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);

    }

    @And("User sends name")
    public void userSendsName() {
    }

    @And("User sends password")
    public void userSendsPassword() {
    }

    @And("User clicked button")
    public void userClickedButton() {
    }

    @And("Click UpdateContactInfo section")
    public void clickUpdateContactInfoSection() {
    }

    @And("Update address")
    public void updateAddress() {
    }

    @And("Update zipcode")
    public void updateZipcode() {
    }

    @And("Click Update button")
    public void clickUpdateButton() {
    }

    @Then("User should see updated contact info")
    public void userShouldSeeUpdatedContactInfo() {
    }
}
