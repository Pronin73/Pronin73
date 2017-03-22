package addressbook.Test;


import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class GroupeModificationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.groupe().list().size() == 0) {
            app.groupe().create(new GroupeData().withName("test33"));
        }
    }

    @Test
    public void testGroupeModification() {
        List<GroupeData> before = app.groupe().list();
        int index = before.size() - 1;
        GroupeData groupe = new GroupeData()
                .withId(before.get(index).getId()).withName("test1").withHeader( "test2").withFooter( "test3");
        app.groupe().modify(index, groupe);
        List<GroupeData> after = app.groupe().list();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(groupe);
        Comparator<? super GroupeData> byid = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byid);
        after.sort(byid);
        Assert.assertEquals(before, after);

    }


}
