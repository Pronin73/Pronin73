package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {
        app.getNavigationHelper().gotoGropePage();
        app.getGroupeHelper().createGroup(new GroupeData("test33", null, null));
    }

}
