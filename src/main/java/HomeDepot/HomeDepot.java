package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeDepot extends CommonAPI {
    //driver.findElement(By.xpath)

@FindBy(id = "headerSearch") public WebElement inputSearch;
@FindBy(id = "headerSearchButton") public WebElement searchButton;
@FindBy(xpath = "//div[@class='MyStore__store']") public WebElement locationDropDown;
@FindBy(xpath = "//span[text()='Find Other Stores']\"]") public WebElement findStoreButton;
@FindBy(xpath = "//div[@id='myStore-list']//button") public List<WebElement> listStoreButton;
@FindBy(xpath = "//div[@class='SimpleFlyout__link--bold']") public WebElement listButton;
@FindBy(xpath = "//div[@class='Mask Mask--open']") public WebElement createListButton;
@FindBy(xpath = "//input[@placeholder='List Name']") public WebElement listNameBox;
@FindBy(xpath = "//span[normalize-space()='Create']") public WebElement createListSubmit;
@FindBy(xpath = "//span[@class='bttn__content--e4t5c']") public WebElement signInOrCreateAcctBtn;
@FindBy(xpath = "//input[@class='form-input__field']") public WebElement emailAddressBttn;
@FindBy(xpath = "//span[normalize-space()='Continue']") public WebElement emailContinueBttn;
@FindBy(css = "div[class='u__padding--top-sm'] button[type='button']") public WebElement noThanksPasswrdBttn;
@FindBy(xpath = "//button[@class='options-toggle-button-container active']//img[@class='option-icon']") public WebElement signInWithPassBttn;
@FindBy(xpath = "//input[@id='password-input-field']") public WebElement enterPasswordBttn;
@FindBy(xpath = "//span[normalize-space()='Sign In']") public WebElement signInBttn;
@FindBy(xpath = "//img[@alt='Feedback Link']") public WebElement feedbackBttn;
@FindBy(css = "#QID1-1-label") public WebElement websiteFeedbackBttn;
@FindBy(xpath = "//input[@id='NextButton']") public WebElement feedbackNextbttn;
@FindBy(css = "#QID1-1-label") public WebElement excellenRatingBttn;
@FindBy(xpath = "(//input[@id='NextButton'])[1]") public WebElement sendFeedbackBttn;
@FindBy(xpath = "//input[@id='NextButton']") public WebElement sendFeedbackBttn2;
@FindBy(xpath = "//body/div[@id='header']/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]") public WebElement ForThePro;
@FindBy(xpath = "//a[contains(text(),'Dedicated Support')]") public WebElement RentalButton;
@FindBy(xpath = "//a[contains(text(),'Buy Used Tools')]") public WebElement UsedTools;
@FindBy(xpath = "//input[@id='search']") public WebElement UsedToolsSearchBox;
@FindBy(xpath = "//i[@class='icon-search']") public WebElement GoSearchUsedTools;

//Sabrina Web elements
@FindBy(xpath = "//a[@id='headerMyAccount']") public WebElement HDMyAccountButton;
@FindBy(css = "a[title='Sign in to your account'] span[class='bttn__content']") public WebElement HDSignInButton;
@FindBy(xpath = "//input[@id='username']") public WebElement HDEmailAddress;
@FindBy(xpath = "//span[text()='Continue']") public WebElement HDButtonSubmit;
@FindBy(xpath = "//button[text()='No Thanks']") public WebElement HDSecurityButton;@FindBy(id="password-input-field") public WebElement HDPassword;


    //Getting all the WebElemnts Ready for search a product in home depot


    @FindBy(xpath = "//input[@id='headerSearch']") public WebElement HDInputSearch;
    @FindBy(id="headerSearchButton") public WebElement HDSearchButton;
    @FindBy(className = "results-header__keyword") public WebElement ProductResult;
    //Getting all the WebElements Ready for change address
    @FindBy(xpath = "//div[@class='MyStore__store']") public WebElement HDLocationDropDown;
    @FindBy(xpath = "//div[@class='MyStore__store']") public WebElement HDFindStoreButton;
    @FindBy(xpath = "//div[@id=myStore-list]//button") public WebElement HDSelectMyStore;
    //webElement filter product
    @FindBy(xpath = "//h2[text()='Get It Fast']") public WebElement dropDownFilter;
    @FindBy(xpath="//h3[text()='In Stock at Store Today']") public WebElement inStock;

    @FindBy(xpath = "//span[@class='MyCart__label']") public WebElement CartBtn;
    @FindBy(xpath = "//*[@id=\"cart_sponsored\"]/div/div[2]/div[1]/div[1]/div[3]/div/div/div[5]/a/span") public WebElement ItemAdded;

    @FindBy(xpath = "//img[@alt='Live Chat']") public WebElement LiveChat;
    @FindBy(xpath = "//textarea[@placeholder='Type your message']") public WebElement TextInputField;
    @FindBy(id = "//body/div[23]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[5]/span[1]/img[1]") public WebElement Submit;






    //Methods
    public HomeDepot(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //method region
    public void doSearch(String searchTerm){type(inputSearch,searchTerm);}
    public void clickOnSearchButton(){click(searchButton);}
    public void clickOnLocationDropDown(){
        click(locationDropDown);
    }
    public void clickOnFindStoreButton(){
        click(findStoreButton);
    }
    public void clickOnSelectStore(int index){
       click(listStoreButton.get(index));
    }
    /*public String getMyStoreName(){
        return getTextFromWebElement(locationDropDown);
    }*/
    public void clickOnListBttn() {click(listButton); }
    public void clickOnCreateList() {click(createListButton);}
    public void clickOnListNameBox(String list) {type(listNameBox, list);}
    public void clickOnSubmitList(){click(createListSubmit);}
    public void clickOnSigninOrCreateBttn(){click(signInOrCreateAcctBtn);}
    public void clickOnEmailAddressBox(String email){type(emailAddressBttn,email);}
    public void clickOnContinueEmailBttn(){click(emailContinueBttn);}
    public void clickOnNoThanksPasswordBttn(){click(noThanksPasswrdBttn);}
    public void clickonSigninWithPassBttn(){click(signInWithPassBttn);}
    public void clickOnEnterPasswordBttn(String password){type(enterPasswordBttn, password);}
    public void clickOnSigninBttn(){click(signInBttn);}
    public void clickOnFeedbackBttn(){click(feedbackBttn);}

   // public void clickOnFeedbackType(String feedbacktype){
        //Select select=new Select(websiteFeedbackBttn);
        //select.selectByVisibleText(feedbacktype);}
    public void clickOnFeedbackType(){click(websiteFeedbackBttn);}

    public void clickOnFeedbackNextBttn(){click(feedbackNextbttn);}
    public void clickOnExcellentBttn(){click(excellenRatingBttn);}
    public void clickOnSendFeedbackBttn(){click(sendFeedbackBttn);}
    public void clickOnSendFeedbackBttn2(){click(sendFeedbackBttn2);}
    public void clickForThePro() {click(ForThePro);}
    public void clickRental() {click(RentalButton);}
    public void clickUsedTools() {click(UsedTools);}
    public void clickUsedToolsSearchBox() {click(UsedToolsSearchBox);}
    public void typeInZip(String zip) {type(UsedToolsSearchBox, zip);}

    //Sabrina Methods
    public void clickOnMyAccountHD(){
        click(HDMyAccountButton);}
    public void clickSignInButtonHD(){
        click(HDSignInButton);}
    public void InputEmailAddressHD(String email){
        HDEmailAddress.sendKeys(email);}
    public void clickSubmitButtonHD(){
        click(HDButtonSubmit);}
    public void clickSecurityButtonHD(){
        click(HDSecurityButton);}
    public void InputPasswordHD(String password){HDPassword.sendKeys(password);}


    //Steps to change address
    public void clickLocationDropDown(){click(HDLocationDropDown);}
    public void clickFindStoreButton(){click(HDFindStoreButton);}
    public void selectMyStore(String index){type(HDSelectMyStore, index);}
    public String getMyStoreName(){
        return getTextFromWebElement(HDLocationDropDown);
    }
    //filter product
    public void clickDropDownFilter(){
        click(dropDownFilter);
    }
    public void clickInStockFilter(String filter1){
        click(inStock);
    }

    public void ClickCartBtn(){CartBtn.click();}

    public void ClickAddToCart(){ItemAdded.click();}

    public void ClickOnLiveChat(){LiveChat.click();}
    public void EnterText(String Text){type(TextInputField,Text);}
    public void ClickSubmit(){Submit.click();}





}





