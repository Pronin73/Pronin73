package addressbook.Test;

import addressbook.Model.GroupeData;
import org.testng.annotations.Test;

public class GroupeDelitionTest extends TestBase {

    
    @Test
    public void testGroupeDelition() {
        app.getNavigationHelper().gotoGropePage();
        if (! app.getGroupeHelper().isThereAGroup()){
            app.getGroupeHelper().createGroup(new GroupeData("test33", null, null));
        }
        app.getGroupeHelper().selectGroupe();
        app.getGroupeHelper().deliteSelectedGroup();
        app.getNavigationHelper().gotoGropePage();
    }

}
