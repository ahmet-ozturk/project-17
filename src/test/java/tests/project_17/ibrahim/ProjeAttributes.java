package tests.project_17.ibrahim;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class ProjeAttributes {
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void testProjeAnaSayfa() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("hub"));
        ProjePage projePage = new ProjePage();
        projePage.signIn.click();
        projePage.username.sendKeys(ConfigReader.getProperty("hubEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hubPassword"))
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor executor=(JavascriptExecutor)Driver.getDriver();//ulasılamayan lokate leri js ile alır.
        executor.executeScript("arguments[0].click();",projePage.myaccount);
        //Driver.getDriver().switchTo().newWindow(WindowType.TAB);//yeni sekmede açar.
        //Driver.getDriver().get("https://hubcomfy.com/my-account-2/");

        //projePage.myaccount.click();

        projePage.storeManager.click();
        projePage.product.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //ürün ekleme kısmı
        //projePage.addNew.click();
        //Thread.sleep(2000);
        //Select select = new Select(projePage.simpleProduct);
        //String product="Simple Product";
        //select.selectByVisibleText(product);
        //Thread.sleep(3000);

        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Thread.sleep(2000);
        // projePage.title.sendKeys("Kampsandalyesi");
        projePage.kampSandalyesiButonu.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        projePage.attributes.click();
        Thread.sleep(3000);
        //Assert.assertTrue(projePage.attributesColor.isDisplayed());

        projePage.submit.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4));//görünüp sonra kaybolan yazıları alır
        wait.until(ExpectedConditions.visibilityOf(projePage.popUpMessage));


        Assert.assertTrue(projePage.popUpMessage.isDisplayed());

    }
}
