package addressbook.AppManager;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private  ContactHelper contactHelper;
    private   GroupeHelper groupeHelper;
    private   NavigationHelper navigationHelper;
    private   SessionHelper sessionHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        navigationHelper = new NavigationHelper(wd);
        groupeHelper = new GroupeHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);

        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
    public  GroupeHelper getGroupeHelper() {
        return groupeHelper;
    }
    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    public SessionHelper getSessionHelper() {
        return  sessionHelper;
    }
}
