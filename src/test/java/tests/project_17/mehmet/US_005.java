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

import java.io.IOException;
import java.util.List;

public class US_005 {

    ComfyPage hubcomfyPage = new ComfyPage();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void testUS_005() throws InterruptedException, IOException {
        //Store Manager  https://hubcomfy.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("hubcomfyUrl"));

        //Sign-in sekmesine tiklar
        hubcomfyPage.signIn.click();

        //Store Manager  olarak gecerli Username girer
        actions.click(hubcomfyPage.userNameEmail).sendKeys(ConfigReader.getProperty("hubcomfyEmail")).perform();

        //Store Manager  olarak gecerli Password girer
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hubcomfyPassword")).perform();

        //Sign-in butonuna tiklar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        hubcomfyPage.signOut.click();

        //Store Manager sekmesine tiklar
        hubcomfyPage.storyManager.click();

        //Products sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        hubcomfyPage.productsSekme.click();




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


        //Acilan sayfada  Add New butonuna tıklar.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.getScreenshot("products resim");
        Thread.sleep(2000);
        hubcomfyPage.addNew.click();

        //Acilan sayfada virtual secenegini secer
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.moveToElement(hubcomfyPage.virtual).click().perform();

        //Acilan sayfada Downloadable secenegini secer
        actions.moveToElement(hubcomfyPage.downloadable).click().perform();

        //Product Title kısmına  urun ismini girer
        actions.click(hubcomfyPage.producTitle).sendKeys("LAPTOP-NUDTQMN4").perform();

        //Price kismina urun  fiyatini girer
        actions.click(hubcomfyPage.price).sendKeys("500").perform();

        //Sale Price kismina Urun indirimli  fiyatini girer
        actions.click(hubcomfyPage.salePrice).sendKeys("450").perform();

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

        Driver.getDriver().switchTo().frame(iframeList.get(1));
        Thread.sleep(3000);

        actions.click(hubcomfyPage.descriptions).
                sendKeys("Cihaz Adi : LAPTOP-NUDTQMN4\n" +
                        "Islemci : 11th Gen Intel(R) Core(TM) i5-1135G7 @ 2.40GHz2.42 GHz,8,00 GB (kullanılabilir: 7,80 GB)\n" +
                        "Cihaz Kimligi : F81B0F48-4C86-45DD-ACBE-52A0DC84667D\n" +
                        "Sistem Turu : 64 bit işletim sistemi, x64 tabanlı işlemci").perform();


        //submit butonuna tiklar

        //basari ile urun eklendi mesajini goruru


    }

}
