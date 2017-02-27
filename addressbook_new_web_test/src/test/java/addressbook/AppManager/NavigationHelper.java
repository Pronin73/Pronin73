package addressbook.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super((WebDriver) wd);
    }

    public void gotoGropePage() {
        click(By.linkText("groups"));
    }
}
