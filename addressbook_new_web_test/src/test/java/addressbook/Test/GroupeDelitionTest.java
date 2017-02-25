package addressbook.Test;

import org.testng.annotations.Test;

public class GroupeDelitionTest extends TestBase {

    
    @Test
    public void testGroupeDelition() {
        app.getContactHelper().getNavigationHelper().gotoGropePage();
        app.getContactHelper().getGroupeHelper().selectGroupe();
        app.getContactHelper().getGroupeHelper().deliteSelectedGroup();
        app.getContactHelper().getNavigationHelper().gotoGropePage();
    }

}
