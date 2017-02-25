package ru.addressbook.Test;


import org.testng.annotations.Test;
import ru.addressbook.Model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().goToGroupePage();
        app.getGroupHelper().initGroupCreatian();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelper().submitGroupCreatian();
        app.getGroupHelper().returnToGroupPage();
    }

}
