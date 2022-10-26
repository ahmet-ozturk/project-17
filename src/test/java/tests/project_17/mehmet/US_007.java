package tests.project_17.mehmet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComfyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.util.List;

public class US_007 extends TestBaseRapor {

    ComfyPage hubcomfyPage = new ComfyPage();

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testUS_007() throws InterruptedException, IOException {

        extentTest = extentReports.createTest("PozitifTest", "Story Manager Olarak urun eklendi");


        //Store Manager  https://hubcomfy.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("hubcomfyUrl"));
        extentTest.info("hubcomfyUrl sitesine gidildi");

        //Sign-in sekmesine tiklar
        hubcomfyPage.signIn.click();
        extentTest.info("singin butonuna tiklandi");

        //Store Manager  olarak gecerli Username girer
        actions.click(hubcomfyPage.userNameEmail).sendKeys(ConfigReader.getProperty("hubcomfyEmail")).perform();
        extentTest.info("gecerli email girildi");


        //Store Manager  olarak gecerli Password girer
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hubcomfyPassword")).perform();
        extentTest.info("gecerli password girildi");


        //Sign-in butonuna tiklar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        hubcomfyPage.signOut.click();
        extentTest.info("signIn botonuna tiklandi");

        //Store Manager sekmesine tiklar
        hubcomfyPage.storyManager.click();
        extentTest.info("Story manager sekmesine tiklandi");

        //Products sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        hubcomfyPage.productsSekme.click();
        extentTest.info("Product sekmesine tiklandi");

        //Store Manager status,stock,price,date görünürlügünü doğrular
        List<WebElement> status = hubcomfyPage.status;
        System.out.println("===========status==========");
        status.forEach(t -> System.out.println(t.getText()));
        Assert.assertTrue(!status.isEmpty());

        System.out.println("===========price==========");
        List<WebElement> price = hubcomfyPage.urunPrice;
        price.forEach(t -> System.out.println(t.getText()));
        Assert.assertTrue(!status.isEmpty());

        System.out.println("===========date==========");
        List<WebElement> date = hubcomfyPage.date;
        date.forEach(t -> System.out.println(t.getText()));
        Assert.assertTrue(!status.isEmpty());
        extentTest.info("urunler (status,price date olarak) goruntulendi");


        //Acilan sayfada  Add New butonuna tıklar.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.getScreenshot("products resim");
        Thread.sleep(2000);
        hubcomfyPage.addNew.click();
        extentTest.info("Urunlerin oldugu sayfanin Resmi alindi ");

        //Acilan sayfada virtual secenegini secer
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.moveToElement(hubcomfyPage.virtual).click().perform();
        extentTest.info("Virtual secenegi secildi");

        //Acilan sayfada Downloadable secenegini secer
        actions.moveToElement(hubcomfyPage.downloadable).click().perform();
        extentTest.info("Downloadable secenegi secildi");

        //Product Title kısmına  urun ismini girer
        actions.click(hubcomfyPage.producTitle).sendKeys("LAPTOP-NUDTQMN4").perform();
        extentTest.info("Title kısmına urun ismini girildi");

        //Price kismina urun  fiyatini girer
        actions.click(hubcomfyPage.price).sendKeys("500").perform();
        extentTest.info("Price kismina Urun fiyati girildi");

        //Sale Price kismina Urun indirimli  fiyatini girer
        actions.click(hubcomfyPage.salePrice).sendKeys("450").perform();
        extentTest.info("SalePrice kismina Urun fiyati girildi");

        //Urun fotosu ekler
        //Sağdaki boş image kismina  tıklar.
        hubcomfyPage.images.click();

        //Acilan pencerede urun icin bir foto secer
        //sectigi fotografla alakali bilgileri sag tarafda acilan pencerede girer
        //select butonuna tiklar
        hubcomfyPage.mediaLibrary.click();
        actions.click(hubcomfyPage.huaweiImage).perform();
        Thread.sleep(3000);
        actions.click(hubcomfyPage.imageAllText).sendKeys("MateBook D 15").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("LAPTOP-NUDTQMN4").
                sendKeys(Keys.TAB).sendKeys("Windows 11 Home Single Language").
                sendKeys(Keys.TAB).sendKeys("LAPTOP-NUDTQMN4,MateBook D 15").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Urun icin foto eklendi");

        //acilan sayfada yan taraf daki kucuk bos image sayfasina tiklar
        //Acilan pencerede urun icin bir foto secer
        //sectigi fotografla alakali bilgileri sag tarafda acilan pencerede girer
        //ADD TO GALLERY butonuna tiklar
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", hubcomfyPage.kucukImage);
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", hubcomfyPage.huaweiImage2);
        Thread.sleep(5000);
        actions.click(hubcomfyPage.imageAllText).sendKeys("MateBook D 15").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("LAPTOP-NUDTQMN4").
                sendKeys(Keys.TAB).sendKeys("Windows 11 Home Single Language").
                sendKeys(Keys.TAB).sendKeys("LAPTOP-NUDTQMN4,MateBook D 15").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Urun icin galeriye foto eklendi");

        Thread.sleep(3000);


        //urun ile kisa aciklama yapmak icin Short Description textbox kimina tiklar
        //textbox kismina aciklamayi yazar
        //aciklama ile alakali foto eklemek icin ADD MEDIA butonuna tiklar

        //acilan pencereden fotograf secer
        //ve INSERT INTO POST simgesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        List<WebElement> iframeList = Driver.getDriver().findElements(By.xpath("//iframe"));
        Driver.getDriver().switchTo().frame(iframeList.get(0));

        actions.click(hubcomfyPage.sortDescriptions).sendKeys("LAPTOP-NUDTQMN4,MateBook D 15").perform();
        Thread.sleep(3000);
        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Urun hakkinda kisa tanimlama yapildi");

        Driver.getDriver().switchTo().frame(iframeList.get(1));
        Thread.sleep(3000);

        actions.click(hubcomfyPage.descriptions).
                sendKeys("Cihaz Adi : LAPTOP-NUDTQMN4\n" +
                        "Islemci : 11th Gen Intel(R) Core(TM) i5-1135G7 @ 2.40GHz2.42 GHz,8,00 GB (kullanılabilir: 7,80 GB)\n" +
                        "Cihaz Kimligi : F81B0F48-4C86-45DD-ACBE-52A0DC84667D\n" +
                        "Sistem Turu : 64 bit işletim sistemi, x64 tabanlı işlemci").perform();
        // katagori kismindan "Elektrik & Elektronik"  kismini secebilmeli
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(5000);
        extentTest.info("Urun hakkinda genis tanimlama yapildi ");

        // katagori kismindan "Elektrik & Elektronik"  kismini secebilmeli
        actions.click(hubcomfyPage.categoriesKutu).perform();
        JavascriptExecutor jse1 = (JavascriptExecutor) Driver.getDriver();
        jse1.executeScript("arguments[0].click();", hubcomfyPage.electronic);
        extentTest.info("Kategori kismindan elektronik secenegi secildi");

        //Urun markasinin huawei oldugunu belirleyebilmeli
        actions.click(hubcomfyPage.brandKutu).perform();
        JavascriptExecutor jse2 = (JavascriptExecutor) Driver.getDriver();
        jse2.executeScript("arguments[0].click();", hubcomfyPage.brandTik);
        extentTest.info("Urun markasi secildi");


        /*List<WebElement> categoriBrand =hubcomfyPage.categories;
        int sekme = 4;
        for (int i = 0; i <categoriBrand.size() ; i++) {
            if (sekme==categoriBrand.indexOf(i)) {
                categoriBrand.get(i).click();

            }
        }
*/
        //Draft butonuna tiklar
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", hubcomfyPage.draft);
        Thread.sleep(4000);

        JavascriptExecutor jse3 = (JavascriptExecutor) Driver.getDriver();
        jse3.executeScript("arguments[0].click();", hubcomfyPage.draft);
        Thread.sleep(2000);


        //basari ile urun eklendi mesajini goruru
        Assert.assertTrue(hubcomfyPage.eklenenUrunLink.isDisplayed());
        extentTest.info("Urunun basarili sekilde eklendigi goruntulendi");


    }
}
