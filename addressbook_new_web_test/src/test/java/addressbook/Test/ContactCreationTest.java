package addressbook.Test;

import addressbook.Model.ContactData;
import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact = new ContactData("test1", "Alexei", "Vasilevich", "Pronin", "Pro", "\\9", "MyCompaye", "Moscow, Russia", "2", "3");
        app.getContactHelper().createContact(contact);
        app.getContactHelper().addNewContact();

        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);


        int max = -100;
        for (ContactData g : after){
            if (g.getId() > max){
                max = g.getId();
            }
        }
        contact.setId(max);

        before.add (contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

       // app.getContactHelper().gotoHome();
    }



}
