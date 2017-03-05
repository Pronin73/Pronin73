package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {
        app.getNavigationHelper().gotoGropePage();

        app.getGroupeHelper().initGropeCreation();
        app.getGroupeHelper().fillGroupeForm(new GroupeData("test33", null, null));
        app.getGroupeHelper().submitGropeCreation();
        app.getGroupeHelper().gotoGroupForm();

    }

}
