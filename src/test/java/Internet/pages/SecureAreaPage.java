package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage {

    public SecureAreaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "flash")
    public WebElement alertText;

    @FindBy(xpath = "//*[@id='content']/div/a")
    public WebElement logout;
}

