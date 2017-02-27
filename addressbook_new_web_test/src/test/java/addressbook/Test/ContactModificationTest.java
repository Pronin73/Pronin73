package addressbook.Test;

import addressbook.Model.ContactData;
import addressbook.Test.TestBase;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().gotoHome();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(new ContactData("Alexei", "Vasilevich", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        app.getContactHelper().updatSelectedContact();
        app.getContactHelper().gotoHome();
    }

}
