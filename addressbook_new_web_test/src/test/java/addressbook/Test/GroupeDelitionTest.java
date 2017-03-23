package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class GroupeDelitionTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.groupe().list().size() == 0) {
            app.groupe().create(new GroupeData().withName("test33"));
        }
    }

    @Test
    public void testGroupeDelition() {
        Set<GroupeData> before = app.groupe().all();
        GroupeData deletedGroup = before.iterator().next();
        app.groupe().delete(deletedGroup);
        Set<GroupeData> after = app.groupe().all();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(deletedGroup);
        Assert.assertEquals(before, after);
    }
}
