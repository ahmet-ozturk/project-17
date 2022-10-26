package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjePage {
    public ProjePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath ="//a[text()='My Account']")
    public WebElement myaccount;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement product;

    @FindBy(xpath = "(//*[@class='text'])[18]")
    public WebElement addNew;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement simpleProduct;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement title;

    @FindBy(xpath = "(//*[@class='wcfm_product_title'])[3]")
    public WebElement kampSandalyesiButonu;

    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stockQuantity;

    @FindBy(xpath = "//*[text()='Shipping']")
    public WebElement shiiping;

    @FindBy(xpath = "//input[@id='length']")
    public WebElement dimensionsLength;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributes;

    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement attributesColor;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[9]")
    public WebElement toptanUrun;

    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement toptanUrunPiecetype;

    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;

    @FindBy (xpath = "//*[contains(text(), 'Product Successfully Published.')]")
    public WebElement popUpMessage;

    // @FindBy(xpath = "//select[@id='backorders']")
    //public WebElement backorders;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement piecetype;

    @FindBy(xpath = "//input[@id='unitpercart']")
    public WebElement unitpercart;

    @FindBy(xpath = "//input[@id='minorderqtytr']")
    public WebElement minorderqtytr;

    @FindBy(xpath = "//*[@id='weight']")
    public WebElement weight;

    @FindBy(xpath = "//*[@id='length']")
    public WebElement length;

    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement backorders;

    @FindBy(xpath = "//*[@id='width']")
    public WebElement width;

    @FindBy(xpath = "//*[@id='height']")
    public WebElement height;

    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;

    @FindBy(xpath = "//*[text()='Allow Backorders?']")
    public WebElement allowBackorders;


    @FindBy(xpath = "//*[text()='Do not Allow']")
    public WebElement doNotAllow;

    @FindBy(xpath = "//*[text()='Allow, but notify customer']")
    public WebElement allowButNotifyCustomer;

    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement allow;



}
