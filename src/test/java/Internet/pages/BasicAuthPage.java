package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {

    public BasicAuthPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='content']/div/p")
    public WebElement textOnBasicAuth;

    public By textOnBasicAuth1 = By.xpath("//*[@id='content']/div/p");
}
