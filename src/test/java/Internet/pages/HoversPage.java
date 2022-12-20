package Internet.pages;

import Internet.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage {

    public HoversPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='content']/div/div[1]/img")
    public WebElement Figure1;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/img")
    public WebElement Figure2;

    @FindBy(xpath = "//*[@id='content']/div/div[3]/img")
    public WebElement Figure3;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/div/a")
    public WebElement viewProfile1;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/a")
    public WebElement viewProfile2;

    @FindBy(xpath = "//*[@id='content']/div/div[3]/div/a")
    public WebElement viewProfile3;

    @FindBy(xpath = "/html/body/h1")
    public WebElement NotFound;



}
