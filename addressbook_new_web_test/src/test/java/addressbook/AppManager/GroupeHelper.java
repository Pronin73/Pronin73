package addressbook.AppManager;

import addressbook.Model.GroupeData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupeHelper extends HelperBase  {

    public GroupeHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupForm() {
        click(By.linkText("group page"));
    }

    public void submitGropeCreation() {
        click(By.name("submit"));
    }

    public void fillGroupeForm(GroupeData groupeData) {
        type(By.name("group_name"), groupeData.getName());
        type(By.name("group_header"), groupeData.getHeader());
        type(By.name("group_footer"), groupeData.getFooter());
    }

    public void initGropeCreation() {
        click(By.name("new"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void deliteSelectedGroup() {
        click(By.name("delete"));
    }

    public void selectGroupe() {
        click(By.name("selected[]"));
    }

    public void initGroupeModification() {
        click(By.name("edit"));
    }
    public void submitGroupeModification() {
        click(By.name("update"));
    }
}
