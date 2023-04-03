package StateFarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url: https://www.statefarm.com/insurance/retrievequote
public class RetrieveQuotePage extends CommonAPI {
    private WebDriver driver;
    private final String pageUrl = "https://www.statefarm.com/insurance/retrievequote";

    @FindBy(id = "continueQuoteLink")
    public WebElement linkContinueQuote;

    public RetrieveQuotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfUserIsCurrentlyOnThisPage() {
        waitFor(1);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase(pageUrl));
    }

    public void clickContinueQuoteButton() {
        linkContinueQuote.click();
    }
}
