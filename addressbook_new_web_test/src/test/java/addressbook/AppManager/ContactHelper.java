package addressbook.AppManager;

import addressbook.Model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public NavigationHelper navigationHelper;
    public GroupeHelper groupeHelper;
    public HelperBase helperBase;


    public void gotoHome() {
        click(By.linkText("home"));
    }

    public void submitContactForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
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

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_groupe")));
        }
    }

    public void type(By lockator, String text) {
        click(lockator);
        if (text != null) {
            String existingText = wd.findElement(lockator).getAttribute("value");
            if (!text.equals(existingText)) {
                wd.findElement(lockator).clear();
                wd.findElement(lockator).sendKeys(text);
            }

        }
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }

  public void click(By locator) {
      wd.findElement(locator).click();
   }

    public void closedWindow() {
        wd.switchTo().alert().accept();
    }

    public void deletContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectedContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();

    }

    public GroupeHelper getGroupeHelper() {
        return groupeHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void editSelectedContact( int index) {

        click(By.xpath("//div[1]/div[4]/form[2]/table/tbody/tr["+index+"]/td[8]/a/img"));
                        //div[1]/div[4]/form[2]/table/tbody/tr[3]/td[8]/a/img
    }

    public void updatSelectedContact() {
        click(By.name("update"));
    }

    public void createContact(ContactData contact) {
        addNewContact();
        fillContactForm(contact, true);
        submitContactForm();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("entry")).size();
    }

    public List<ContactData> getContactList() {

        List<ContactData> contacts = new ArrayList<ContactData>();

        List<WebElement> elements = wd.findElements(By.name("entry"));


        for (WebElement element : elements) {

            List<WebElement> cells = element.findElements(By.tagName("td"));
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            //String checkbox = cells.get(0).getText();
            String lastname = cells.get(1).getText();
            String firstname = cells.get(2).getText();
            String address = cells.get(3).getText();
            String email = cells.get(4).getText();
            String allphones = cells.get(5).getText();
            String view = cells.get(6).getText();
            String edit = cells.get(7).getText();
            String vcard = cells.get(8).getText();
            String zapasnoy = cells.get(9).getText();

            ContactData contact = new ContactData(id, null, firstname, null, lastname, null, null, null, address, null, null);
            contacts.add(contact);

        }
        return contacts;
    }
}
