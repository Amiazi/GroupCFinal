package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AmericanAirlines extends CommonAPI {
    @FindBy(id = "qtab_id") public WebElement feedbackButton;
    @FindBy(css = "body > div:nth-child(16) > div:nth-child(1) > form:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(6) > label:nth-child(2)") public WebElement ratingSelection;
    @FindBy(css = "#NextButton") public WebElement feedbackSubBttn;
    @FindBy(xpath = "//a[@data-behavior='dropdown-trigger']") public WebElement LanguageDropdownBttn;
    @FindBy(xpath = "//select[@id='aa-language-selector']") public WebElement LanguageSelector;
    @FindBy(css="#aa-choose-locale") public WebElement SelectOnLanguagePage;
    @FindBy(css="main[id='main'] p:nth-child(1) a:nth-child(1)") public WebElement bagAndOptionalBttn;
    @FindBy(xpath = "//a[normalize-space()='Paying for bags online']") public WebElement payForBagsOnline;
    @FindBy(xpath = "//a[@href='/travelInformation/bag/tracker/']") public WebElement trackYourBagsSelect;
    @FindBy(xpath = "//input[@id='lastName']") public WebElement lastNameBoxTracking;
    @FindBy(xpath = "//input[@id='recordLoc']") public WebElement bagTrackingConfirmationBox;
    @FindBy(id = "bagOrderSubmit") public WebElement bagOrderSubmitBttn;
    @FindBy(xpath = "//a[@href='https://jobs.aa.com/?utm_source=CorpSite&utm_campaign=aa.comownedchannel']\n") public WebElement wereHiringBttn;
    @FindBy(xpath = "//a[@class='arrow'][normalize-space()='Search open jobs']") public WebElement searchOpenJobsBttn;
    @FindBy(xpath = "//a[@id='hdrDateButton']") public WebElement dateFilterforJobsBttn;

    //Madjid elements
    @FindBy(id = "aa-tab-flightStatus") public WebElement flightStatus;
    @FindBy(id = "originAirport") public WebElement CityInputFieldFrom;
    @FindBy(id = "destinationAirport") public WebElement AirportInputField;
    @FindBy(id = "travelDateDropdown") public WebElement DateSelected;
    @FindBy(id = "flightSchedulesSearchButton") public WebElement SearchBtn;

    @FindBy(xpath = "//a[@target='newExternalWindow']") public WebElement checkHotel;
    @FindBy(id = "ss") public WebElement destinationInput;
    @FindBy(id = "flightSchedulesSearchButton") public WebElement searchButton;

    //invalid log in
    @FindBy(id = "log-in-button") public WebElement loginBtn;
    @FindBy(id = "loginId") public WebElement inputUsername;
    @FindBy(id = "lastName") public WebElement inputLastname;
    @FindBy(id = "password") public WebElement inputPassword;
    //@FindBy(id = "button_login") public WebElement loginBtn;

    @FindBy(xpath = "//a[@class='bui-link']") public List<WebElement> listHotelLocation;

    @FindBy(id = "//a[@id='jq-flightStatus']") public WebElement ManageTrips;
    @FindBy(xpath = "//span[@class='control'][1]")public WebElement CheckIn;
    @FindBy(name = "lastName") public WebElement LastNameInputField;
    @FindBy(name = "recordLocator") public WebElement ConfirmInputField;
    @FindBy(id = "//input[@class='btn btn-fullWidth no-margin-top']") public WebElement Submit;
    @FindBy(xpath = "//div[@role='radiogroup' and @class='span4']//label") public List<WebElement> tripType;
    @FindBy(name = "destinationAirport") public WebElement destinationInput2;
    @FindBy(name= "adultOrSeniorPassengerCount") public WebElement selectPassenger;
    @FindBy(id = "log-in-button") public WebElement LoginBtn;
    @FindBy(xpath = "//input[@type='text']") public WebElement UserNameInputField;
    @FindBy(xpath = "//input[@id='lastName']") public WebElement LastNameInputFieldlogin;
    @FindBy(id = "password") public WebElement PasswordInputField;
    @FindBy(name = "_button_login") public WebElement LogginButton;
    //@FindBy(id = "log-in-button") public WebElement loginBtn;
    @FindBy(xpath = "//a[@target='newInternalWindow']") public WebElement carLink;
    @FindBy(id = "carHomeSearchForm.pickUpPlace") WebElement cityOfAirport;
    @FindBy(id = "carHomeSearchForm.pickUpDate") WebElement pickDate;
    @FindBy(id = "carHomeSearchForm.dropOffDate") WebElement dropDate;
    @FindBy(id = "searchButton") WebElement searchCarBtn;
    @FindBy(xpath = "//h2[text()='Results list']") WebElement resultCar;

    @FindBy(xpath = "//h2[normalize-space()='Something went wrong']")
    public WebElement errorHeader;


    @FindBy(css = ".origindesticity")
    public WebElement flightResults;


    //Methods

    public AmericanAirlines(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickOnFeedBackButton(){
        waitUntilVisible(feedbackButton);
        clickWithJs(feedbackButton);
    }
    public void clickOnFiveStarRating(){
         click(ratingSelection);
    }
    public void clickOnSubmitRate(){click(feedbackSubBttn);}
    public void clickOnLanguageDropdownBttn() {click(LanguageDropdownBttn);}
    public void clickOnSelectorLanguageBttn() {click(LanguageSelector);}
    public void clickOnSelectOnLanguagePage() {click(SelectOnLanguagePage);}

    public void clickOnBagsandOptionalBttn(){click(bagAndOptionalBttn);}
    public void clickOnPayforBagsOnline(){click(payForBagsOnline);}
    public void clickOnTrackyourBagsBttn(){click(trackYourBagsSelect);}
    public void enterLastNameTracking(String lastName){typeAndEnter(lastNameBoxTracking,lastName);}
    public void enterBagTrackingConfirmation(String confirmation){type(bagTrackingConfirmationBox, confirmation);}

    public void clickOnBagOrderSubmitButton(){
        clickWithJs(bagOrderSubmitBttn);}
    public void clickOnWereHiringBttn(){click(wereHiringBttn);}
    public void clickOnSearchOpenJobsLink(){
        click(searchOpenJobsBttn);
    }
    public void clickOnDateFilterforJobs(){click(dateFilterforJobsBttn);}

    // public void SelectFlightStatus(){
    //  Select select=new Select((WebElement) FlightStatus);
    // select.getOptions();


    public void InputFromAirport(String City){
        typeAndSelectFirstValue(CityInputFieldFrom,City);

    }
    public void InputToAirportDestination(String Airport){
        typeAndSelectFirstValue(AirportInputField,Airport);}
    public void clickFlightStatusTab(){
        click(flightStatus);
    }
    public void SelectDate(String Date){
        Select select= new Select(DateSelected);
        select.selectByVisibleText("Monday,April 3");}
    public void ClickSearchBar(){
        click(searchButton);
    }

    public void checkHotel() {click(checkHotel);}
    public void switchToWindow(WebDriver driver){
        handleNewTab(driver);
    }
    public void setDestinationInput(String destination){
        type(destinationInput,destination);
    }
    public void clickOnSearchButton(){
        click(SearchBtn);
    }

    public List<String> getListHotelLocation(){
        List<String> hotelLocation = new ArrayList<>();
        for(WebElement element : listHotelLocation){
            hotelLocation.add(getTextFromWebElement(element));
        }
        return hotelLocation;}


    public void clickOnLoginBtn(){click(loginBtn);
    }
    public void setInputUsername(String username){
        type(inputUsername,username);
    }
    public void setInputLastname(String lastname){
        type(inputLastname,lastname);
    }
    public void setInputPassword(String password){
        type(inputPassword,password);
    }
    public void clickOnLogin(){
        click(loginBtn);
    }
    //car link
    public void clickCar(){click(carLink);}
    public void switchToWindowCar(WebDriver driver){handleNewTab(driver);}
    public void typeCityOfAirport(String airport){type(cityOfAirport,airport);}
    public void pickUpDate(String firstDay){type(pickDate,firstDay);}
    public void dropOfDate(String lastDay){type(dropDate,lastDay);}
    public void clickSearButtonCar(){click(searchCarBtn);}
    public String getResultCare(){
        return getTextFromWebElement(resultCar);
    }

    //Madjid methods

    public void ClickManageTrips(){ManageTrips.click();}
    public void ClickManage(){CheckIn.click();}

    public void EnterLastName(String LastName){type(LastNameInputField,LastName);}
    public void EnterConfirmation(String Confirmation){type(ConfirmInputField,Confirmation);}
    public void ClickSubmit(){Submit.click();}

    public void selectTrip(String type){
        for(WebElement element : tripType){
            if(element.getText().contains(type)){
                click(element);
            }
        }
    }
    public void setDestinationInput2(String destination){
        type(destinationInput2,destination);
    }
    public void setSelectPassenger(String numberPassenger){
        Select select = new Select(selectPassenger);
        select.selectByVisibleText(numberPassenger
        );
    }

    public void ClickLoginBtn(){LoginBtn.click();}
    public void EnterUserName(String UserName){type(UserNameInputField,UserName);}
    public void EnterLastNamelogin(String LastName){type(LastNameInputFieldlogin,LastName);}
    public void EnterPassword(String Password){type(PasswordInputField,Password);}
    public void ClickLoggin(){
        LogginButton.click();}

    /*public void ClickOnLiveChat(){LiveChat.click();}
    public void EnterText(String Text){type(TextInputField,Text);}
    public void ClickSubmitchat(){Submitchat.click();}*/

    public String flightResults(){
        String flightResultCSS = ".origindesticity";
        return flightResultCSS;
    }





}

