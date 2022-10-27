package tests.project_17.hasanali.US_016;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomersPage;
import utilities.Driver;
import utilities.ReusableMethods;
//import utilities.ReusableMethots;

import java.time.Duration;

public class TC005 {

    //ReusableMethods reusableMethots = new ReusableMethods();
    CustomersPage customersPage = new CustomersPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test1() throws InterruptedException {
        //reusableMethods.storManagerSayfasiDogrulama();

        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",customersPage.AddNewCustomer);
        jse.executeScript("arguments[0].click();",customersPage.AddNewCustomer);
        Thread.sleep(3000);
        customersPage.AddNewUserName.sendKeys("Velii");
        actions.sendKeys(Keys.TAB).sendKeys("velii@gmail.com").
                sendKeys(Keys.TAB).sendKeys("Veli").
                sendKeys(Keys.TAB).sendKeys("Cann").perform();
        jse.executeScript("arguments[0].scrollIntoView(true);",customersPage.AddNewCustomerSubmitButton);
        jse.executeScript("arguments[0].click();",customersPage.AddNewCustomerSubmitButton);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(customersPage.basariylaKaydedildi));

        Assert.assertTrue(customersPage.basariylaKaydedildi.isDisplayed());


    }
}