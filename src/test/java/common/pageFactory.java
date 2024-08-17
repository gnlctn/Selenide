package common;
import Pages.addRecordPage;
import Pages.buttonPage;

public class pageFactory {
    public static addRecordPage buildAddRecordTest() {
        return new addRecordPage("/webtables");
    }

    public static buttonPage buildElementsButtonsPage() {
        return new buttonPage("/elements");
    }
}
