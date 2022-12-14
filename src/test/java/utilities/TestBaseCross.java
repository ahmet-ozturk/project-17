package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestBaseCross {

    protected static WebDriver driver;
    protected static String tarih;
    protected static Faker faker;

    @Parameters ("browser")

    @BeforeClass

    public void setUp(@Optional String browser) {

        driver = CrossDriver.getDriver(browser);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        faker= new Faker();

        LocalDateTime date = LocalDateTime.now(); // ekran resminin yaninda tarih bulunsun diye tarih atamasi yapiyoruz

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");

        tarih = date.format(formatter);
    }
    @AfterClass

    public void tearDown() {

        CrossDriver.quitDriver();
    }
}
