package ru.addressbook;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase {

    @Test
    public void testGroupDelition() {
        goToGroupePage();
        selectGrope();
        deliteSelectedGroupe();
        returnToGroupPage();
    }

}
