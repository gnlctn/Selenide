package Pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.propertyManager;

public abstract class basePage {
    protected String pageUrl;
    propertyManager propertyManager = new propertyManager();

    public basePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = propertyManager.getProperty("APP_URL") ;
        String fullUrl = url + pageUrl;
        Selenide.open(fullUrl);
    }

    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
