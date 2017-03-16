package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupeDelitionTest extends TestBase {

    
    @Test
    public void testGroupeDelition() {
        app.getNavigationHelper().gotoGropePage();
        if (! app.getGroupeHelper().isThereAGroup()){
            app.getGroupeHelper().createGroup(new GroupeData("test33", null, null));
        }
        List<GroupeData> before = app.getGroupeHelper().getGroupList();
        app.getGroupeHelper().selectGroupe(before.size() -1);
        app.getGroupeHelper().deliteSelectedGroup();
        app.getNavigationHelper().gotoGropePage();
        List<GroupeData> after = app.getGroupeHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);
    }

}
