package addressbook.Test;

import org.testng.annotations.Test;

public class ContactDelitionTest extends TestBase {

    @Test
    public void testContactDelition() {

        app.getContactHelper().gotoHome();
        app.getContactHelper().selectedContact();
        app.getContactHelper().deletContact();
        app.getContactHelper().closedWindow();
        app.getContactHelper().gotoHome();
    }

}
