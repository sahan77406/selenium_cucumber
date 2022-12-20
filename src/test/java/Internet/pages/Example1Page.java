package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example1Page {

    public Example1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='start']/button")
    public WebElement startButton;

//    @FindBy(xpath = "//*[@id='loading']/img")
//    public WebElement loadingIcon;

    public By loadingIcon = By.xpath("//*[@id='loading']/img");

    @FindBy(xpath = "//*[@id='finish']/h4")
    public WebElement loadedText;

}
