package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HubcomfyPage {

    public HubcomfyPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeVendor;

    @FindBy(xpath = "(//*[text()='Email'])[1]")
    public WebElement eMailDisplay;

    @FindBy(xpath = "(//*[text()='Password'])[1]")
    public WebElement passwordDisplay;

    @FindBy(xpath = "(//*[text()='Confirm Password'])[1]")
    public WebElement confirmEmailDisplay;

    @FindBy(xpath = "//*[@id=\"user_email\"]")
    public WebElement eMail;

    @FindBy(xpath = "//*[@id=\"passoword\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"confirm_pwd\"]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInAnasayfa;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@name=\"login\"]")
    public WebElement signInButton;

    @FindBy (xpath = "id=\"password\"")
    public WebElement signinpassword;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountDisplay;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-orders\"]")
    public WebElement orders;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-downloads\"]")
    public WebElement downloads;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-addresses\"]")
    public WebElement addresses;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-account\"]")
    public WebElement account;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-wishlist\"]")
    public WebElement wishlist;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-logout\"]")
    public WebElement logout;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement dashboardStoreManager;

    @FindBy(xpath = "//*[text()='Orders']")
    public WebElement dashboardOrders;

    @FindBy(xpath = "//*[text()='Downloads']")
    public WebElement dashboardDownloads;

    @FindBy(xpath = "//*[text()='Addresses']")
    public WebElement dashboardAddresses;

    @FindBy(xpath = "//*[text()='Account details']")
    public WebElement dashboardAccountDetails;

    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement dashboardWishlist;

    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement dashboardSupportTickets;

    @FindBy(xpath = "//*[text()='Followings']")
    public WebElement dashboardFollowings;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement dashboardLogout;

    @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement registerButton;



}
