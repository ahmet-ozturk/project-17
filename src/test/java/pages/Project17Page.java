package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Project17Page {
    public Project17Page(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//*[text()='Sign In']")
    public WebElement singin;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement singiButton;

    @FindBy (xpath = "//*[text()='Sign Out']")
    public WebElement girisYapildi;

    @FindBy (xpath = "//*[@class='icon-box-icon icon-orders']")
    public WebElement orderButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/table/tbody")
    public WebElement orderText;

    @FindBy (xpath = "//*[@class='icon-box-icon icon-downloads']")
    public WebElement downloadButton;
    @FindBy (xpath = "//*[@class='woocommerce-order-downloads']")
    public WebElement downloadtest;

    @FindBy (xpath = "//*[@class='icon-box-icon icon-addresses']")
    public WebElement adressButton;
    @FindBy (xpath = "//*[@class='woocommerce-Addresses addresses row']")
    public WebElement adresstest;

    @FindBy (xpath = "//*[@class='icon-box-icon icon-account']")
    public WebElement accountDetailsButton;

    @FindBy (xpath = "//*[@id='account_display_name']")
    public WebElement accountDetailChange;

    @FindBy (xpath = "//*[@name='account_first_name']")
    public WebElement accountFirstNameChange;

    @FindBy (xpath = "//*[@name='account_last_name']")
    public WebElement accountLastNameChange;

    @FindBy (xpath = "(//*[@class='banner-item elementor-repeater-item-561a3f7 item-inline  btn btn-solid btn-lg btn-rounded btn-primary btn-icon-right'])[2]")
    public WebElement shopNowButton;

    @FindBy (xpath = "//*[text()='Adidas Erkek Ayakkabı']")
    public WebElement urunTiklaAyakkabi;

    @FindBy (xpath = "//*[@class='btn btn-link btn-slide-right btn-infinite']")
    public WebElement dahaFazlaSirala;

    @FindBy (xpath = "//*[text()='Shoes']")
    public WebElement urunKatagoriAnasayfa;

    @FindBy (xpath = "//*[@class='orderby form-control']")
    public WebElement shortByButton;
}
