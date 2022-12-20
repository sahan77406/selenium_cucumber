package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "Form Authentication")
    public WebElement FormAuthentication;

    @FindBy(linkText = "Forgot Password")
    public WebElement ForgotPassword;

    @FindBy(linkText = "Dropdown")
    public WebElement DropdownLink;

    @FindBy(linkText = "Hovers")
    public WebElement HoversLink;

    @FindBy(linkText = "Key Presses")
    public WebElement KeyPressesLink;

    @FindBy(linkText = "JavaScript Alerts")
    public WebElement JavaScriptAlertsLink;

    //public By JavaScriptAlertsLink1 = By.linkText("JavaScript Alerts");

    @FindBy(linkText = "Horizontal Slider")
    public WebElement HorizontalSliderLink;

    @FindBy(linkText = "File Upload")
    public WebElement FileUploadLink;

    @FindBy(linkText = "Entry Ad")
    public WebElement EntryAdLink;

    @FindBy(linkText = "Context Menu")
    public WebElement ContextMenuLink;

    @FindBy(linkText = "Frames")
    public WebElement FramesLink;

    @FindBy(linkText = "Dynamic Loading")
    public WebElement DynamicLoadingLink;

    @FindBy(linkText = "Basic Auth")
    public WebElement BasicAuthPageLink;


}
