package addressbook.Test;

import addressbook.Model.ContactData;
import addressbook.Test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().gotoHome();

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact( new ContactData("test1", "Alexei", "Vasilevich", null, "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().editSelectedContact(before.size() - 1);
        app.getContactHelper().fillContactForm(new ContactData(null, "Alexei777", "Vasilevich888", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"), false);
        app.getContactHelper().updatSelectedContact();
        app.getContactHelper().gotoHome();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after, before );
    }

}
