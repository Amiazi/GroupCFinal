package StateFarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmHomepage extends CommonAPI {

    public StateFarmHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//span[text()='Help']")
        public WebElement SFHelpButton;
        @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[8]/div/button/span")
        public WebElement FindAnAgent;
        @FindBy(xpath = "//input[@id='oneX-findAnAgentZipCode']")
        public WebElement ZipCodInputField;
        @FindBy(xpath = "//button[@id='findAnAgentButton']")
        public WebElement FindAnAgentSearch;

        @FindBy(css = "button[data-for='insurance'] span")
        public WebElement InsuranceBttn;
        @FindBy(xpath = "//a[@id='oneX-3-insurance']")
        public WebElement LifeBttn;
        @FindBy(xpath = "//select[@id='quote-main-state-select']")
        public WebElement StateDropDwn;
        @FindBy(xpath = "//button[@data-name='state']")
        public WebElement GoForQuoteBttn;

        @FindBy(xpath = "//span[contains(text(),'Search')]")
        public WebElement HomepageSearch;
        @FindBy(xpath = "//input[@id='util-sf-search']")
        public WebElement SearchBox;

        @FindBy(linkText = "Track a claim")
        public WebElement TrackClaim;
        @FindBy(xpath = "//span[contains(text(),'Chat')]")
        public WebElement Chat;
        @FindBy(xpath = "//img[@src='/image/close.svg']")
        public WebElement CancelBttn;
        @FindBy(xpath = "div[id='herculesChatElDiv'] span:nth-child(1)")
        public WebElement YesBttn;


        @FindBy(xpath = "//button[@data-for='banking']")
        public WebElement BankingBttn;
        @FindBy(xpath = "//section[@id='oneX-submenu-banking']//a[contains(@class,'-oneX-link--block menuLevel2')][normalize-space()='Payment Solutions']")
        public WebElement PaymentSolutions;
        @FindBy(linkText = "Find a solution with U.S. Bank")
        public WebElement FindSolution;
        @FindBy(xpath = "/html[1]/body[1]/div[5]/div[5]/a[1]/button[1]")
        public WebElement ContinueAsGuest;


    @FindBy(xpath = "//select[@id='getaquote-select-product']")
    public WebElement productDropDown;

    @FindBy(xpath = "//select[@id='getaquote-state-select']")
    public WebElement stateDropDown;

    @FindBy(xpath = "//input[@id='getaquote-zip']")
    public WebElement zipCodeField;

    @FindBy(css = "#getaQuoteButton")
    public WebElement getAQuoteBttn;

    @FindBy(css = "body.page.basicpage.-oneX.-oneX-resize-bound:nth-child(2) div.root.aem-element-spacing.container-custom.responsiveGrid:nth-child(5) div.cmp-container div.aem-Grid.aem-Grid--12.aem-Grid--default--12 div.experiencefragment.aem-GridColumn.aem-GridColumn--default--12:nth-child(2) div.cmp-experiencefragment.cmp-experiencefragment--header div.cmp-container div.root.container-custom.responsiveGrid:nth-child(1) div.cmp-container div.headerfooterapi header.-oneX.noindex:nth-child(6) nav.-oneX-header.-oneX-container-fluid section.-oneX-header-nav-apps-container div.-oneX-header-nav-container:nth-child(1) div.-oneX-header-main-nav ul.-oneX-header-main-nav-menu li.-oneX-header-main-nav-list:nth-child(5) div.-oneX-header-top-menu-btn-hitbox button.-oneX-header-top-menu-btn > span:nth-child(1)")
    public WebElement getAQuoteTab;




    /* @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement search;*/
        public void clickOnHelpButton () {
            click(SFHelpButton);
        }
        public void clickFindAgent () {
            click(FindAnAgent);
        }
        public void EnterZipCode (String ZipCode){
            type(ZipCodInputField, ZipCode);
        }
        public void clickFindAnAgentSearch () {
            click(FindAnAgentSearch);
        }
        public void clickInsuranceOp () {
            click(InsuranceBttn);
        }
        public void clickLifeBttn () {click(LifeBttn);}
        public void SelectState (String State){
            selectFromDropdown(StateDropDwn, State);
        }
        public void clickGoForLifeInsurance () {click(GoForQuoteBttn);}
        public void clickTrackClaim () {click(TrackClaim);}
        public void clickStartChat () {click(Chat);}
        public void clickCancel () {click(CancelBttn);}
        public void clickYes () {click(YesBttn);}
        public void clickBanking(){click(BankingBttn);}
        public void clickPaymentSolutions(){click(PaymentSolutions);}
        public void clickFindSolutions() {
            scrollToView(FindSolution);
            click(FindSolution);}
        public void clickContinueAsGuest(){click(ContinueAsGuest);}

    public void selectProductDropDown(String option){
        selectFromDropdown(productDropDown, option);
    }

    public void selectStateDropDown(String option){
        selectFromDropdown(stateDropDown, option);
    }

    public void enterZipCode(String zipCode){
        type(zipCodeField, zipCode);
    }

    public void clickStartAQuoteBttn(){
        click(getAQuoteBttn);
    }

    public void clickGetAQuoteTab() {
        click(getAQuoteTab);
    }


    }

