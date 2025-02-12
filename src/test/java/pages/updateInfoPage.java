package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class updateInfoPage {
    public updateInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginbutton;

    @FindBy(xpath = "//a[normalize-space()='Update Contact Info']")
    public WebElement updateInfoSection;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfileButton;
}
