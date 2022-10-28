package tests.project_17.ibrahim;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
    JavascriptExecutor executor=(JavascriptExecutor)Driver.getDriver();
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

        projePage.storeManager.click();
        projePage.product.click();
        executor.executeScript("arguments[0].scrollIntoView(true);",projePage.kampSandalyesiButonu);
        executor.executeScript("arguments[0].click();",projePage.kampSandalyesiButonu);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        projePage.attributes.click();
        Thread.sleep(3000);
        projePage.submit.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(projePage.popUpMessage));


        //Assert.assertTrue(mesajGör.isDisplayed());


        String actualText = projePage.popUpMessage.getText();
        String expectedText = "Product Successfully Published.";
        Assert.assertEquals(expectedText,actualText);
        System.out.println("submit onay yazisi="+projePage.popUpMessage.getText());
        //Driver.closeDriver();

    }
}
