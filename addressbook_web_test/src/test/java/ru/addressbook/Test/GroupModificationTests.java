package ru.addressbook.Test;

import org.testng.annotations.Test;
import ru.addressbook.Model.GroupData;

/**
 * Created by Вася on 23.02.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupePage();
        app.getGroupHelper().selectGrope();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupePage();
    }
}
