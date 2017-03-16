package addressbook.Test;


import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupeModificationTest extends TestBase {

    @Test
    public void testGroupeModification(){


        app.getNavigationHelper().gotoGropePage();

        if (! app.getGroupeHelper().isThereAGroup()){
            app.getGroupeHelper().createGroup(new GroupeData("test33", null, null));
        }
        List<GroupeData> before = app.getGroupeHelper().getGroupList();
        app.getGroupeHelper().selectGroupe(before.size() - 1);
        app.getGroupeHelper().initGroupeModification();
        GroupeData groupe = new GroupeData(before.get(before.size() - 1).getId(), "test1", "test2", "test3");
        app.getGroupeHelper().fillGroupeForm(groupe);
        app.getGroupeHelper().submitGroupeModification();
        app.getGroupeHelper().gotoGroupForm();
        List<GroupeData> after = app.getGroupeHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(groupe);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    }
}
