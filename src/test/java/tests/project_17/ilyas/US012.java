package tests.project_17.ilyas;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Project17Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US012 {
    @Test
    public void test001() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        Thread.sleep(2000);
        project17Page.singin.click();
        Thread.sleep(2000);
        project17Page.username.sendKeys(ConfigReader.getProperty("usermail"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pasword")).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        Assert.assertTrue(project17Page.girisYapildi.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void test002() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        Thread.sleep(2000);
        project17Page.singin.click();
        Thread.sleep(2000);
        project17Page.username.sendKeys(ConfigReader.getProperty("usermail"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pasword")).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(6000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("myAccount"));
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        project17Page.orderButton.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Assert.assertTrue(project17Page.orderText.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void test003() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        Thread.sleep(2000);
        project17Page.singin.click();
        Thread.sleep(2000);
        project17Page.username.sendKeys(ConfigReader.getProperty("usermail"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pasword")).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(6000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("myAccount"));
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        project17Page.downloadButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(project17Page.downloadtest.isDisplayed());
        Driver.quitDriver();

    }

    @Test
    public void test004() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        Thread.sleep(2000);
        project17Page.singin.click();
        Thread.sleep(2000);
        project17Page.username.sendKeys(ConfigReader.getProperty("usermail"));
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pasword")).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(6000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("myAccount"));
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        project17Page.adressButton.click();
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Assert.assertTrue(project17Page.adresstest.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void test005() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(3000);
        Project17Page project17Page = new Project17Page();
        Thread.sleep(3000);
        project17Page.singin.click();
        Thread.sleep(3000);
        project17Page.username.sendKeys(ConfigReader.getProperty("usermail"));
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pasword")).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        Driver.getDriver().get(ConfigReader.getProperty("myAccount"));
        Thread.sleep(3000);
        Driver.getDriver().get(ConfigReader.getProperty("myAccountSetting"));
        Thread.sleep(4000);
        Faker faker = new Faker();
        Thread.sleep(3000);
        project17Page.accountFirstNameChange.clear();
        Thread.sleep(3000);
        project17Page.accountDetailChange.clear();
        Thread.sleep(3000);
        project17Page.accountLastNameChange.clear();
        Thread.sleep(3000);
        project17Page.accountFirstNameChange.sendKeys(faker.name().firstName());
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(faker.name().username())
                .sendKeys(Keys.ENTER).perform();

        Thread.sleep(5000);
        project17Page.accountFirstNameChange.clear();
        Thread.sleep(4000);
        project17Page.accountLastNameChange.clear();
        Thread.sleep(4000);
        project17Page.accountDetailChange.clear();
        project17Page.accountFirstNameChange.sendKeys(ConfigReader.getProperty("firstname"));
        Thread.sleep(4000);
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("lastName")).sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("displayName"))
                .sendKeys(Keys.ENTER).perform();
        Driver.quitDriver();


    }


}
