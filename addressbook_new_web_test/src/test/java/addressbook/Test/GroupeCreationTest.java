package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        app.goTo().groupPage();
        List<GroupeData> before = app.groupe().list();
        GroupeData group = new GroupeData().withName("test2");
        app.groupe().create(group);
        List<GroupeData> after = app.groupe().list();
        Assert.assertEquals(after.size(), before.size() + 1);

     //   group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(group);
        Comparator<? super GroupeData> byid = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byid);
        after.sort(byid);
        Assert.assertEquals(before, after);
    }

}
