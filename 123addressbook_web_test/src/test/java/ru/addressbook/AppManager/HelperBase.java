package ru.addressbook.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Вася on 23.02.2017.
 */
public class HelperBase {
    protected FirefoxDriver wd;

    public HelperBase(FirefoxDriver wd) {
        this.wd = wd;
    }

    protected void click(By lockator) {
        wd.findElement(lockator).click();
    }

    protected void type(By local, String text) {
        click(local);
        wd.findElement(local).clear();
        wd.findElement(local).sendKeys(text);
    }
    public  boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
