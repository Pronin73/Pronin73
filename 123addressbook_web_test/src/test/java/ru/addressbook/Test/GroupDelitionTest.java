package ru.addressbook.Test;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {

    @Test
    public void testGroupDelition() {
        app.getNavigationHelper().goToGroupePage();
        app.getGroupHelper().selectGrope();
        app.getGroupHelper().deliteSelectedGroupe();
        app.getGroupHelper().returnToGroupPage();
    }

}
