package common;
import driver.DriverFactory;
import Pages.addRecordPage;
import Pages.buttonPage;

public class PageManager {
    public addRecordPage addRecord;
    public buttonPage buttonPage;


    public PageManager(){
        DriverFactory.setupDriver();
        buttonPage = pageFactory.buildElementsButtonsPage();
        addRecord = pageFactory.buildAddRecordTest();
    }
}
