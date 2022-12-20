package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

    public FileUploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "file-upload")
    public WebElement chooseFile;

    @FindBy(id = "file-submit")
    public WebElement uploadFile;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFile;



}
