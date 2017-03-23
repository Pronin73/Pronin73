package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        app.goTo().groupPage();
        Set<GroupeData> before = app.groupe().all();
        GroupeData group = new GroupeData().withName("test2");
        app.groupe().create(group);
        Set<GroupeData> after = app.groupe().all();
        Assert.assertEquals(after.size(), before.size() + 1);

     //   group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(group);
        Assert.assertEquals(before, after);
    }

}
