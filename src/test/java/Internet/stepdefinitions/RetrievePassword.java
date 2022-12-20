package Internet.stepdefinitions;

import Internet.pages.ForgotPasswordPage;
import Internet.pages.HomePage;
import Internet.pages.InternalServerErrorPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RetrievePassword {

    HomePage homePage = new HomePage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    InternalServerErrorPage internalServerErrorPage = new InternalServerErrorPage();

    @Given("User go to homepage1 {string}")
    public void user_go_to_homepage1(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }
    @When("User click on Forgot Password link")
    public void user_click_on_forgot_password_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        homePage.ForgotPassword.click();
    }
    @Then("User enter email address {string}")
    public void user_enter_email_address(String email) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        forgotPasswordPage.emailField.sendKeys(email);

    }
    @Then("User click on retrieve password button")
    public void user_click_on_retrieve_password_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        forgotPasswordPage.retrievePasswordButton.click();
    }
    @Then("User see Internal Server Error message")
    public void user_see_internal_server_error_message() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(internalServerErrorPage.errorText.isDisplayed());
    }
}
