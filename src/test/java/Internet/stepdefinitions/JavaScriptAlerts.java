package Internet.stepdefinitions;

import Internet.pages.HomePage;
import Internet.pages.JavaScriptAlertsPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import Internet.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

public class JavaScriptAlerts {

    HomePage homePage = new HomePage();
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();


    @Given("User go to homepage5 {string}")
    public void user_go_to_homepage5(String url) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on JavaScript Alerts link")
    public void user_click_on_java_script_alerts_link() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);",homePage.JavaScriptAlertsLink);
        homePage.JavaScriptAlertsLink.click();




    }
    @Then("User clicks on Click for JS Alert")
    public void user_clicks_on_click_for_js_alert() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //javaScriptAlertsPage.ClickForJSAlert.click();

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);",javaScriptAlertsPage.ClickForJSAlert);
        javaScriptAlertsPage.ClickForJSAlert.click();


    }
    @Then("User accepts the alert")
    public void user_accepts_the_alert() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

//        try{
//            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }
//        catch (org.openqa.selenium.UnhandledAlertException e) {
//            Alert alert = Driver.getDriver().switchTo().alert();
////            String alertText = alert.getText().trim();
////            System.out.println("Alert data: "+ alertText);
//            alert.accept();}

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);",Driver.getDriver().switchTo().alert());
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("User verifies that the alert is accepted")
    public void user_verifies_that_the_alert_is_accepted() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //String text = javaScriptAlertsPage.getAlertText();

        javaScriptAlertsPage.ClickForJSAlert.getText();

        //Assert.assertEquals(javaScriptAlertsPage.getAlertText(), "You successfully clicked an alert");
    }
    @Then("User clicks on Click for JS Confirm")
    public void user_clicks_on_click_for_js_confirm() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        ReusableMethods.waitForClickablility(javaScriptAlertsPage.ClickForJSConfirm, 10);
        javaScriptAlertsPage.ClickForJSConfirm.click();

    }
    @Then("User dismiss the alert")
    public void user_dismiss_the_alert() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Driver.getDriver().switchTo().alert().dismiss();

    }
    @Then("User verifies that the alert is dismissed")
    public void user_verifies_that_the_alert_is_dismissed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(javaScriptAlertsPage.AlertText.isDisplayed());
    }
    @Then("User clicks on Click for JS Prompt")
    public void user_clicks_on_click_for_js_prompt() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        javaScriptAlertsPage.ClickForJSPrompt.click();
    }
    @Then("User enters text to alert")
    public void user_enters_text_to_alert() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        javaScriptAlertsPage.ClickForJSPrompt.sendKeys("Sahan");
    }
    @Then("User verifies that a text entered to the alert")
    public void user_verifies_that_a_text_entered_to_the_alert() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Assert.assertTrue(javaScriptAlertsPage.AlertText.isDisplayed());
    }
}
