package tests.project_17.harun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import pages.HubcomfyPageHarun;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US020 {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPageHarun hubcomfy = new HubcomfyPageHarun();



    @Test
    public void testTC003() throws InterruptedException {

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

        //5. Customers butonuna tıklar ve kullanıcı bilgilerini kontrol eder

        WebElement customers = Driver.getDriver().findElement(By.xpath("//*[@id='wcfm_menu']/div[8]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",customers);

        Thread.sleep(2000);


        hubcomfy.customersButton.click();


        List<WebElement> customersList1 = hubcomfy.customersList;

        customersList1.forEach(t-> System.out.println(t.getText()));

        customersList1.forEach(t-> Assert.assertTrue(t.isDisplayed()));


       // Driver.getDriver().close();
}


    @Test
    public void testTC004() throws InterruptedException {

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

        //5. Reviews butonu ile gelen yorumları kontrol eder.

        WebElement reviews = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[17]/a/span[2]  "));

        jse.executeScript("arguments[0].scrollIntoView(true);",reviews);

        Thread.sleep(2000);

        hubcomfy.reviewsButton.click();

        Thread.sleep(1000);

        // product reviews butonu ile ürün yorumlarına erişir

        hubcomfy.productReviewsButton.click();


        // product reviews bir liste alınıp incelenir



        List<WebElement> productReviews1 = hubcomfy.productReviewsList;

        productReviews1.forEach(t-> System.out.println(t.getText()));

        productReviews1.forEach(t-> Assert.assertTrue(t.isDisplayed()));

        // Driver.getDriver().close();
    }

    @Test
    public void testTC005() throws InterruptedException {



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

        //5. Reviews butonu ile gelen yorumları kontrol eder.

        WebElement reviews = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_menu\"]/div[17]/a/span[2]  "));

        jse.executeScript("arguments[0].scrollIntoView(true);",reviews);

        Thread.sleep(2000);

        hubcomfy.reviewsButton.click();

        Thread.sleep(1000);

        // product reviews butonu ile ürün yorumlarına erişir

        hubcomfy.productReviewsButton.click();

        List<WebElement> productReviews1 = hubcomfy.productReviewsList;

        ArrayList<WebElement> productReviewsArray = new ArrayList<WebElement>(productReviews1);




    }
}