package StateFarm;

import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.net.URI;
import java.net.URL;

public class AgentPage {
    private final WebDriver driver;
    private final String pageUrl = "https://www.statefarm.com/agent/";

    @FindBy(id = "total-results-indicator")
    public WebElement spanTotalResultsIndicator;

    public AgentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfUserIsCurrentlyOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.startsWith(pageUrl));
    }

    public void checkIfUserWasSentWithSearchedZipCode(String zipCode) {
        String currentUrl = driver.getCurrentUrl();
        String queryParamZipCode = currentUrl.split("=")[1];
        Assert.assertTrue(queryParamZipCode.equalsIgnoreCase(zipCode));
    }

    public void checkIfValidAgentsCountDisplayed(String agentCount) {
        String displayedAgentCount = spanTotalResultsIndicator.getText();
        Assert.assertTrue(displayedAgentCount.equalsIgnoreCase(agentCount));
    }
}
