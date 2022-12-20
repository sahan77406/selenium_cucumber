package Internet.stepdefinitions;

import Internet.pages.HomePage;
import Internet.pages.HoversPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import Internet.utilities.WindowsManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers {



    HomePage homePage = new HomePage();
    HoversPage hoversPage = new HoversPage();

    @Given("User go to homepage3 {string}")
    public void user_go_to_homepage3(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }
    @When("User click on Hovers link")
    public void user_click_on_hovers_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        homePage.HoversLink.click();

    }

    @Then("User hovers over User1 and clicks on view profile")
    public void user_hovers_over_user1_and_clicks_on_view_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(hoversPage.Figure1).click(hoversPage.viewProfile1).build().perform();

    }
    @Then("User view User1 profile")
    public void user_view_user1_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(hoversPage.NotFound.isDisplayed());
        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();

    }
    @Then("User hovers over User2 and clicks on view profile")
    public void user_hovers_over_user2_and_clicks_on_view_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(hoversPage.Figure2).click(hoversPage.viewProfile2).build().perform();
    }
    @Then("User view User2 profile")
    public void user_view_user2_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(hoversPage.NotFound.isDisplayed());
        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();
        //Assert.assertEquals(hoversPage.NotFound, "Not Found");
    }

    @Then("User hovers over User3 and clicks on view profile")
    public void user_hovers_over_user3_and_clicks_on_view_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(hoversPage.Figure3).click(hoversPage.viewProfile3).build().perform();
    }
    @Then("User view User3 profile")
    public void user_view_user3_profile() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(hoversPage.NotFound.isDisplayed());
        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();
        //Assert.assertEquals(hoversPage.NotFound, "Not Found");
    }

}
