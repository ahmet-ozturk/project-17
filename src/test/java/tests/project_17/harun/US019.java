package tests.project_17.harun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import pages.HubcomfyPageHarun;
import utilities.ConfigReader;
import utilities.Driver;

public class US019 {

    Actions actions = new Actions(Driver.getDriver());

    HubcomfyPageHarun hubcomfy = new HubcomfyPageHarun();




    @Test
    public void testTC001() throws InterruptedException {

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


        //5. Followers butonuna tıklar.

        WebElement followers = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[1]/div[1]/div[12]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",followers);

        Thread.sleep(2000);


        hubcomfy.followersButton.click();



        //6.Takipçilerin isim ve e-postalarını kontrol eder.

        Driver.getDriver().close();


    }


    @Test
    public void testTC002() throws InterruptedException {

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


        //5. Followers butonuna tıklar.

        WebElement followers = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[1]/div[1]/div[12]/a/span[2]"));

        jse.executeScript("arguments[0].scrollIntoView(true);",followers);

        Thread.sleep(2000);


        hubcomfy.followersButton.click();

        //6. Actions butonu ile işlemleri kontrol eder.

        
    }

}
