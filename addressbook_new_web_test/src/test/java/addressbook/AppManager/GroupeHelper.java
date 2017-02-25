package addressbook.AppManager;

import addressbook.Model.GroupeData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupeHelper {
    private FirefoxDriver wd;

    public GroupeHelper(FirefoxDriver wd) {
    this.wd = wd;
    }

    public void gotoGroupForm() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGropeCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupeForm(GroupeData groupeData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupeData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupeData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupeData.getFooter());
    }

    public void initGropeCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void deliteSelectedGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroupe() {
        wd.findElement(By.name("selected[]")).click();
    }
}
