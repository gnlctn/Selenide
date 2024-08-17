package tests;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.page;
public class buttonTest extends baseTest{
    @BeforeMethod
    public void before(){
        pageManager.buttonPage.open();
    }
    @Test
    public void clickMe(){
        pageManager.buttonPage.buttonsOption.click();
        pageManager.buttonPage.clickMeButton.click();
        assertThat(pageManager.buttonPage.getText()).isEqualTo("You have done a dynamic click");
    }
}
