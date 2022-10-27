package tests.project_17.hasanali.US_016;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomersPage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TC004 {



   // ReusableMethods reusableMethots = new ReusableMethods();
    CustomersPage customersPage = new CustomersPage();

    @Test
    public void test1() throws InterruptedException {
        //reusableMethos.storManagerSayfasiDogrulama();
        customersPage.CSV.click();

        String dosyaYolu ="C:\\Users\\hasan\\Desktop";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

}