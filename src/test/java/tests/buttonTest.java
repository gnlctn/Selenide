package tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static com.codeborne.selenide.Selenide.page;

public class buttonTest extends baseTest{
    @BeforeMethod
    public void before(){
        pageManager.buttonPage.open();
    }
    @Test
    public void clickMe(){
        pageManager.buttonPage.buttonsOption.click();
        executeJavaScript("window.scrollBy(0,500)");
        pageManager.buttonPage.clickMeButton.click();
        assertThat(pageManager.buttonPage.getText()).isEqualTo("You have done a dynamic click");
    }
}
