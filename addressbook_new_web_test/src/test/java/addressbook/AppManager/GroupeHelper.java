package addressbook.AppManager;

import addressbook.Model.GroupeData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


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

    public void initGroupeModification() {
        click(By.name("edit"));
    }

    public void submitGroupeModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupeData group) {
       initGropeCreation();
       fillGroupeForm(group);
       submitGropeCreation();
       gotoGroupForm();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupeData> getGroupList() {
        List<GroupeData> groups = new ArrayList<GroupeData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements){
            String name = element.getText();
            GroupeData groupe = new GroupeData (name,null, null);
            groups.add(groupe);
        }
        return groups;
    }
}
