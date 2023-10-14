package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginpage {


    public loginpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement singUpLoginButton;
    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUpVerify;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement singUpButton;
    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement generMr;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement pasword;
    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement days;
    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement months;
    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement years;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement option;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@data-qa='company']")
    public WebElement company;
    @FindBy(xpath="//input[@data-qa='address']")
    public WebElement adress;
    @FindBy(xpath = "//input[@data-qa='address2']")
    public WebElement adress2;
    @FindBy(xpath = "//select[@data-qa='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobilenumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement crateaccount;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInfor;
    @FindBy(xpath = "//b")
    public WebElement accountCreated;
    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement createContinue;
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement logged;
    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//b")
    public WebElement accountDeleted;
    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement deleteCountine;






}
