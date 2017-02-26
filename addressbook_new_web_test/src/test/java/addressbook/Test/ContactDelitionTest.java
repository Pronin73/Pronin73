package addressbook.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactDelitionTest extends TestBase {

    
    @Test
    public void testContactDelition() {
        app.getContactHelper().gotoHome();
        app.getContactHelper().selectedContact();
        app.getContactHelper().deletContact();
        app.getContactHelper().closedWindow();
        app.getContactHelper().gotoHome();


        /*
       app.getContactHelper().
        wd.findElement(By.linkText("home")).click();
        wd.findElement(By.name("selected[]")).click();
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        wd.findElement(By.linkText("home")).click();
    */
    }
}
