package StateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url: https://www.statefarm.com/simple-insights/calculators
public class CalculatorsPage {
    private WebDriver driver;
    private String pageUrl = "https://www.statefarm.com/simple-insights/calculators";
    public CalculatorsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkIfUserIsCurrentlyOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase(pageUrl));
    }
}
