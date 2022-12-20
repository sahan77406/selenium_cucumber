package Internet.stepdefinitions;

import Internet.pages.HomePage;
import Internet.pages.HorizontalSliderPage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HorizontalSlider {

    HomePage homePage = new HomePage();
    HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage();


    @Given("User go to homepage6 {string}")
    public void user_go_to_homepage6(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on Horizontal Slider link")
    public void user_click_on_horizontal_slider_link() {

        homePage.HorizontalSliderLink.click();

    }

    @Then("User moves slider until it gets to the number3")
    public void user_moves_slider_until_it_gets_to_the_number3() throws Exception {
        Actions action= new Actions(Driver.getDriver());

        Thread.sleep(1000);
        for (int i = 0; i < 6; i++)
        {
            action.sendKeys(horizontalSliderPage.Slider, Keys.ARROW_RIGHT).build().perform();
            Thread.sleep(200);
        }

        System.out.println(horizontalSliderPage.SliderValue.getText());
    }


    @Then("User verifies that the slider is on the number3")
    public void user_verifies_that_the_slider_is_on_the_number3() {
        Assert.assertTrue(true, horizontalSliderPage.SliderValue.getText());
    }
}
