package Internet.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WindowsManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver){

        this.driver = driver;
        navigate = driver.navigate();
    }


    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }
}

