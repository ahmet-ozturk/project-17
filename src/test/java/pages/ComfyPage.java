package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ComfyPage {

    public ComfyPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameEmail;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storyManager;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement productsSekme;

    @FindBy(xpath = "//tbody//tr/td[5]")
    public List<WebElement> status;


    @FindBy(xpath = "//tbody//tr/td[7]")
    public List<WebElement> urunPrice;

    @FindBy(xpath = "//tbody//tr/td[11]")
    public List<WebElement> date;


    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtual;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadable;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement producTitle;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement images;

    @FindBy(xpath = "//*[@id='__wp-uploader-id-1']")
    public WebElement selectFiles;

    @FindBy(xpath = "//*[@id='menu-item-upload']")
    public WebElement uploadFiles;

    @FindBy(xpath = "//*[@id='menu-item-browse']")
    public WebElement mediaLibrary;

    @FindBy(xpath = "(//*[@id='menu-item-browse'])[2]")
    public WebElement mediaLibrary2;


    @FindBy(xpath = "//*[@src='https://hubcomfy.com/wp-content/uploads/2022/10/images-9-150x150.jpg']")
    public WebElement huaweiImage;

    @FindBy(xpath = "//*[@id='attachment-details-alt-text']")
    public WebElement imageAllText;


    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement kucukImage;

    @FindBy(xpath = "(//div[@class='attachment-preview js--select-attachment type-image subtype-jpeg landscape'])[19]")
    public WebElement huaweiImage2;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;

    @FindBy(xpath = "//*[@lang='en-US']")
    public WebElement sortDescriptions;

    @FindBy(xpath = "//*[@id='insert-media-button']")
    public WebElement addMediaButton1;

    @FindBy(xpath = "(//*[.='Insert into post'])[2]")
    public WebElement insertIntoPost;

    @FindBy(xpath = "//*[@data-id='description']")
    public WebElement descriptions;



    @FindBy(xpath = "(//*[@type='checkbox'])[19]")
    public WebElement computer;

    @FindBy(xpath = "//*[@type='checkbox']")
    public List<WebElement> categories;

    @FindBy(xpath = "//*[@id='product_cats_checklist']")
    public  WebElement categoriesKutu;

    @FindBy(xpath = "(//*[@value='230'])[1]")
    public WebElement electronic;

    @FindBy(xpath = "//*[@id='product_brand']")
    public WebElement brandKutu;


    @FindBy(xpath = "(//*[@value='412'])[1]")
    public WebElement brandTik;






}
