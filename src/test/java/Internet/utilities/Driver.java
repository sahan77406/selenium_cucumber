package Internet.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

        private Driver() {
        }
        static private WebDriver driver;
        public static WebDriver getDriver() {
            if (driver == null) {
                switch (ConfigurationReader.getProperty("browser")) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    case "safari":
                        WebDriverManager.getInstance(SafariDriver.class);
                        driver = new SafariDriver();
                        break;
                    case "opera":
                        OperaDriverManager.operadriver().setup();
                        driver = new OperaDriver();
                        break;
                }
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
        static public void closeDriver() {
            if (driver != null) {
                ReusableMethods.waitFor(2);
                driver.close();
                driver = null;
            }
        }
        public static void wait(int secs) {
            try {
                Thread.sleep(1000 * secs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
