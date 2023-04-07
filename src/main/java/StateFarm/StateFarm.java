package StateFarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StateFarm extends CommonAPI {

    @FindBy(id="popDropdown") public WebElement productDropdown;
    @FindBy(css="#quote-main-zip-code-input") public WebElement inputZipCode;
    @FindBy(id = "quote-main-zip-btn") public WebElement startQuoteButton;
    @FindBy(xpath = "//span[text()='Help']") public WebElement SFHelpButton;

    @FindBy(css = "button[data-for='insurance'] span") public WebElement InsuranceBttn;
    @FindBy(css = "//a[@id='oneX-3-insurance']") public WebElement LifeBttn;
    @FindBy(xpath = "//select[@id='quote-main-state-select']") public WebElement StateDropDwn;
    @FindBy(xpath = "//button[@data-name='state']") public WebElement GoForQuoteBttn;
    @FindBy(xpath = "//a[@href='/claims/check-existing-claim']") public WebElement TrackClaim;
    @FindBy(xpath = "//span[contains(text(),'Chat')]") public WebElement Chat;
    @FindBy(xpath = "//img[@src='/image/close.svg']") public WebElement CancelBttn;
    @FindBy(xpath = "div[id='herculesChatElDiv'] span:nth-child(1)") public WebElement YesBttn;
    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[8]/div/button/span") public WebElement FindAnAgent;
    @FindBy(xpath = "//input[@id='oneX-findAnAgentZipCode']") public WebElement ZipCodInputField;
    @FindBy(xpath = "//button[@id='findAnAgentButton']") public WebElement FindAnAgentSearch;

    @FindBy(xpath ="//button[@class='-oneX-header-top-menu-btn']") public WebElement logInBtn;
    @FindBy(id="oneX-username") public WebElement userIdField;
    @FindBy (id="util-login-password") WebElement passwordField;
    @FindBy(xpath = "//button[text()='Log in']") WebElement logInButton;
    @FindBy(id = "troubleLoggingIn") WebElement troubleLogIn;
    @FindBy(xpath = "//span[contains(text(),'Pay a Bill')]") public WebElement PayBill;
    @FindBy(id = "pay-a-bill-paymentSelect") public WebElement PayUsing;
    @FindBy(id = "pay-a-bill-phoneNo") public WebElement PhoneNumberInputField;
    @FindBy(id = "pay-a-bill-DOB") public WebElement DOBInputField;
    @FindBy(id = "pay-a-bill-submitButton") public WebElement SubmitBtn;
    @FindBy(xpath = "//span[contains(text(),'Search')]") public WebElement SearchBtn;
    @FindBy(id = "util-sf-search") public WebElement SearchInputField;
    @FindBy(xpath = "//button[contains(text(),'Search')]") public WebElement Submit;
    @FindBy(xpath = "//a[contains(text(),'Track a claim')]") public WebElement TrackClaimButton;
    @FindBy(xpath = "//a[contains(text(),'Continue')]") public WebElement ContinueButton;
    @FindBy(xpath = "") public WebElement FileClaimButton;





    public StateFarm(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectProduct(String product) {
        Select select = new Select(productDropdown);
        select.selectByVisibleText(product);
    }
    public void setInputZipCode(String zipCode){
        type(inputZipCode,zipCode);
    }
    public void clickOnStartQuoteButton(){
        clickWithJs(startQuoteButton);
    }
    //public void clickOnHelpButton(){
        //click(SFHelpButton);
   // }
    public void clickInsuranceOp() {click(InsuranceBttn);}
    public void clickLifeBttn() {clickLifeBttn();}
    public void SelectState(String State) {selectFromDropdown(StateDropDwn, State);}
    public void clickGoForLifeInsurance() {clickGoForLifeInsurance();}
    public void clickTrackAClaim() {click(TrackClaim);}
    public void clickStartChat(){click(Chat);}
    public void clickCancel(){click(CancelBttn);}
    public void clickYes(){click(YesBttn);}
    public void clickOnHelpButton(){click(SFHelpButton);}
    public void clickFindAgent () {click(FindAnAgent);}
    public void EnterZipCode (String ZipCode){type(ZipCodInputField, ZipCode);}
    public void clickFindAnAgentSearch () {click(FindAnAgentSearch);}

        public void clickLogInButton(){
            click(logInBtn);
        }
        public void cliickUserId(String user){
            type(userIdField,user);
        }
        public void clickPassword(String password){
            type(passwordField,password);
        }
        public void clickLogInBtn(){
            click(logInButton);
        }
        public String troubleLogIn(){
            return getTextFromWebElement(troubleLogIn);
        }
    public void ClickPayBill(){PayBill.click();}
    public void SelectUsingPay(String PhoneNumber){
        Select select=new Select(PayUsing);
        select.selectByVisibleText(PhoneNumber);}
    public void EnterPhoneNumber(String PhoneNumber){type(PhoneNumberInputField,PhoneNumber); }
    public void EnterDOB(String DOB){type(DOBInputField,DOB);}
    public void ClickSubmitBtn(){SubmitBtn.click();}

    public void ClickOnSearchBtn(){SearchBtn.click();}
    public void EnterOnSearchBar(String Search){type(SearchInputField,Search);}
    public void ClickSubmit(){Submit.click();}
    public void ClickTrackBtn(){TrackClaimButton.click();}
    public void ClickContinueBtn(){ContinueButton.click();}
    public void ClickFileClaimBtn(){FileClaimButton.click();}}











