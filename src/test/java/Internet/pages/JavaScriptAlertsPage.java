package Internet.pages;

import Internet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage {

    public JavaScriptAlertsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='content']/div/ul/li[1]/button")
    public WebElement ClickForJSAlert;

    @FindBy(xpath = "//*[@id='content']/div/ul/li[2]/button")
    public WebElement ClickForJSConfirm;

    @FindBy(xpath = "//*[@id='content']/div/ul/li[3]/button")
    public WebElement ClickForJSPrompt;

    @FindBy(id = "result")
    public WebElement AlertText;

//    public String getAlertText () {
//
//        return Driver.getDriver().findElement((By) AlertText).getText();
//    }


}
