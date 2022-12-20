package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAdPage {

    public EntryAdPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='modal']/div[2]/div[1]/h3")
    public WebElement modalHeader;

    @FindBy(xpath = "//*[@id='modal']/div[2]/div[3]/p")
    public WebElement modalCloseLink;

    @FindBy(id = "restart-ad")
    public WebElement restartModal;


//    public String getModalText () {
//
//        return Driver.getDriver().switchTo().alert().getText();
//    }
}
