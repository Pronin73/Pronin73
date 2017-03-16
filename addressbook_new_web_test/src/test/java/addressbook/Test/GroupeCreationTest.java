package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        app.getNavigationHelper().gotoGropePage();
        List<GroupeData> before = app.getGroupeHelper().getGroupList();
        app.getGroupeHelper().createGroup(new GroupeData("test33", null, null));
        List<GroupeData> after = app.getGroupeHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
