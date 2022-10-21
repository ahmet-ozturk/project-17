package tests.project_17.ilyas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Project17Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US012 {
    @Test
    public void test01() throws InterruptedException { Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page= new Project17Page();
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
        Driver.closeDriver();





    }
}
