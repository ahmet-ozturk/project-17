package tests.project_17.ahmet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HubcomfyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002 {

    HubcomfyPage hubcomfy = new HubcomfyPage();

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void myAccountDisplay() {


        // vendor url'e gider
        Driver.getDriver().get("https://hubcomfy.com/");

        // vendor sign in butonuna tiklar
        hubcomfy.signInAnasayfa.click();

        // vendor Username or email address kismina tiklar
        hubcomfy.username.click();

        // vendor e-mail girer
        actions.sendKeys("ahmetozturk.qa@gmail.com");

        // vendor password kismina tiklar
        actions.sendKeys(Keys.TAB).perform();

        // vendor sifre girer
        actions.sendKeys("Ahmet123.,").perform();

        ReusableMethods.waitFor(1);

        // vendor sign in butonuna tiklar
        hubcomfy.signInButton.click();

        // vendor my account sayfasinin gorunur oldugunu dogrular
        hubcomfy.signOut.click();
        ReusableMethods.waitFor(3);
        hubcomfy.myAccountDisplay.isDisplayed();


        // vendor my account sayfasindaki orders butonunu gorebilmelidir
        hubcomfy.orders.isDisplayed();

        // vendor my account sayfasindaki download butonunu gorebilmelidir
        hubcomfy.downloads.isDisplayed();

        // vendor my account sayfasindaki adresses butonunu gorebilmelidir
        hubcomfy.addresses.isDisplayed();

        // vendor my account sayfasindaki account details butonunu gorebilmelidir
        hubcomfy.account.isDisplayed();

        // vendor my account sayfasindaki wishlist butonunu gorebilmelidir
        hubcomfy.wishlist.isDisplayed();

        // vendor my account sayfasindaki logout butonunu gorebilmelidir
        hubcomfy.logout.isDisplayed();


        // vendor dashboard altında, store manager butonunu gorebilmelidir
        hubcomfy.dashboardStoreManager.isDisplayed();

        // vendor dashboard altında, orders butonunu gorebilmelidir
        hubcomfy.dashboardOrders.isDisplayed();

        // vendor dashboard altında, downloads butonunu gorebilmelidir
        hubcomfy.dashboardDownloads.isDisplayed();

        // vendor dashboard altında, adresses butonunu gorebilmelidir
        hubcomfy.dashboardAddresses.isDisplayed();

        // vendor dashboard altında, account details butonunu gorebilmelidir
        hubcomfy.dashboardAccountDetails.isDisplayed();

        // vendor dashboard altında, wishlist butonunu gorebilmelidir
        hubcomfy.dashboardWishlist.isDisplayed();

        // vendor dashboard altında, appointments butonunu gorebilmelidir

        Driver.closeDriver();
    }
}