package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class addRecordTest extends baseTest {
    @BeforeMethod
    public void before(){
        pageManager.addRecord.open();
    }
    @Test
    public void addTest(){
        pageManager.addRecord.addButton.click();
        pageManager.addRecord.newRecord("Gönül","Çetin","gnl.ctn@gmail.com","26","60000","IT");
        pageManager.addRecord.submit.click();
        pageManager.addRecord.update.click();
        pageManager.addRecord.lastName.clear();
        pageManager.addRecord.lastName.setValue("Duvar");
        pageManager.addRecord.submit.click();
        assertThat(pageManager.addRecord.getlNameText()).isEqualTo("Duvar");


    }
}
