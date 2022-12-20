package Internet.stepdefinitions;

import Internet.pages.FramesPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import Internet.utilities.WindowsManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Frames {

    HomePage homePage = new HomePage();
    FramesPage framesPage = new FramesPage();

    @Given("User go to homepage10 {string}")
    public void user_go_to_homepage10(String url) {

        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }
    @When("User click on Frames link")
    public void user_click_on_frames_link() throws Exception{
        Thread.sleep(1000);
        homePage.FramesLink.click();
    }
    @When("User click on IFrame link")
    public void user_click_on_i_frame_link() throws Exception{
        Thread.sleep(1000);
        framesPage.IFrame.click();
    }
    @Then("User clear the text in editor")
    public void user_clear_the_text_in_editor() throws Exception{

        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.editorField);
        Driver.getDriver().findElement(framesPage.textArea).clear();
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User type a new text in editor")
    public void user_type_a_new_text_in_editor() throws Exception{

        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.editorField);
        Driver.getDriver().findElement(framesPage.textArea).sendKeys("Hello World!");
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("User click on align center button")
    public void user_click_on_align_center_button() throws Exception{
        Thread.sleep(1000);
        Driver.getDriver().findElement(framesPage.alignCenter).click();

    }
    @Then("User verifies the text in the editor")
    public void user_verifies_the_text_in_the_editor() throws Exception{
        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.editorField);
        Assert.assertTrue(Driver.getDriver().findElement(framesPage.textArea).getText().contains("Hello World!"), "The Text is incorrect");
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User goes back to Frames page1")
    public void user_goes_back_to_frames_page1() throws Exception{
        Thread.sleep(1000);
        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();

    }
    @Then("User click on NestedFrames link")
    public void user_click_on_nested_frames_link() throws Exception{
        Thread.sleep(1000);
        framesPage.NestedFrames.click();
    }
    @Then("User verifies the text in the left frame")
    public void user_verifies_the_text_in_the_left_frame() throws Exception{

        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.topFrame);
        Driver.getDriver().switchTo().frame(framesPage.leftFrame);
        Assert.assertTrue(Driver.getDriver().findElement(framesPage.getText).getText().contains("LEFT"), "The text is incorrect");
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User verifies the text in the right frame")
    public void user_verifies_the_text_in_the_right_frame() throws Exception{

        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.topFrame);
        Driver.getDriver().switchTo().frame(framesPage.rightFrame);
        Assert.assertTrue(Driver.getDriver().findElement(framesPage.getText).getText().contains("RIGHT"), "The text is incorrect");
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User verifies the text in the bottom frame")
    public void user_verifies_the_text_in_the_bottom_frame() throws Exception{


        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(framesPage.bottomFrame);
        Assert.assertTrue(Driver.getDriver().findElement(framesPage.getText).getText().contains("BOTTOM"), "The text is incorrect");
        Driver.getDriver().switchTo().parentFrame();


    }
    @Then("User goes back to Frames page2")
    public void user_goes_back_to_frames_page2() throws Exception{

        Thread.sleep(1000);
        WindowsManager windowsManager = new WindowsManager(Driver.getDriver());
        windowsManager.goBack();

    }
}
