package Internet.stepdefinitions;

import Internet.pages.BasicAuthPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import Internet.utilities.WindowsManager;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class BasicAuth {

    HomePage homePage = new HomePage();
    BasicAuthPage basicAuthPage = new BasicAuthPage();


    @Given("User go to homepage12 {string}")
    public void user_go_to_homepage12(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on Basic Auth link")
    public void user_click_on_basic_auth_link() {

        homePage.BasicAuthPageLink.click();

    }
    @When("User enter username and password on the popup")
    public void user_enter_username_and_password_on_the_popup() throws Exception {


        Thread.sleep(3000);

        String u = "admin";
        // adding username, password with URL
        String str = "https://" + u + ":" + u + "@" +  "the-internet.herokuapp.com/basic_auth";
        Thread.sleep(3000);

        Driver.getDriver().get(str);

         Driver.getDriver().get(str);





        //===================================================================================//

//        Driver.getDriver().findElement(By.id("userID")).sendKeys("admin");
//        Thread.sleep(3000);
//        Driver.getDriver().findElement(By.id("password")).sendKeys("admin");
//        Thread.sleep(3000);

        //Driver.getDriver().switchTo().defaultContent();


    }
    @Then("User click on signin button")
    public void user_click_on_signin_button() {




    }
    @Then("User verifies the text on the page")
    public void user_verifies_the_text_on_the_page() throws Exception{

        Thread.sleep(3000);

        //Assert.assertTrue(basicAuthPage.textOnBasicAuth.isDisplayed());

        Assert.assertEquals(Driver.getDriver().findElement(basicAuthPage.textOnBasicAuth1).getText(), "Congratulations! You must have the proper credentials.");

        System.out.println(Driver.getDriver().findElement(basicAuthPage.textOnBasicAuth1).getText());

    }
    @Then("User goes back to home page")
    public void user_goes_back_to_home_page() {

        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());

        windowsManager.goBack();



    }
}
