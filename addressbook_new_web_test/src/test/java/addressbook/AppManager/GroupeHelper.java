package addressbook.AppManager;

import addressbook.Model.GroupeData;
import addressbook.Model.Groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GroupeHelper extends HelperBase  {

    public GroupeHelper(WebDriver wd) {
        super((WebDriver) wd);
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

    public void selectGroupe(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void selectGroupeById(int id) {
        wd.findElement(By.cssSelector("input[value ='"+ id + "']")).click();
    }

    public void initGroupeModification() {
        click(By.name("edit"));
    }

    public void submitGroupeModification() {
        click(By.name("update"));
    }

    public void create(GroupeData group) {
       initGropeCreation();
       fillGroupeForm(group);
       submitGropeCreation();
       gotoGroupForm();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public void modify(GroupeData groupe) {
       selectGroupeById(groupe.getId());
       initGroupeModification();
       fillGroupeForm(groupe);
       submitGroupeModification();
       gotoGroupForm();
    }

    public void delete(int index) {
        selectGroupe(index);
        deliteSelectedGroup();
        returnToGroupPage();
    }

    public void delete(GroupeData group) {
        selectGroupeById(group.getId()
        );
        deliteSelectedGroup();
        returnToGroupPage();
    }

    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupeData> list() {
        List<GroupeData> groups = new ArrayList<GroupeData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupeData ().withId(id).withName(name));
        }
        return groups;
    }

    public Groups all () {
        Groups groups = new Groups();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupeData ().withId(id).withName(name));
        }
        return groups;
    }


}
