package Internet.stepdefinitions;

import Internet.pages.EntryAdPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class EntryAd {

    HomePage homePage = new HomePage();
    EntryAdPage entryAdPage = new EntryAdPage();

    @Given("User go to homepage8 {string}")
    public void user_go_to_homepage8(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }

    @When("User click on Entry Ad link")
    public void user_click_on_entry_ad_link() throws Exception{




       homePage.EntryAdLink.click();

        Thread.sleep(1000);

    }

    @Then("User verifies that modal window pop ups.")
    public void user_verifies_that_modal_window_pop_ups() throws Exception{

        //Assert.assertEquals(entryAdPage.getModalText(), "THIS IS A MODAL WINDOW");

        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().switchTo().activeElement().getText().contains("THIS IS A MODAL WINDOW"));



    }

    @Then("User closes modal windows")
    public void user_closes_modal_windows() {


        //Driver.getDriver().switchTo().alert().dismiss();
        entryAdPage.modalCloseLink.click();

    }

    @Then("User reopens modal window")
    public void user_reopens_modal_window() {

        entryAdPage.restartModal.click();

    }

    @Then("User verifies that modal window pop ups2.")
    public void user_verifies_that_modal_window_pop_ups2() throws Exception{
        Thread.sleep(1000);
        //Assert.assertEquals(Driver.getDriver().switchTo().alert().getText(), "THIS IS A MODAL WINDOW");

        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().switchTo().activeElement().getText().contains("THIS IS A MODAL WINDOW"));
    }
}
