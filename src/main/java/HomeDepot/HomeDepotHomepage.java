package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotHomepage extends CommonAPI {
    public HomeDepotHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    // Web element
    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement ForThePro;
    @FindBy(xpath = "//a[contains(text(),'Dedicated Support')]")
    public WebElement RentalButton;
    @FindBy(xpath = "//a[contains(text(),'Buy Used Tools')]")
    public WebElement UsedTools;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement UsedToolsSearchBox;
    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement GoSearchUsedTools;
    @FindBy(xpath = "//span[@class='zipCode']")
    public WebElement DeliveringTo;
    @FindBy(xpath = "//input[@id='deliveryZipInput']")
    public WebElement EnterZipCode;
    @FindBy(xpath = "//button[@id='deliveryZipUpdateButton']")
    public WebElement Update;

    @FindBy(xpath = "//span[contains(text(),'10001')]")
    public WebElement newZipCode;


    @FindBy(css ="div.Header3:nth-child(3) div.grid.isBound:nth-child(1) div.grid.grid--center-verticle:nth-child(2) div.Header3collapser.col5-12.col4-12--sm.col3-12--md.col3-12--lg:nth-child(1) div.Header3group div.Header3groupItem.Header3groupItem--focus:nth-child(4) div.DeliveryZipInline.DeliveryZipInline--shown a.DeliveryZipInlinebutton:nth-child(1) div.DeliveryZipInlinebutton--block p:nth-child(2) > span.DeliveryZipInlinelabel")
    public WebElement updateZipCodeDropdown;

    @FindBy(xpath = "//input[@id='deliveryZipInput']")
    public WebElement zipCodeField;

    @FindBy(xpath = "//button[@id='deliveryZipUpdateButton']")
    public WebElement updateZipCode;

    @FindBy(css = "div.Header3:nth-child(3) div.grid.isBound:nth-child(1) div.grid.grid--center-verticle:nth-child(2) div.Header3collapser.col5-12.col4-12--sm.col3-12--md.col3-12--lg:nth-child(1) div.Header3group div.Header3groupItem.Header3groupItem--focus:nth-child(4) div.DeliveryZipInline.DeliveryZipInline--shown a.DeliveryZipInlinebutton:nth-child(1) div.DeliveryZipInlinebutton--block p:nth-child(2) span.DeliveryZipInlinelabel > span.zipCode")
    public WebElement currentZipCode;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    public WebElement searchBar;

    @FindBy(css = "body:nth-child(2) div.Header3:nth-child(3) div.grid.isBound div.grid.grid--center-verticle:nth-child(2) > div.Header3expander.col5-12.col4-12--sm.col6-12--md.col__5-12--lg:nth-child(2)")
    public WebElement searchBarBttn;

    @FindBy(xpath="//body/div[@id='header']/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement storeFinder;

    @FindBy(css = "#Newark-1190")
    public WebElement newarkLink;

    @FindBy(id = "Sugar Land-1697")
    public WebElement sugarLand;
    @FindBy(css = "div.ToolTip.ToolTip--bottom:nth-child(68) div.ToolTipwrapper.ToolTip--medium.ToolTipwrapper--bottom div.ToolTipcontent.ToolTipcontent--no-pad.ToolTipcontent--bottom div.DeliveryZipDropDownchangeZip div.grid div.col12-12.DeliveryZipDropDownform:nth-child(3) form.DeliveryZipDropDown div.DeliveryZipDropDownform--alert p:nth-child(1) > span:nth-child(1)")
    public WebElement zipCodeError;

    @FindBy(xpath = "//body/div[@id='header']/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")
    public WebElement helpLink;

    @FindBy(css = "#RowHeader_thd_0031")
    public WebElement onlineOrderSupportHeader;

    @FindBy(xpath = "//span[contains(text(),'In-Store Purchase Support')]")
    public WebElement inStorePurchaseSupportHeader;

    @FindBy(xpath = "//span[contains(text(),'Consumer & Commercial Credit Customer Service')]")
    public WebElement creditCustomerServiceHeader;

    @FindBy(linkText = "Return Policy")
    public WebElement returnPolicyLink;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public WebElement signInBttn;

    @FindBy(css = "#username")
    public WebElement usernameField;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement continueBttn;

    @FindBy(css = "body.myaccount:nth-child(2) div.grid:nth-child(1) div.col12-12 div.single-signinbody-height:nth-child(1) div.flexbox--center-center div.col12-12.col8-12--xs.u--paddingNone-top.col4-12--lg.col4-12--md.col6-12--sm:nth-child(2) div:nth-child(6) nav:nth-child(2) div.upadding--all-lg div.upadding--top-sm:nth-child(6) > button.udefault-link")
    public WebElement noThanksOption;

    @FindBy(css = "#password-input-field")
    public WebElement passwordField;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[3]/div[1]/div[6]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
    public WebElement inStockFilter;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]")
    public WebElement filterResult;

    @FindBy(xpath = "//div[contains(text(),'Sorry, there are no products available online or i')]")
    public WebElement productUnavailableMessage;





    // Methods region
    public void clickForThePro() {click(ForThePro);}
    public void clickRental() {click(RentalButton);}
    public void clickUsedTools() {click(UsedTools);}
    public void clickUsedToolsSearchBox() {
        click(UsedToolsSearchBox);
    }
    public void typeInZip(String zip) {type(UsedToolsSearchBox, zip);}

    public void clickDeliveringTo(){click(DeliveringTo);}
    public void clickEnterZipCode(){click(EnterZipCode);}
    public void typeZipCode(String zipCode) {typeAndEnter(EnterZipCode, zipCode);}
    public void updateZipCode(){click(Update);}

    public void updateZipCode(String zipCode){
        click(updateZipCodeDropdown);
        type(zipCodeField, zipCode);
        click(updateZipCode);
    }

    public void clearSearchBar(){
        clear(searchBar);
    }

    public void enterSearchBar(String items){
        typeAndEnter(searchBar, items);
    }

    public void clickInStockFilterCheckbox(){
        click(inStockFilter);
    }

    public void clickStoreFinder(){
        click(storeFinder);
    }

    public void clickNewarkLink(){
        click(newarkLink);
    }

    public void clickSugarLandLink(){
        click(sugarLand);
    }

    public void clickHelpLink(){
        click(helpLink);
    }

    public void clickReturnPolicyLink(){
        click(returnPolicyLink);
    }




}
