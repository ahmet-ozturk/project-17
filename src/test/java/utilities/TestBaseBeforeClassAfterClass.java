package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestBaseBeforeClassAfterClass {

    protected static WebDriver driver;
    protected static String tarih;
    protected static Faker faker;

    // BeforeClass ve AfterClass notasyonlarini TestNG'de kullanirken
    // Junit'deki gibi static yapmaya gerek yok

    @BeforeClass (groups = "gp1")
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        faker= new Faker();
        LocalDateTime date = LocalDateTime.now(); // ekran resminin yaninda tarih bulunsun diye tarih atamasi yapiyoruz
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY_MM_dd_HH_mm_ss");
        tarih = date.format(formatter);
    }
    @AfterClass (groups = "gp1")
    public void tearDown() {

        //driver.quit();
    }
}
