package ru.addressbook.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.addressbook.Model.GroupData;

/**
 * Created by Вася on 23.02.2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper (FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreatian() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreatian() {
        click(By.name("new"));
    }

    public void deliteSelectedGroupe() {
        click(By.name("delete"));
    }

    public void selectGrope() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edite"));
    }

    public void submitGroupModification() {
        click(By.name("update"));

    }
}
