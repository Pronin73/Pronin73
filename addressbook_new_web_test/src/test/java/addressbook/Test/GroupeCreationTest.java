package addressbook.Test;

import addressbook.Model.GroupeData;
import addressbook.Model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        app.goTo().groupPage();
        Groups before = app.groupe().all();
        GroupeData group = new GroupeData().withName("test2");
        app.groupe().create(group);
        Groups after = app.groupe().all();
        assertThat(after.size(), equalTo( before.size() + 1));

     //   group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
     // before.add(group);
     // Assert.assertEquals(before, after);
     //  assertEquals(before, after);
     // MatcherAssert.assertThat(after, CoreMatchers.equalTo(before));

        assertThat(after, equalTo(
                before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

}
