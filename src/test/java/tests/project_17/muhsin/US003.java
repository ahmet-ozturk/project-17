package tests.project_17.muhsin;

import com.sun.jna.Structure;
import org.asynchttpclient.netty.util.ByteBufUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import utilities.Driver;

import java.util.ArrayList;

public class US003 {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPage hubcomfy = new HubcomfyPage();


    ArrayList<String> windows;
    @Test
    public void registerOrderTest() throws InterruptedException {
        windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());

        //TC_001
        //vendor url'ye gider
        Driver.getDriver().get("https://www.hubcomfy.com/");

        //vendor sign in tıklar
        hubcomfy.signInAnasayfa.click();

        //vendor username veya e-mail adres kısmına tıklar
        hubcomfy.username.click();

        //vendor e-mail girer
        actions.sendKeys("ahmetozturk.qa@gmail.com");

        //"vendor password kısmına tıklar
        actions.sendKeys(Keys.TAB).perform();

        //"vendor password girer
        actions.sendKeys("Ahmet123.,").perform();

        //vendor sign in butonunu tıklar
        hubcomfy.signInButton.click();

        //vendor sign out butonunu tıklar
        hubcomfy.signOut.click();

        //vendor oreders butonuna tıklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hubcomfy.orders.click();

        //vendor orders sayfasında GO SHOP butonuna tıklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hubcomfy.goshop.sendKeys(Keys.ENTER);

        //vendor GO SHOP sayfasına girilebildiğini görür
        hubcomfy.goshoptext.isDisplayed();
        Thread.sleep(2000);

        //TC002

        //vendor tercih ettiği bir urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        hubcomfy.urun1Buton.click();
        Thread.sleep(2000);
        hubcomfy.addButon.click();
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        //vendor tercih ettiği 2. urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        Thread.sleep(2000);
        hubcomfy.urun2Buton.click();
        Thread.sleep(1000);
        hubcomfy.addButon.click();
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        //vendor tercih ettiği 3. urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        hubcomfy.urun3Buton.click();
        Thread.sleep(1000);
        hubcomfy.addButon.click();
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
        //vendor tercih ettiği 4. urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        hubcomfy.urun4Buton.click();
        hubcomfy.addButon.click();
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        //vendor tercih ettiği 5. urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        hubcomfy.urun5Buton.click();
        hubcomfy.addButon.click();
        Thread.sleep(1000);
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);

        //TC003

        //vendor shopping sayfasında "out of stock" etiketli ürüne tıklar
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        hubcomfy.urunStockOutButon.click();
        Thread.sleep(2000);
        //vendor tıkladığı out of stock urunun açıldığı sayfada ADD TO CART butonunu göremez
        Assert.assertTrue(hubcomfy.addButon.isEnabled());
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);

        //TC004

        //vendor Cart botonuna tıklar
        hubcomfy.cartButon.click();
        //vendor açılan SHOPPING CART sayfasında seçtiği 5 ürünü görür
        Driver.getDriver().
                findElement(By.xpath(
                        "(//*[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[1]")).isDisplayed();
        Driver.getDriver().
                findElement(By.xpath(
                        "(//*[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[2]")).isDisplayed();
        Driver.getDriver().
                findElement(By.xpath(
                        "(//*[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[3]")).isDisplayed();
        Driver.getDriver().
                findElement(By.xpath(
                        "(//*[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[4]")).isDisplayed();
        Driver.getDriver().
                findElement(By.xpath(
                        "(//*[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[5]")).isDisplayed();
        Thread.sleep(2000);
        //vendor CHECKOUT butonuna tıklar, Checkout'a  gider
        hubcomfy.checkoutButon.click();

        //TC005

        //vendor first name butonunda ismini görür
       String name= Driver.getDriver().findElement(By.id("billing_first_name")).getText();
       name.equals("ahmet");

       //vendor last name butonunda soyismini görür
        String lasTname= Driver.getDriver().findElement(By.id("billing_last_name")).getText();
        lasTname.equals("ozturk");

        //vendor company name butonunda şirket ismini görür
        String comPanyName= Driver.getDriver().findElement(By.id("billing_company")).getText();
        comPanyName.equals("testSipariş1");

        //vendor country/region butonunda ülke ismini görür
        String counTryName= Driver.getDriver().findElement(By.id("select2-billing_country-container")).getText();
        counTryName.equals("Turkey");

        //vendor street adress butonunda  adres bilgilerini görür
        String streetAdress= Driver.getDriver().findElement(By.id("billing_address_1")).getText();
        streetAdress.equals("akkakent mah karanfil sok");

        //vendor postcode butonunda posta kodunu görür
        String postCode= Driver.getDriver().findElement(By.id("billing_first_name")).getText();
        postCode.equals("012222");

        //vendor town/city butonunda bölge ismini görür
        String toWmName= Driver.getDriver().findElement(By.xpath("//*[@id='billing_city']")).getText();
        toWmName.equals("ahmet");

        //vendor province butonunda şehir ismini görür
        String ciTyName= Driver.getDriver().findElement(By.id("select2-billing_state-container")).getText();
        ciTyName.equals("Kütahya");

        //vendor phone butonunda telefon numarasını görür
        String pHoneNumber= Driver.getDriver().findElement(By.id("billing_phone")).getText();
        pHoneNumber.equals("ahmet");

        //vendor e-mail butonunda e mail adresini görür
        String mAil= Driver.getDriver().findElement(By.id("billing_email")).getText();
        mAil.equals("ahmetozturk.qa@gmail.com");
        Thread.sleep(2000);

        //TC006

        //vendor place order butonuna tıklar
        // "thank you.your order has been received" yazısı ile order yapılabildiğini görür
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
       hubcomfy.placeOrderButon.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
       hubcomfy.OrderCompleteButon.isDisplayed();



    }
}
