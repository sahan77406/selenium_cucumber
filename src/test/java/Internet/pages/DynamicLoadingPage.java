package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    public DynamicLoadingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='content']/div/a[1]")
    public WebElement Example1Link;

    @FindBy(xpath = "//*[@id='content']/div/a[2]")
    public WebElement Example2Link;
}
