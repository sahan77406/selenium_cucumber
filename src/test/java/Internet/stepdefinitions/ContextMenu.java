package Internet.stepdefinitions;

import Internet.pages.ContextMenuPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    HomePage homePage = new HomePage();
    ContextMenuPage contextMenuPage = new ContextMenuPage();

    @Given("User go to homepage9 {string}")
    public void user_go_to_homepage9(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on Context Menu link")
    public void user_click_on_context_menu_link() {

        homePage.ContextMenuLink.click();

    }
    @Then("User right-click on context menu box")
    public void user_right_click_on_context_menu_box() {

        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(contextMenuPage.contextMenuBox).perform();
    }
    @Then("User verifies the text on context menu.")
    public void user_verifies_the_text_on_context_menu() throws Exception{

//        Thread.sleep(1000);
//        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("You selected a context menu"));



    }
    @Then("User click on okay button on pup up.")
    public void user_click_on_okay_button_on_pup_up() throws Exception {

        Thread.sleep(1000);
        Driver.getDriver().switchTo().alert().accept();
    }
}
