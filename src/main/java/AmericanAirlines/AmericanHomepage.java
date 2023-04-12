package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AmericanHomepage extends CommonAPI {
    @FindBy(linkText = "Contact American")
    public WebElement contactAmericanLink;

    @FindBy(css = "body.aa-tier-level-REG.aa-cntry-US:nth-child(2) div.aa-container.container:nth-child(11) div.aa-content-base section:nth-child(2) section:nth-child(3) p:nth-child(8) > a:nth-child(1)")
    public WebElement submitAClaim;

    @FindBy(linkText = "Submit a claim »")
    public WebElement submitAClaimForm;

    @FindBy(partialLinkText = "Bagga")
    public WebElement baggageLink;

    @FindBy(partialLinkText = "Delayed or damaged b")
    public WebElement delayedOrDamagedBaggageLink;

    @FindBy(xpath = "//input[@id='aa-search-field']")
    public WebElement searchBarField;

    @FindBy(className = "search-results-item")
    public List<WebElement> listAirportLocation;

    @FindBy(xpath = "//body/main[@id='main']/div[@id='aa-content-frame']/section[2]/div[1]/div[2]/div[2]/div[1]")
    public WebElement searchResult;

    public AmericanHomepage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickContactAmericanLink(){
        click(contactAmericanLink);
    }

    public void clickDelayedOrDamagedBaggageLink(){
        click(delayedOrDamagedBaggageLink);
    }

    public void clickBaggageLink(){
        scrollToView(baggageLink);
        click(baggageLink);
    }

    public void clickSubmitAClaim(){
        scrollToView(submitAClaim);
        click(submitAClaim);
        handleNewTab(getDriver());
        click(submitAClaimForm);
    }

    public void typeAndSearch(String text){
        typeAndEnter(searchBarField,text);
    }


    public void clearSearchBar(){
        clear(searchBarField);
    }

    public List<String> getListOfAirPortLocation(){
        List<String> airportLocation = new ArrayList<>();
        for(WebElement element : listAirportLocation){
            airportLocation.add(getTextFromWebElement(element));
        }
        return airportLocation;
    }

}
