package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {

    public KeyPressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "target")
    public WebElement textField;

    @FindBy(id = "result")
    public WebElement resultText;

}
