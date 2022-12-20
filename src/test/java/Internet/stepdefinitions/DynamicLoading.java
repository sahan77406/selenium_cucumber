package Internet.stepdefinitions;

import Internet.pages.DynamicLoadingPage;
import Internet.pages.Example1Page;
import Internet.pages.Example2Page;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import Internet.utilities.WindowsManager;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicLoading {

    HomePage homePage = new HomePage();
    DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
    Example1Page example1Page = new Example1Page();
    Example2Page example2Page = new Example2Page();


    @Given("User go to homepage11 {string}")
    public void user_go_to_homepage11(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }

    @When("User click on Dynamic Loading link")
    public void user_click_on_dynamic_loading_link() throws Exception{

        homePage.DynamicLoadingLink.click();
        Thread.sleep(1000);

    }

    @When("User click on Example1 link")
    public void user_click_on_example1_link() throws Exception{

        dynamicLoadingPage.Example1Link.click();
        Thread.sleep(1000);



    }

    @Then("User click on start button and wait for loading")
    public void user_click_on_start_button_and_wait_for_loading() throws Exception{

        example1Page.startButton.click();

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(Driver.getDriver().findElement(example1Page.loadingIcon)));
    }

    @Then("User verifies the text in the page")
    public void user_verifies_the_text_in_the_page() throws Exception{

        Assert.assertEquals(example1Page.loadedText.getText(), "Hello World!");
        Thread.sleep(1000);

    }

    @Then("User goes back to Dynamic Loading page")
    public void user_goes_back_to_dynamic_loading_page() throws Exception{

        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();
        Thread.sleep(1000);

    }

    @When("User click on Example2 link")
    public void user_click_on_example2_link() throws Exception{

        dynamicLoadingPage.Example2Link.click();
        Thread.sleep(1000);

    }

    @Then("User click on start button and wait for loading2")
    public void user_click_on_start_button_and_wait_for_loading2() throws Exception{

        example2Page.startButton.click();

        FluentWait wait = new FluentWait(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(
                Driver.getDriver().findElement(example2Page.loadingIcon)));

    }

    @Then("User verifies the text in the page1")
    public void user_verifies_the_text_in_the_page1() throws Exception {

        Assert.assertEquals(example2Page.loadedText.getText(), "Hello World!");
        Thread.sleep(1000);

    }

}
