package addressbook;

import org.testng.annotations.Test;

public class ContactDelitionTest extends TestBase{

    @Test
    public void testContactDelition() {

        gotoHome();
        selectedContact();
        deletContact();
        closedWindow();
        gotoHome();
    }

}
