package addressbook.Test;


import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeModificationTest extends TestBase {

    @Test
    public void testGroupeModification(){


        app.getNavigationHelper().gotoGropePage();
        app.getGroupeHelper().selectGroupe();
        app.getGroupeHelper().initGroupeModification();
        app.getGroupeHelper().fillGroupeForm(new GroupeData("test1", "test2", "test3"));
        app.getGroupeHelper().submitGroupeModification();
        app.getGroupeHelper().gotoGroupForm();

    }
}
