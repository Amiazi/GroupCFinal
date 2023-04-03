package StateFarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url: https://apps.statefarm.com/retrieve-saved-quotes/
public class RetrieveSavedQuotesPage extends CommonAPI {
    private WebDriver driver;
    private final String pageUrl = "https://apps.statefarm.com/retrieve-saved-quotes/";

    @FindBy(id = "firstNameTextField-input")
    public WebElement inputFirstNameTextField;

    @FindBy(id = "lastNameTextField-input")
    public WebElement inputLastNameTextField;

    @FindBy(id = "birthdateTextField-input")
    public WebElement inputDate;

    @FindBy(id = "emailTextField-input")
    public WebElement inputEmailTextField;

    @FindBy(css = "div[id='getSavedQuoteScreen-primary-button'] button[class*='-oneX-btn-large']")
    public WebElement buttonFindQuotes;

    @FindBy(css = "section[class='-oneX-notification__text']")
    public WebElement sectionCouldNotFindMatchWith;

    public RetrieveSavedQuotesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkIfUserIsOnThisPage() {
        waitFor(1);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase(pageUrl));
    }

    public void enterFirstName(String firstName) {
        inputFirstNameTextField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        inputLastNameTextField.sendKeys(lastName);
    }

    public void enterDateOfBirth(String dob) {
        inputDate.sendKeys(dob);
    }

    public void enterEmailAddress(String email) {
        inputEmailTextField.sendKeys(email);
    }

    public void clickFindQuoteButton() {
        scrollToViewWithDriver(buttonFindQuotes, driver);
        buttonFindQuotes.click();
    }

    public void checkIfErrorNotificationIsDisplayed() {
        Assert.assertTrue(sectionCouldNotFindMatchWith.isDisplayed());
    }
}
