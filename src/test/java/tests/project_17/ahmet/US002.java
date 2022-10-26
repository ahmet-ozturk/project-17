package tests.project_17.ahmet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US002 extends TestBaseRapor {

    HubcomfyPage hubcomfy = new HubcomfyPage();

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void myAccountDisplay() {

        extentTest=extentReports.createTest("My Account sayfasindaki butonlar gorunur olmalidir ");

        // vendor url'e gider
        Driver.getDriver().get("https://hubcomfy.com/");
        extentTest.info("URL'e gidildi");

        // vendor sign in butonuna tiklar
        hubcomfy.signInAnasayfa.click();
        extentTest.info("Sign in butonuna tiklandi");

        // vendor Username or email address kismina tiklar
        hubcomfy.username.click();
        extentTest.info("E-mail kismina tiklandi");

        // vendor e-mail girer
        actions.sendKeys("ahmetozturk.qa@gmail.com");
        extentTest.info("E-Mail girildi");

        // vendor password kismina tiklar
        actions.sendKeys(Keys.TAB).perform();
        extentTest.info("Password kismina tiklandi");

        // vendor sifre girer
        actions.sendKeys("Ahmet123.,").perform();
        extentTest.info("Password girildi");

        ReusableMethods.waitFor(1);

        // vendor sign in butonuna tiklar
        hubcomfy.signInButton.click();
        extentTest.info("Sign in butonuna tiklandi");

        // vendor my account sayfasinin gorunur oldugunu dogrular
        hubcomfy.signOut.click();
        ReusableMethods.waitFor(3);
        hubcomfy.myAccountDisplay.isDisplayed();
        extentTest.info("My Account sayfasinin gorunur oldugu dogrulandi");


        // vendor my account sayfasindaki orders butonunu gorebilmelidir
        hubcomfy.orders.isDisplayed();
        extentTest.info("Orders butonunun gorunur oldugu dogrulandi");

        // vendor my account sayfasindaki download butonunu gorebilmelidir
        hubcomfy.downloads.isDisplayed();
        extentTest.info("Download butonunun gorunur oldugu dogrulandi");

        // vendor my account sayfasindaki adresses butonunu gorebilmelidir
        hubcomfy.addresses.isDisplayed();
        extentTest.info("Adresses butonunun gorunur oldugu dogrulandi");

        // vendor my account sayfasindaki account details butonunu gorebilmelidir
        hubcomfy.account.isDisplayed();
        extentTest.info("Account Details butonunun gorunur oldugu dogrulandi");

        // vendor my account sayfasindaki wishlist butonunu gorebilmelidir
        hubcomfy.wishlist.isDisplayed();
        extentTest.info("Wishlist butonunun gorunur oldugu dogrulandi");

        // vendor my account sayfasindaki logout butonunu gorebilmelidir
        hubcomfy.logout.isDisplayed();
        extentTest.info("Logout butonunun gorunur oldugu dogrulandi");


        // vendor dashboard altında, store manager butonunu gorebilmelidir
        hubcomfy.dashboardStoreManager.isDisplayed();
        extentTest.info("Dashboard-Store Manager butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, orders butonunu gorebilmelidir
        hubcomfy.dashboardOrders.isDisplayed();
        extentTest.info("Dashboard-Orders butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, downloads butonunu gorebilmelidir
        hubcomfy.dashboardDownloads.isDisplayed();
        extentTest.info("Dashboard-Downloads butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, adresses butonunu gorebilmelidir
        hubcomfy.dashboardAddresses.isDisplayed();
        extentTest.info("Dashboard-Adresses butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, account details butonunu gorebilmelidir
        hubcomfy.dashboardAccountDetails.isDisplayed();
        extentTest.info("Dashboard-Account Details butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, wishlist butonunu gorebilmelidir
        hubcomfy.dashboardWishlist.isDisplayed();
        extentTest.info("Dashboard-Wishlist butonunun gorunur oldugu dogrulandi");

        // vendor dashboard altında, appointments butonunu gorebilmelidir

        Driver.closeDriver();
        extentTest.info("Sayfa kapatildi");
    }
}