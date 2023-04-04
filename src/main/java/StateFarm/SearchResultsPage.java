package StateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(css = ".search-count strong")
    private WebElement searchResultsCount;

    @FindBy(css = ".search-results-container h1")
    private WebElement searchResultsHeader;

    @FindBy(css = ".sf-logo-link img")
    private WebElement stateFarmLogo;

    // Constructor
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isSearchResultsDisplayed() {
        // Check if the search results are displayed by looking for the search results count
        return searchResultsCount.isDisplayed();
    }

    public StateFarmHomepage navigateToHomePage() {
        // Click the State Farm logo to navigate back to the homepage
        stateFarmLogo.click();

        // Return a new StateFarmHomePage
        return new StateFarmHomepage(driver);
    }
}
