package addressbook.Test;


import addressbook.Model.GroupeData;
import addressbook.Model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupeModificationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();

        if (app.groupe().all().size() == 0) {
            app.groupe().create(new GroupeData().withName("test33"));
        }
    }

    @Test
    public void testGroupeModification() {
       Groups  before = app.groupe().all();
        GroupeData modifiedGroup = before.iterator().next();
        GroupeData group = new GroupeData()
                .withId(modifiedGroup.getId()).withName("test1").withHeader( "test2").withFooter( "test3");
        app.groupe().modify(group);
        Groups after = app.groupe().all();
        assertEquals(after.size(), before.size());

 //       before.remove(modifiedGroup);
 //       before.add(group);
 //       Assert.assertEquals(before, after);
        assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));



    }


}
