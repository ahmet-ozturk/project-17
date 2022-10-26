package tests.project_17.muhsin;

import com.sun.jna.Structure;
import com.sun.source.tree.WhileLoopTree;
import io.opentelemetry.sdk.trace.samplers.SamplingResult;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HubcomfyPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;

public class US004 {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPage hubcomfy = new HubcomfyPage();

    SoftAssert softAssert=new SoftAssert();
    ArrayList<String> windows;
    @Test
    public void registerOrderTest() throws InterruptedException {
        windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());

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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        hubcomfy.orders.click();

        //vendor orders sayfasında GO SHOP butonuna tıklar
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        hubcomfy.goshop.sendKeys(Keys.ENTER);

        //vendor GO SHOP sayfasına girilebildiğini görür
        hubcomfy.goshoptext.isDisplayed();
        Thread.sleep(2000);

        //vendor tercih ettiği bir urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
        hubcomfy.urun1Buton.click();
        Thread.sleep(2000);
        hubcomfy.addButon.click();
        //vendor GO SHOP sayfasına geri döner
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        //vendor tercih ettiği 2. urune tıklar, seçtiği urunu gözlemler ADDTOCART butonuna tıklar
       // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
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

        Thread.sleep(2000);

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

        //US_004 TC_001

        //vendor açılan SHOPPING CART sayfasında VİEW CART butonuna tıklar
        Driver.getDriver().findElement(By.xpath("//*[@class='button wc-forward']")).click();
        Thread.sleep(1000);

        //vendor seçtiği urunlerin rakam,miktar,toplamını view cart'ta görür
        Driver.getDriver().findElement(By.xpath("//*[@class='col-lg-8 pr-lg-4']")).isDisplayed();
        Thread.sleep(2000);


        //TC_002
        //vendor QUANTİTY başlığı altında + butona tıklar  //vendor urun rakamının arttığını görür
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[1]")).click();
        Thread.sleep(1000);
        WebElement urunRakami1=Driver.getDriver().findElement(By.xpath("(//*[@class='input-text qty text'])[1]"));
        Thread.sleep(1000);

        //String expected="2";
       // String actualy= urunRakami1.getText();
       Assert.assertNotEquals(urunRakami1.getText(),"1");



        Thread.sleep(1000);

        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[2]")).click();
        WebElement urunRakami2=Driver.getDriver().findElement(By.xpath("(//*[@class='input-text qty text'])[2]"));
        Thread.sleep(1000);

       // String expected1="2";
       // String actualy1= urunRakami2.getText();
        Assert.assertNotEquals(urunRakami2.getText(),"1");

        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[3]")).click();
        WebElement urunRakami3=Driver.getDriver().findElement(By.xpath("(//*[@class='input-text qty text'])[3]"));


        Thread.sleep(1000);

       // String expected2="2";
       // String actualy2= urunRakami3.getText();
        Assert.assertNotEquals(urunRakami3.getText(),"1");

        Thread.sleep(1000);

        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[4]")).click();
        WebElement urunRakami4=Driver.getDriver().findElement(By.xpath("(//*[@class='input-text qty text'])[4]"));
        Thread.sleep(1000);

       // String expected3="2";
        //String actualy3= urunRakami4.getText();
        Assert.assertNotEquals(urunRakami4.getText(),"1");

         //actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[5]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[5]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-plus w-icon-plus'])[5]")).click();
        Thread.sleep(1000);

        WebElement urunRakami5=Driver.getDriver().findElement(By.xpath("(//*[@class='input-text qty text'])[5]"));
        Thread.sleep(1000);

       // String expected4="2";
       // String actualy4= urunRakami5.getText();
        Assert.assertNotEquals(urunRakami5.getText(),"1");

        Thread.sleep(3000);

        //vendor QUANTİTY başlığı altında - butona tıklar //vendor urun rakamının azaldığını görür
        Driver.getDriver().findElement(By.xpath("(//*[@class='quantity-minus w-icon-minus'])[5]")).click();
        Thread.sleep(1000);
       // String expected5="3";
        //String actualy5= urunRakami5.getText();
        Assert.assertNotEquals(urunRakami5.getText(),"4");


        //TC_004
        //vendor VİEW CART sayfasında UPDATE CART butonunu görür
        WebElement updateCart=Driver.getDriver().findElement(By.xpath("//*[@name='update_cart']"));
        updateCart.isDisplayed();
        Thread.sleep(1000);
        //vendor UPDATE CART butonuna tıklar
        updateCart.click();
        Thread.sleep(3000);
        //vendor rakam ortalamalrının güncellendiğini görür
        WebElement uPdate=Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']"));
        Thread.sleep(4000);
        uPdate.isDisplayed();


        //TC_005
        //vendor VİEW CART sayfasında CLEAR CART btonunu görür
        WebElement viewCart=Driver.getDriver().findElement(By.xpath("//*[@name='clear_cart']"));
        Thread.sleep(1000);
        viewCart.isEnabled();
        Thread.sleep(1000);



        //TC_005
        //vendor APPLY COUPON butonunu görür
        WebElement applyCoupon=Driver.getDriver().findElement(By.xpath("//*[@name='apply_coupon']"));
        applyCoupon.isDisplayed();
        Thread.sleep(1000);

        //TC_006
        //vendorCONTINUE SHOPPING butonunu görür
       WebElement shopContinue= Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']"));
       shopContinue.isDisplayed();
        Thread.sleep(2000);

        //TC_007
        //vendor Shipping bilgilerini ve toplam rakamı görür,
        Driver.getDriver().findElement(By.xpath("(//*[@class='woocommerce-Price-amount amount'])[15]")).isDisplayed();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[text()='012222 dumlupınar Kütahya, Turkey']")).isDisplayed();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[@class='state_select']")).isDisplayed();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[@value='dumlupınar']")).isDisplayed();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='woocommerce-Price-amount amount'])[19]")).isDisplayed();
        Thread.sleep(1000);


        //TC_008
        //vendor PROCEED TO CHECKOUT butonunu görür
        WebElement proCeedChekcout=Driver.getDriver().findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']"));
        proCeedChekcout.isDisplayed();
        Thread.sleep(2000);
        //vendor PROCEED TO CHECKOUT butonuna tıklar
        proCeedChekcout.click();
        Thread.sleep(2000);
        //vendor ödeneklere yönlendirildiğini görür
        Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-checkout-payment']")).isDisplayed();

        Thread.sleep(2000);
        Driver.getDriver().navigate().back();
        Thread.sleep(1000);
       Driver.getDriver().findElement(By.xpath("//*[@name='clear_cart']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[text()='Your cart is currently empty.']")).isDisplayed();




    }

}
