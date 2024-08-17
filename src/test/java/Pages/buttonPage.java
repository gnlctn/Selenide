package Pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class buttonPage extends basePage {
    public SelenideElement buttonsOption = $("#item-4");
    public SelenideElement clickMeButton = $x("//button[text()='Click Me']");
    public SelenideElement clickMessage = $("#dynamicClickMessage");

    public buttonPage(String pageUrl) {
        super(pageUrl);
    }
    public String getText (){
        return clickMessage.getText();
    }
}
