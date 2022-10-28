package tests.project_17.harun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import pages.HubcomfyPageHarun;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US021 {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPageHarun hubcomfy = new HubcomfyPageHarun();


    @Test
    public void testTC006() throws InterruptedException {

        //url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        //1. Store Manager (SM) sign in butonuna tıklar

        hubcomfy.signInAnasayfa.click();

        //2. Geçerli email ve password'le giriş yapar.

        hubcomfy.username.sendKeys(ConfigReader.getProperty("hubcomfyUserName"));

        hubcomfy.password.sendKeys(ConfigReader.getProperty("hubcomfyPass"));

        hubcomfy.signInButton.click();

        Thread.sleep(2000);

        //3."My account" butonuna tıklar.


        //Aşağıdaki my account butonunu görünceye kadar js ile scroll yapalım
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",myAccount);

        Thread.sleep(2000);

        hubcomfy.myAccount.click();

        //4. "Store Manager" kısmına tıklar.

        hubcomfy.storeManager.click();

        //5.Reports butonuna tıklar.


        WebElement reports = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[15]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",reports);

        Thread.sleep(2000);


        hubcomfy.reportsButton.click();

        //6. "Year" butonu aracılığı ile 1 yıllık raporların görüntülendiği kontrol edilir.

        hubcomfy.yearReportsButton.click();

        Assert.assertTrue(hubcomfy.ilgiliPeriyottakiSatis.isDisplayed());

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        Thread.sleep(1000);
    }

    @Test
    public void testTC007() throws InterruptedException {

        //url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        //1. Store Manager (SM) sign in butonuna tıklar

        hubcomfy.signInAnasayfa.click();

        //2. Geçerli email ve password'le giriş yapar.

        hubcomfy.username.sendKeys(ConfigReader.getProperty("hubcomfyUserName"));

        hubcomfy.password.sendKeys(ConfigReader.getProperty("hubcomfyPass"));

        hubcomfy.signInButton.click();

        Thread.sleep(2000);

        //3."My account" butonuna tıklar.


        //Aşağıdaki my account butonunu görünceye kadar js ile scroll yapalım
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",myAccount);

        Thread.sleep(2000);

        hubcomfy.myAccount.click();

        //4. "Store Manager" kısmına tıklar.

        hubcomfy.storeManager.click();

        //5.Reports butonuna tıklar.


        WebElement reports = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[15]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",reports);

        Thread.sleep(2000);


        hubcomfy.reportsButton.click();

        //6. Last Month" butonu aracılığı ile önceki ayın raporlarının görüntülendiği kontrol edilir.

        hubcomfy.lastMonthReportsButton.click();

        Assert.assertTrue(hubcomfy.ilgiliPeriyottakiSatis.isDisplayed());

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        Thread.sleep(1000);
    }

    @Test
    public void testTC008() throws InterruptedException {

        //url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        //1. Store Manager (SM) sign in butonuna tıklar

        hubcomfy.signInAnasayfa.click();

        //2. Geçerli email ve password'le giriş yapar.

        hubcomfy.username.sendKeys(ConfigReader.getProperty("hubcomfyUserName"));

        hubcomfy.password.sendKeys(ConfigReader.getProperty("hubcomfyPass"));

        hubcomfy.signInButton.click();

        Thread.sleep(2000);

        //3."My account" butonuna tıklar.


        //Aşağıdaki my account butonunu görünceye kadar js ile scroll yapalım
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",myAccount);

        Thread.sleep(2000);

        hubcomfy.myAccount.click();

        //4. "Store Manager" kısmına tıklar.

        hubcomfy.storeManager.click();

        //5.Reports butonuna tıklar.


        WebElement reports = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[15]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",reports);

        Thread.sleep(2000);


        hubcomfy.reportsButton.click();

        //6."This month" butonu aracılığı ile cari ayın raporlarının görüntülendiği kontrol edilir.

        hubcomfy.thisMonthReportsButton.click();

        Assert.assertTrue(hubcomfy.ilgiliPeriyottakiSatis.isDisplayed());

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        Thread.sleep(1000);

    }

    @Test
    public void testTC009() throws InterruptedException {

        //url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        //1. Store Manager (SM) sign in butonuna tıklar

        hubcomfy.signInAnasayfa.click();

        //2. Geçerli email ve password'le giriş yapar.

        hubcomfy.username.sendKeys(ConfigReader.getProperty("hubcomfyUserName"));

        hubcomfy.password.sendKeys(ConfigReader.getProperty("hubcomfyPass"));

        hubcomfy.signInButton.click();

        Thread.sleep(2000);

        //3."My account" butonuna tıklar.


        //Aşağıdaki my account butonunu görünceye kadar js ile scroll yapalım
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",myAccount);

        Thread.sleep(2000);

        hubcomfy.myAccount.click();

        //4. "Store Manager" kısmına tıklar.

        hubcomfy.storeManager.click();

        //5.Reports butonuna tıklar.


        WebElement reports = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[15]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",reports);

        Thread.sleep(2000);


        hubcomfy.reportsButton.click();

        //6."Last 7 Days" butonu aracılığı ile cari haftanın raporlarının görüntülendiği kontrol edilir.

        hubcomfy.last7DaysReportsButton.click();

        Assert.assertTrue(hubcomfy.ilgiliPeriyottakiSatis.isDisplayed());

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        Thread.sleep(1000);

    }

    @Test
    public void testTC010() throws InterruptedException {

        //url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_URL"));

        //1. Store Manager (SM) sign in butonuna tıklar

        hubcomfy.signInAnasayfa.click();

        //2. Geçerli email ve password'le giriş yapar.

        hubcomfy.username.sendKeys(ConfigReader.getProperty("hubcomfyUserName"));

        hubcomfy.password.sendKeys(ConfigReader.getProperty("hubcomfyPass"));

        hubcomfy.signInButton.click();

        Thread.sleep(2000);

        //3."My account" butonuna tıklar.


        //Aşağıdaki my account butonunu görünceye kadar js ile scroll yapalım
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",myAccount);

        Thread.sleep(2000);

        hubcomfy.myAccount.click();

        //4. "Store Manager" kısmına tıklar.

        hubcomfy.storeManager.click();

        //5.Reports butonuna tıklar.


        WebElement reports = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[15]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",reports);

        Thread.sleep(2000);


        hubcomfy.reportsButton.click();

        Thread.sleep(1000);

        //6."Choose Date Range" butonu ile tarih aralığı seçilebildiği kontrol edilir.

        hubcomfy.chooseDateRangeButton.click();

        Thread.sleep(1000);

       List<WebElement> rangeReports = hubcomfy.chooseDateRangeList;

       rangeReports.forEach(t-> Assert.assertTrue(t.isDisplayed()));

        Driver.getDriver().close();

    }


}
