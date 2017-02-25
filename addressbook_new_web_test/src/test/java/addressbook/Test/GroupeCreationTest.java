package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        app.getContactHelper().getNavigationHelper().gotoGropePage();
        app.getContactHelper().getGroupeHelper().initGropeCreation();
        app.getContactHelper().getGroupeHelper().fillGroupeForm(new GroupeData("test1", "test2", "test3"));
        app.getContactHelper().getGroupeHelper().submitGropeCreation();
        app.getContactHelper().getGroupeHelper().gotoGroupForm();
    }

}
