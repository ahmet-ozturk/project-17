package tests.project_17.ilyas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Project17Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US022 {
    @Test
    public void testCase001() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        project17Page.shopNowButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        project17Page.urunTiklaAyakkabi.click();
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", project17Page.dahaFazlaSirala);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();", project17Page.dahaFazlaSirala);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        Assert.assertTrue(project17Page.urunKatagoriAnasayfa.isDisplayed());
        Driver.quitDriver();

    }

    @Test
    public void testCase002() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        project17Page.shopNowButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.click(project17Page.shortByButton).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(project17Page.fiyatYuksektenDusugeSiraliGoruntusu.isDisplayed());
        Driver.quitDriver();

    }

    @Test
    public void testCase003() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
        Thread.sleep(2000);
        Project17Page project17Page = new Project17Page();
        project17Page.shopNowButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        WebElement ddm = project17Page.dropDownList;
        Select select = new Select(ddm);
        select.selectByVisibleText("Sort by price: low to high");
        Assert.assertTrue(project17Page.fiyatDusuktenYuksegeSiraliGoruntusu.isDisplayed());
        Driver.quitDriver();
    }

    // @Test
    //  public void testCase004() throws InterruptedException {
    //  Driver.getDriver().get(ConfigReader.getProperty("project17Url"));
    //    Thread.sleep(2000);
    //  Project17Page project17Page = new Project17Page();
    //project17Page.shopNowButton.click();
    //  Thread.sleep(2000);
    // Actions actions = new Actions(Driver.getDriver());
    //actions.sendKeys(Keys.PAGE_DOWN).perform();
    //Thread.sleep(3000);
    //actions.sendKeys(Keys.PAGE_UP).perform();
    //Thread.sleep(3000);
    //actions.click(project17Page.shortByButton).perform();
    //WebElement ddm = project17Page.dropDownList;
    //Select select = new Select(ddm);
    //Assert.assertTrue(select.equals("Sort by price: discounted products"), "Sort by price: discounted products (İNDİRİMLİ URUNLER SEKMESİ YOK!!!!!!)");
    //Driver.quitDriver();
}




