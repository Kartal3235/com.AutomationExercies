package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.loginpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class loginStepDef extends ReusableMethods {

    loginpage login=new loginpage();
    Faker faker=new Faker();
    Actions action=new Actions(Driver.getDriver());



    @Given("Go to url")
    public void go_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertEquals(ConfigReader.getProperty("automationUrl"),Driver.getDriver().getCurrentUrl());
        waitFor(3);

    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {

        Assert.assertTrue(login.newUserSignUpVerify.isDisplayed());
        waitFor(3);

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {

        login.name.sendKeys("abc");
        waitFor(3);
        login.email.sendKeys("abc@gmail.c");
        waitFor(2);

    }
    @Then("Click Signup button")
    public void click_signup_button() {

        login.singUpButton.click();
    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_ınformatıon_is_visible() {

        Assert.assertTrue(login.enterAccountInfor.isDisplayed());
        waitFor(2);
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

        action.moveToElement(login.generMr).click().perform();
        waitFor(3);
        login.pasword.sendKeys("123456");
        waitFor(3);
        Select select=new Select(login.days);
        select.selectByValue("25");
        waitFor(2);
        Select select1=new Select(login.months);
        select1.selectByValue("6");
        waitFor(2);
        Select select2=new Select(login.years);
        select2.selectByValue("2021");
        waitFor(3);

    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        jsScroll(login.newsletter);
        waitFor(3);
        jsclick(login.newsletter);

    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        jsclick(login.option);

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        login.firstname.sendKeys(faker.name().firstName());
        waitFor(3);
        login.lastname.sendKeys(faker.name().lastName());
        waitFor(3);
        login.company.sendKeys(faker.animal().name());
        waitFor(3);
        login.adress.sendKeys(faker.address().fullAddress());
        waitFor(3);
        login.adress2.sendKeys(faker.address().fullAddress());
        waitFor(3);
        Select slct=new Select(login.country);
        slct.selectByValue("India");
        waitFor(3);
        login.state.sendKeys(faker.address().state());
        waitFor(3);
        login.city.sendKeys(faker.address().city());
        waitFor(3);
        login.zipCode.sendKeys(faker.address().zipCode());
        waitFor(3);
        login.mobilenumber.sendKeys(faker.phoneNumber().phoneNumber());
        waitFor(3);

    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        login.crateaccount.click();
    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {

        Assert.assertTrue(login.accountCreated.isDisplayed());
        waitFor(3);
    }
    @Then("Click Continue button")
    public void click_continue_button() {

        login.createContinue.click();
        waitFor(3);

    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

        Assert.assertTrue(login.logged.isDisplayed());
        waitFor(3);
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {

        login.deleteAccountButton.click();
        waitFor(2);
    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {

        Assert.assertTrue(login.accountDeleted.isDisplayed());
        waitFor(3);
    }


    @And("Click on Signup Login button")
    public void clickOnSignupLoginButton() {

        login.singUpLoginButton.click();
        waitFor(2);
    }
}
