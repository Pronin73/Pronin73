package addressbook.Test;

import addressbook.Model.ContactData;
import addressbook.Model.GroupeData;
import addressbook.Test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().gotoHome();

        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("test1", "Alexei", "Vasilevich", null, "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().editSelectedContact(before.size() + 1);
        ContactData contact = new ContactData(null, "Vasia", "Vasilevich888", "Pronin", "Pro", "99", "MyCompaye", "Moscow, Russia", "2", "3");

        app.getContactHelper().updatSelectedContact();
        app.getContactHelper().fillContactForm(contact, false);

        app.getContactHelper().gotoHome();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
