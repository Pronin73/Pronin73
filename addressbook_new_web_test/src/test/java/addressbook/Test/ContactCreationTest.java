package addressbook.Test;

import addressbook.Model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().createContact(new ContactData("test1", "Alexei", "Vasilevich", null, "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        app.getContactHelper().addNewContact();
        app.getNavigationHelper().gotoHomePage();
       // app.getContactHelper().gotoHome();
    }

}
