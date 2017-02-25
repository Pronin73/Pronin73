package addressbook;

import org.testng.annotations.Test;

public class GroupeDelitionTest extends TestBase {

    
    @Test
    public void testGroupeDelition() {
        gotoGropePage();
        selectGroupe();
        deliteSelectedGroup();
        gotoGropePage();
    }

}
