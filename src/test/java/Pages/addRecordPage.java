package Pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class addRecordPage extends basePage {
    public SelenideElement addButton = $("#addNewRecordButton");
    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement eMail = $("#userEmail");
    public SelenideElement age = $("#age");
    public SelenideElement salary = $("#salary");
    public SelenideElement department = $("#department");
    public SelenideElement submit = $("#submit");
    public SelenideElement update = $(".rt-tbody > div:nth-of-type(4) .mr-2");
    public SelenideElement lNameText = $(".rt-tbody > div:nth-of-type(4) div:nth-of-type(2)");

    public addRecordPage(String pageUrl) {
        super(pageUrl);
    }
    public void newRecord(String Name, String lName, String Mail, String Age, String salaryy, String departmentName){
        firstName.setValue(Name);
        lastName.setValue(lName);
        eMail.setValue(Mail);
        age.setValue(Age);
        salary.setValue(salaryy);
        department.setValue(departmentName);
    }

    public String getlNameText(){
        return lNameText.getText();
    }

}
