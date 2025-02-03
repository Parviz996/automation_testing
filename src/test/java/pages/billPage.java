package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class billPage {
    public billPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginbutton;

    @FindBy(xpath = "//a[normalize-space()='Bill Pay']")
    public WebElement billpaySection;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payeeStreet;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payeeCity;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payeeState;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payeeZipcode;

    //phone;
    @FindBy(xpath = "//input[@id='e3d4dccc-8e87-40ef-a206-52b232ea65af']")
    public WebElement payeePhone;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement account;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentButton;

}
