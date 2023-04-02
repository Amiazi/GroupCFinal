package Statefarm;

import StateFarm.PageObjects.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmQuoteGeneration extends CommonAPI {
    private StateFarmHomepage homePage = null;

    @Test(description = "Test quote form validation, providing a wrong zip code should alert user with error text")
    @Parameters({"url", "product", "zipCode"})
    public void testQuoteFormValidation(String url, String product, String zipCode) {
        homePage = new StateFarmHomepage(driver);
        homePage.navigateToHomePage(url);
        homePage.selectProduct(product);
        homePage.enterZipCode(zipCode);
        homePage.clickStartQuoteButton();
        homePage.checkQuoteErrorAlert();
    }
}
