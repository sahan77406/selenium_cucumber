package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    public FramesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "Nested Frames")
    public WebElement NestedFrames;

    @FindBy(linkText = "iFrame")
    public WebElement IFrame;

    @FindBy( id= "mce_0_ifr")
    public WebElement editorField;

//    @FindBy( id= "tinymce")
//    public WebElement textArea;

    public By textArea = By.id("tinymce");

//    @FindBy( xpath= "//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]/span")
//    public WebElement alignCenter;

    public By alignCenter = By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]/span");

    public String leftFrame = "frame-left";
    public String rightFrame = "frame-right";
    public String topFrame = "frame-top";
    public String bottomFrame = "frame-bottom";
    public By getText = By.tagName("body");

//    @FindBy( id= "frame-left")
//    public WebElement leftFrame;
//
//    @FindBy( id= "frame-right")
//    public WebElement rightFrame;
//
//    @FindBy( id= "frame-top")
//    public WebElement topFrame;
//
//    @FindBy( id= "frame-bottom")
//    public WebElement bottomFrame;
//
//    @FindBy( tagName= "body")
//    public WebElement getText;

}
