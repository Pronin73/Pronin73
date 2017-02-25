package addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        addNewContact();
        fillContactForm(new ContactData("Alexei", "Vasilevich", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        submitContactForm();
        gotoHome();
    }

}
