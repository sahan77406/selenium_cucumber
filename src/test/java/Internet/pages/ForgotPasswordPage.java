package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(xpath = "//*[@id='form_submit']/i")
    public WebElement retrievePasswordButton;
}
