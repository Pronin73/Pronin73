package addressbook.AppManager;

import addressbook.Model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {


    public  NavigationHelper navigationHelper;
    public GroupeHelper groupeHelper;
   private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoHome() {
        click(By.linkText("home"));
    }

    public void submitContactForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        click(By.name("title"));
        wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
    }

    private void type(By lockator, String text) {
        click(lockator);
        wd.findElement(lockator).clear();
        wd.findElement(lockator).sendKeys(text);
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

    public void closedWindow() {
        wd.switchTo().alert().accept();
    }

    public void deletContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectedContact() {
        groupeHelper.selectGroupe();
    }

    public GroupeHelper getGroupeHelper() {
        return groupeHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void initGroupeModification() {
        click(By.name("edit"));
    }

    public void submitGroupeModification() {
        click(By.name("update"));
    }
}
