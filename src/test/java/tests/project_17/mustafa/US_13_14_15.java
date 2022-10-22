package tests.project_17.mustafa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.US_13_14_15Pages;
import utilities.Driver;

public class US_13_14_15 {


    US_13_14_15Pages us = new US_13_14_15Pages();
    Actions act = new Actions(Driver.getDriver());


    @Test
    public void US13() throws InterruptedException {

        Driver.getDriver().get("https://hubcomfy.com/");
        us.ilk_sing_in_button.click();
        us.email_box.sendKeys("ahmetozturk.qa@gmail.com");
        us.sifre_box.sendKeys("Ahmet123.,");
        us.ikinci_sing_in_button.click();
        Thread.sleep(3000);
        us.ilk_sing_out_button.click();
        us.stor_manager_button.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", us.cponus_button);
        jse.executeScript("arguments[0].click();",us.cponus_button);
        // us.cponus_button.click();
        us.add_new_button.click();
        act.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();
        us.code_box.sendKeys("529440");
        us.description_box.sendKeys("proje 17 1 . kupon");
        Select st = new Select(us.discount_Type_drop_down);
        st.selectByVisibleText("Percentage discount");
        us.coupon_amount_box.sendKeys("15");
        Thread.sleep(1000);
        us.expiry_date_box.click();
        Thread.sleep(1000);
        us.gecerli_tarih.click();
        us.free_shipping_chekbox.click();
        Thread.sleep(1000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        us.show_on_store_chekbox.click();


    }


    @Test(dependsOnMethods = "US13")
    public void US14() {
        us.min_spend_box.sendKeys("1");
        us.max_spend_box.sendKeys("50");
        us.individual_use_only_chekbox.click();
        us.exclude_sale_items_chekbox.click();
        us.exclude_categories_dropdown.sendKeys("pantalon");


    }

    @Test(dependsOnMethods = "US14")

    public void US15() {

        us.limit_ekleme_bolumu.click();
        us.usage_limit_per_coupon_box.sendKeys("1");
        us.limit_usage_to_x_items_box.sendKeys("50");
        us.usage_limit_per_user_box.sendKeys("5");
        us.kupon_kaydetme_buttonu.click();


    }


}
