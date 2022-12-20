package Internet.stepdefinitions;

import Internet.pages.HomePage;
import Internet.pages.LoginPage;
import Internet.pages.SecureAreaPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FormAuthentication {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Given("User go to homepage {string}")
    public void user_go_to_homepage(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on Form Authentication link")
    public void user_click_on_form_authentication_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        homePage.FormAuthentication.click();
    }
    @Then("User enter username and password {string} {string}")
    public void user_enter_username_and_password(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        loginPage.username.sendKeys(user);
        loginPage.password.sendKeys(pass);
    }
    @Then("User click on login button")
    public void user_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        loginPage.loginButton.click();
    }
    @Then("User is on the secure area page")
    public void user_is_on_the_secure_area_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(secureAreaPage.alertText.isDisplayed());
    }
    @Then("User click on log out button to exit the page")
    public void user_click_on_log_out_button_to_exit_the_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        secureAreaPage.logout.click();
    }

}


