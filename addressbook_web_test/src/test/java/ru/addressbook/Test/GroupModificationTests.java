package ru.addressbook.Test;

import org.testng.annotations.Test;
import ru.addressbook.Model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupePage();
        app.getGroupHelper().selectGrope();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test55", "test55", "test55"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupePage();
    }
}
