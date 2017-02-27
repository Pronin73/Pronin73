package addressbook.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super((WebDriver) wd);
    }
    public void login(String user, String password) {
        type(By.name("user"), user);
        type (By.name("pass"), password);
       click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
