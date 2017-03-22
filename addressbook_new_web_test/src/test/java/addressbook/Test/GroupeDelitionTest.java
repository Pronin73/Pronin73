package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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

        List<GroupeData> before = app.groupe().list();
        int index = before.size() - 1;
        app.groupe().delete(index);
        List<GroupeData> after = app.groupe().list();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(index);

        Assert.assertEquals(before, after);

    }


}
