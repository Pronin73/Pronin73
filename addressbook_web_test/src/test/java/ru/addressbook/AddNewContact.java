package ru.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class AddNewContact {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        loginInput();
    }

    private void loginInput() {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void NewContactadd() {


        addNewMember();
        addNameMember();
        addMiddlenameMember();
        addLastNameMember();
        addNickName();
        companyMember();
        addAddressMember();
        initMember();
        gotoHome();
    }

    private void gotoHome() {
        wd.findElement(By.linkText("home")).click();
    }

    private void initMember() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void addAddressMember() {
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys("VVVVVV new Moscow");
    }

    private void companyMember() {
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys("BestCompany");
    }

    private void addNickName() {
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys("Pronin1973");
    }

    private void addLastNameMember() {
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("Pronin");
    }

    private void addMiddlenameMember() {
        wd.findElement(By.name("middlename")).sendKeys("\\9");
        wd.findElement(By.name("lastname")).click();
    }

    private void addNameMember() {
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Alexei");
        wd.findElement(By.name("middlename")).click();
    }

    private void addNewMember() {
        wd.findElement(By.linkText("add new")).click();
        wd.findElement(By.name("firstname")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
