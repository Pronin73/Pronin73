package addressbook.Test;

import addressbook.Model.ContactData;
import addressbook.Test.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().gotoHome();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact( new ContactData("test1", "Alexei", "Vasilevich", null, "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        }
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(new ContactData(null, "Alexei", "Vasilevich", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"), false);
        app.getContactHelper().updatSelectedContact();
        app.getContactHelper().gotoHome();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before );
    }

}
