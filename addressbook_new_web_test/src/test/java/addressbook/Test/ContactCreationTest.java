package addressbook.Test;

import addressbook.Model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();

        app.getContactHelper().createContact(new ContactData("test1", "Alexei", "Vasilevich", null, "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3"));
        app.getContactHelper().addNewContact();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

       // app.getContactHelper().gotoHome();
    }



}
