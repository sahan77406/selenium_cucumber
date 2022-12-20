package Internet.stepdefinitions;

import Internet.pages.DropdownPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    HomePage homePage = new HomePage();
    DropdownPage dropdownPage = new DropdownPage();

    @Given("User go to homepage2 {string}")
    public void user_go_to_homepage2(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }
    @When("User click on Dropdown link")
    public void user_click_on_dropdown_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        homePage.DropdownLink.click();
    }
    @Then("User chose Option1")
    public void user_chose_option1() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();


        Select select = new Select(dropdownPage.DropdownField);
        select.selectByVisibleText("Option 1");
        WebElement option = select.getFirstSelectedOption();
        String SelectedText = option.getText();
        Assert.assertEquals(SelectedText, "Option 1");

    }
    @Then("User chose Option2")
    public void user_chose_option2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Select select = new Select(dropdownPage.DropdownField);
        select.selectByVisibleText("Option 2");
        WebElement option = select.getFirstSelectedOption();
        String SelectedText = option.getText();
        Assert.assertEquals(SelectedText, "Option 2");
    }

}
