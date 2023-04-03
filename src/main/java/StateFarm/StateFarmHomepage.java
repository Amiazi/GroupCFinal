package StateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

// page_url=https://www.statefarm.com/
public class StateFarmHomepage {
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
 }
