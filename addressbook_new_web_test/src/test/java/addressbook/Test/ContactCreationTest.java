package addressbook.Test;

import addressbook.Model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("Alexei", "Vasilevich", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        app.getContactHelper().submitContactForm();
        app.getContactHelper().gotoHome();
    }

}
