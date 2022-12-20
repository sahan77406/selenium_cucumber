package Internet.stepdefinitions;

import Internet.pages.FileUploadPage;
import Internet.pages.HomePage;
import Internet.utilities.ConfigurationReader;
import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FileUpload {

    HomePage homePage = new HomePage();
    FileUploadPage fileUploadPage = new FileUploadPage();

    @Given("User go to homepage7 {string}")
    public void user_go_to_homepage7(String url) {


        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }
    @When("User click on File Upload link")
    public void user_click_on_file_upload_link() {

        homePage.FileUploadLink.click();

    }
    @Then("User chooses a file to upload")
    public void user_chooses_a_file_to_upload() {


        fileUploadPage.chooseFile.sendKeys("C:/Users/Mehmet Sahan/Desktop/New Files.docx");
    }
    @Then("User uploads the chosen file")
    public void user_uploads_the_chosen_file() {


        fileUploadPage.uploadFile.click();
    }
    @Then("User verifies the uploaded file")
    public void user_verifies_the_uploaded_file() {


        Assert.assertEquals(fileUploadPage.uploadedFile.getText(),"New Files.docx");
    }

}
