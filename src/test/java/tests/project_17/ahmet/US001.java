package tests.project_17.ahmet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;

public class US001 extends TestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPage hubcomfy = new HubcomfyPage();

    ArrayList<String> windows;

    @Test
    public void registerNavigateTest() {

        extentTest=extentReports.createTest("Register Navigate Edilebilmelidir");

        windows= new ArrayList<String>(Driver.getDriver().getWindowHandles());

        //  vendor url'e gider

        Driver.getDriver().get("https://hubcomfy.com/");

        extentTest.info("URL'e gidildi");

        //  vendor register'e tiklar

        ReusableMethods.waitFor(1);

        hubcomfy.register.click();

        extentTest.info("Register'a tiklandi");

        //  vendor become a vendor tiklar

        hubcomfy.becomeVendor.click();

        extentTest.info("Become a vendor'a tiklandi");

        ReusableMethods.waitFor(1);

    }

    @Test

    public void registerTest() {

        extentTest=extentReports.createTest("E-mail , Password ve Confirm Password kisimlari girilebilmelidir");

        //  vendor acilan menude e-mail, password ve confirm password kisimlarini gorur

        Assert.assertTrue(hubcomfy.eMailDisplay.isDisplayed());

        extentTest.info("E-Mail kisminin gorunurlugu test edildi");

        Assert.assertTrue(hubcomfy.passwordDisplay.isDisplayed());

        extentTest.info("Password kisminin gorunurlugu test edildi");

        Assert.assertTrue(hubcomfy.confirmEmailDisplay.isDisplayed());

        extentTest.info("Confirm password kisminin gorunurlugu test edildi");

        //  vendor Username or email address kismina tiklar

        hubcomfy.eMail.click();

        extentTest.info("E-mail'e tiklandi");

        //  vendor unique bir e-mail girer

        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);

        String handle= Driver.getDriver().getWindowHandle();

        Driver.getDriver().get("https://tr.emailfake.com/");

        ReusableMethods.waitFor(1);

        Driver.getDriver().findElement(By.xpath("//*[@id=\"copbtn\"]")).click();

        ReusableMethods.waitFor(1);

        Driver.getDriver().switchTo().window(windows.get(0));

        ReusableMethods.waitFor(1);

        hubcomfy.eMail.sendKeys(Keys.CONTROL+"v");

        extentTest.info("E-Mail girildi");

        ReusableMethods.waitFor(1);

        Driver.getDriver().findElement(By.xpath("//*[@name=\"wcfm_email_verified_input\"]")).click();

        extentTest.info("Verification Code tiklandi");

        ReusableMethods.waitFor(1);

        //  vendor e-mail'ine gelen aktivasyon kodunu alir

        Driver.getDriver().switchTo().window(handle);

        String mailBox = Driver.getDriver().findElement(By.xpath("//*[@style=\"font-size:1.1rem;font-weight:100;padding:0;margin:0;line-height:0;display:inherit;\"]")).getText();

        String mail = mailBox.replaceAll("\\D","");

        //  vendor verification code kismina tiklar

        ReusableMethods.waitFor(1);

        Driver.getDriver().switchTo().window(windows.get(0));

        ReusableMethods.waitFor(1);

        Driver.getDriver().findElement(By.xpath("//*[@name=\"wcfm_email_verified_input\"]")).click();

        //  vendor e-mail'ine gelen kodu buraya girer

        ReusableMethods.waitFor(1);

        Driver.getDriver().findElement(By.xpath("//*[@name=\"wcfm_email_verified_input\"]")).sendKeys(mail);

        extentTest.info("Code girildi");

        //  vendor password kismina tiklar

        //  vendor guclu bir password girer(kucuk harf, buyuk harf, rakam, special karakter)

        ReusableMethods.waitFor(1);

        hubcomfy.password.sendKeys("Aa123.,");

        extentTest.info("Password tiklandi");

        extentTest.info("Password girildi");

        //  vendor confirm password kismina tiklar

        //  vendor confirm password kismina tekrar ayni password 'u girer

        ReusableMethods.waitFor(1);

        hubcomfy.confirmPassword.sendKeys("Aa123.,");

        extentTest.info("Confirm Password tiklandi");

        extentTest.info("Password tekrar girildi");

        //  vendor register 'a tiklar

        ReusableMethods.waitFor(10);

        actions.sendKeys(Keys.ENTER).perform();

        extentTest.info("Register'a tiklandi");

        ReusableMethods.waitFor(2);

        //  vendor Registration Successfully Completed.mesajini gorur

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='wcfm-message wcfm-success']")).isDisplayed());

        extentTest.info("Registration Successfully Completed yazisi goruntulendi");

        Driver.quitDriver();

        extentTest.info("Sayfa kapatildi");
    }
}