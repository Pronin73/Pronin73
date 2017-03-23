package addressbook.Test;

import addressbook.Model.GroupeData;
import addressbook.Model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupeDelitionTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.groupe().all().size() == 0) {
            app.groupe().create(new GroupeData().withName("test33"));
        }
    }

    @Test
    public void testGroupeDelition() {
        Groups before = app.groupe().all();
        GroupeData deletedGroup = before.iterator().next();
        app.groupe().delete(deletedGroup);
        Groups after = app.groupe().all();
        assertEquals(after.size(), before.size() - 1);

      //  before.remove(deletedGroup);
        assertThat(after, equalTo(before.without(deletedGroup)));
      //  Assert.assertEquals(before, after);
    }
}
