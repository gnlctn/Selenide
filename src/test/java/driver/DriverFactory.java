package driver;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.propertyManager;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class DriverFactory {

    static propertyManager propertyManager =new propertyManager();
    public static void setupDriver() {


        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        Configuration.headless= Objects.equals(propertyManager.getProperty("HEADLESS"),"Y");
        String browser;
        browser = Objects.equals(propertyManager.getProperty("BROWSER"), null) ? "CHROME" : propertyManager.getProperty("BROWSER");
        switch (browser){
            case "IE":
                Configuration.browser = Browsers.IE;
                break;
            case "CHROME":
                Configuration.browser = Browsers.CHROME;
                break;
            case "EDGE" :
                Configuration.browser = Browsers.EDGE;
                break;
            case "FIREFOX":
                Configuration.browser = Browsers.FIREFOX;
                break;
            case "SAFARI":
                Configuration.browser = Browsers.SAFARI;
                break;
            default:
                Configuration.browser = Browsers.CHROME;
                break;
        }
    }
    public static void open(String url) {
        Selenide.open(url);
    }
    public static WebDriver currentDriver() {
        return WebDriverRunner.getWebDriver();
    }
    public static void maximize() {
        currentDriver().manage().window().maximize();
    }
    public static void close() {
        currentDriver().quit();
    }

}

