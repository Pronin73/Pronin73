package addressbook.Test;

import org.testng.annotations.Test;

public class GroupeDelitionTest extends TestBase {

    
    @Test
    public void testGroupeDelition() {
        app.getNavigationHelper().gotoGropePage();
        app.getGroupeHelper().selectGroupe();
        app.getGroupeHelper().deliteSelectedGroup();
        app.getNavigationHelper().gotoGropePage();
    }

}
