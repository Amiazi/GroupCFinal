package StateFarm;

import base.CommonAPI;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// page_url=https://www.statefarm.com/
public class StateFarmHomepage extends CommonAPI {
    private WebDriver driver = null;

    @FindBy(id = "quote-main-zip-code-input")
    public WebElement inputZip;

    @FindBy(css = "select[id='popDropdown']")
    public WebElement selectProductDropdown;

    @FindBy(css = ".quoteSelect > select > option")
    public List<WebElement> optionZip;

    @FindBy(css = "button[id='quote-main-zip-btn']")
    public WebElement buttonZipCode;

    @FindBy(id = "quote-error-alert")
    public WebElement divQuoteErrorAlert;

    @FindBy(css = "a[class$='link-override--block']")
    public WebElement linkContinueSavedQuote;

    @FindBy(css = "button[data-for='findanagent'] span")
    public WebElement spanFindAgent;

    @FindBy(id = "oneX-findAnAgentZipCode")
    public WebElement inputZipInFindAgent;

    @FindBy(id = "findAnAgentButton")
    public WebElement buttonFindAgent;

    @FindBy(css = "a[class='-oneX-lang-icon -oneX-header-util-menu-btn -oneX-util-menu-icon-container']")
    public WebElement linkEspa;

    @FindBy(css = "p[class^='-oneX-heading--h1']")
    public WebElement pCreateAffordablePriceJust;

    @FindBy(css = "div[class*='si-sliders'] div[class='slick-list']")
    public WebElement carouselSlider;

    @FindBy(css = "span[class='-oneX-d-block si-slider-button -w_arrow-right']")
    public WebElement spanSliderNextButton;

    @FindBy(tagName = "a")
    public List<WebElement> links;

    @FindBy(linkText = "Contact Us")
    private WebElement contactUsLink;

    @FindBy(id = "util-sf-search")
    private WebElement searchInput;

    @FindBy(css = "button[class^='-oneX-util-search-button']")
    private WebElement searchButton;

    @FindBy(css = "img[id='oneX-sf-logo']")
    private WebElement logo;

    @FindBy(css = "button[data-for='search']")
    public WebElement buttonSearch;

    @FindBy(xpath = "//a[.//div[contains(@class, '-oneX-util-menu-icon-help')]]")
    public WebElement linkHelp;

    public StateFarmHomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void navigateToHomePage(String url) {
        driver.get(url);
    }
    public void selectProduct(String productName) {
        Select dropProduct = new Select(selectProductDropdown);
        dropProduct.selectByValue(productName);
    }
    public void enterZipCode(String zipCode) {
        inputZip.sendKeys(zipCode);
    }
    public void clickStartQuoteButton() {
        buttonZipCode.click();
    }
    public void checkQuoteErrorAlert() {
        Assert.assertTrue(divQuoteErrorAlert.isDisplayed());
    }
    public RetrieveQuotePage clickContinueSavedQuoteLink() {
        linkContinueSavedQuote.click();
        return new RetrieveQuotePage(driver);
    }
    public void clickFindAgentNavItem() {
        spanFindAgent.click();
    }
    public void enterZipCodeOnFindAgentSection(String zipCode) {
        inputZipInFindAgent.sendKeys(zipCode);
    }
    public AgentPage clickFindAnAgentButton() {
        buttonFindAgent.click();
        waitFor(2);
        return new AgentPage(driver);
    }
    public void clickEspanonLink() {
        linkEspa.click();
    }
    public void checkIfLanguageChangedToSpanish(String expectedHeading) {
        String displayedHeading = pCreateAffordablePriceJust.getText();
        Assert.assertTrue(displayedHeading.equalsIgnoreCase(expectedHeading));
    }
    public void scrollToCarouselView() {
        scrollToViewWithDriver(carouselSlider, driver);
    }
    public CalculatorsPage clickCalculatorCarouselCard() {
        List<WebElement> allCarouselCardLinks = carouselSlider.findElements(By.cssSelector(".card-info"));

        while(!calculatorCarouselCardDisplayed(allCarouselCardLinks)) {
            clickNextCarouselButton();
            waitFor(2);
        }
        WebElement calculatorCard = allCarouselCardLinks
            .stream()
            .filter(webElement -> webElement.getText().contains("Calculators to help you reach your goals"))
            .toList()
            .get(0);
        calculatorCard.click();
        waitFor(5);
        return new CalculatorsPage(driver);
    }
    public void clickNextCarouselButton() {
        spanSliderNextButton.click();
    }
    public boolean calculatorCarouselCardDisplayed(List<WebElement> allCarouselCardLinks) {
        List<WebElement> calculatorCard = allCarouselCardLinks
            .stream()
            .filter(webElement -> webElement.getText().contains("Calculators to help you reach your goals"))
            .toList();
        return calculatorCard.size() != 0;
    }
    public void checkForBrokenLinks() {
        links = links.subList(0, 1);
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href != null && !href.isEmpty()) {
                try {
                    URL url = new URL(href);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();
                    int statusCode = connection.getResponseCode();
                    Assert.assertTrue(statusCode < 400, "Broken link found: " + href);
                } catch (Exception e) {
                    System.out.println("ERROR: Failed to check link " + href + " with exception " + e.getMessage());
                }
            }
        }
    }
    public ContactUsPage clickContactUsLink() {
        scrollToViewWithDriver(contactUsLink, driver);
        contactUsLink.click();
        return new ContactUsPage(driver);
    }
    public void clickSearchButton() {
        buttonSearch.click();
    }
    public SearchResultsPage search(String searchTerm) {
        searchInput.sendKeys(searchTerm);
        searchButton.click();
        return new SearchResultsPage(driver);
    }
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
    public CustomerCarePage clickHelpButton() {
        linkHelp.click();
        waitFor(5);
        switchToNextTab(driver);
        return new CustomerCarePage(driver);
    }
 }
