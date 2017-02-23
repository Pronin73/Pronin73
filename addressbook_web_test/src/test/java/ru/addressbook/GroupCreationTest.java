package ru.addressbook;


import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        goToGroupePage();
        initGroupCreatian();
        fillGroupForm(new GroupData("test1", "test1", "test1"));
        submitGroupCreatian();
        returnToGroupPage();
    }

}
