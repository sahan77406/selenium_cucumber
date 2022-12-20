package Internet.stepdefinitions;

import Internet.pages.HomePage;
import Internet.pages.KeyPressesPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class KeyPresses {

    HomePage homePage = new HomePage();
    KeyPressesPage keyPressesPage = new KeyPressesPage();

    @Given("User go to homepage4 {string}")
    public void user_go_to_homepage4(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }
    @When("User click on Key Presses link")
    public void user_click_on_key_presses_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        homePage.KeyPressesLink.click();
    }
    @Then("User enters his name")
    public void user_enters_his_name() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        keyPressesPage.textField.sendKeys("Mehmet");
    }

    @Then("User verifies his name")
    public void user_verifies_his_name() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        String text = keyPressesPage.resultText.getText();
        System.out.println(text);
        Assert.assertTrue(keyPressesPage.resultText.isDisplayed());
    }

    @Then("User delete his name")
    public void user_delete_his_name() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        keyPressesPage.textField.clear();
    }
    @Then("User enter question mark")
    public void user_enter_question_mark() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        keyPressesPage.textField.sendKeys("Sahan");
        keyPressesPage.textField.sendKeys(Keys.chord(Keys.SHIFT, "?"));
    }
}
