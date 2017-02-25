package addressbook;

import org.testng.annotations.Test;

public class GroupeCreationTest extends TestBase {

    @Test
    public void testGroupeCreation() {

        gotoGropePage();
        initGropeCreation();
        fillGroupeForm(new GroupeData("test1", "test2", "test3"));
        submitGropeCreation();
        gotoGroupForm();
    }

}
