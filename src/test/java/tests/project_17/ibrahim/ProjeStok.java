package tests.project_17.ibrahim;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;

public class ProjeStok extends TestBaseRapor {
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor executor=(JavascriptExecutor)Driver.getDriver();
    @Test
    public void testProjeAnaSayfa() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Test","Urun miktarı stock belirlenmeli, Backorder izni verebilmeli, gecici verilmeme optionu olmalı veya verilmeli ama müşteri bilgilendirilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("hub"));
        extentTest.info("1- Hubcomfy sitesine gidildi");
        ProjePage projePage = new ProjePage();
        projePage.signIn.click();
        projePage.username.sendKeys(ConfigReader.getProperty("hubEmail"));

        extentTest.info("2- Vendor acilan pencereden sign in simgesine tiklar");
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hubPassword")).sendKeys(Keys.ENTER).perform();
        extentTest.info("3- Vendor username or email address alanina gecerli bir kullanici adi veya email girer");
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        extentTest.info("4- Vendor acilan sayfada 'My Account' simgesine tiklar");

        executor.executeScript("arguments[0].click();",projePage.myaccount);

        projePage.storeManager.click();
        extentTest.info("5- Vendor Store Manager baslikli simgeyi tiklar");

        projePage.product.click();
        extentTest.info("6- Vendor acilan yeni sayfada 'Products' basligini tiklar");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        projePage.kampSandalyesiButonu.click();

        extentTest.info("7- Vendor bir urunun uzerine tiklar");
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        projePage.stockQuantity.clear();

        extentTest.info("8- Vendor stockQuantity uzerine tiklar");
        projePage.stockQuantity.sendKeys("9");
        if (!projePage.doNotAllow.isSelected()) {
            projePage.doNotAllow.click();
            extentTest.info("9- Vendor \"Do not Allow\" opsiyonunu secer");
        }
        if (!projePage.allow.isSelected()) {
            projePage.allow.click();
            extentTest.info("10- Allow, but notify customer opsiyonunu secer");
        }

        if (!projePage.allowButNotifyCustomer.isSelected()) {
            projePage.allowButNotifyCustomer.click();
            extentTest.info("11- \"Allow\" opsiyonunu secer");
        }
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Thread.sleep(2000);
        executor.executeScript("arguments[0].scrollIntoView(true);",projePage.submit);
        executor.executeScript("arguments[0].click();",projePage.submit);

        extentTest.info("12- submit butonunu secer");
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //WebElement mesajGör=wait.until(ExpectedConditions.visibilityOf(projePage.popUpMessage));
        wait.until(ExpectedConditions.visibilityOf(projePage.popUpMessage));
        extentTest.info("13- Product Successfully Published yazisini cikttigini dogrular");


        System.out.println("submit onay yazisi="+projePage.popUpMessage.getText());
        String actualText = projePage.popUpMessage.getText();
        String expectedText = "Product Successfully Published.";
        Assert.assertEquals(expectedText,actualText);

        // Assert.assertTrue(projePage.popUpMessage.isDisplayed());

        extentTest.info("14- sayfayi kapatir");
        //Driver.closeDriver();
    }
}
