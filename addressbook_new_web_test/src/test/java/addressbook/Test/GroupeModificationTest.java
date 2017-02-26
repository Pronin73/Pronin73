package addressbook.Test;


import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeModificationTest extends TestBase {

    @Test
    public void testGroupeModification(){


        app.getContactHelper().getNavigationHelper().gotoGropePage();
        app.getContactHelper().getGroupeHelper().selectGroupe();
        app.getContactHelper().initGroupeModification();
        app.getContactHelper().getGroupeHelper().fillGroupeForm(new GroupeData("test1", "test2", "test3"));
        app.getContactHelper().submitGroupeModification();
        app.getContactHelper().getGroupeHelper().gotoGroupForm();

    }
}
