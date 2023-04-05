package StateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomerCarePage {
    private WebDriver driver;
    public CustomerCarePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
