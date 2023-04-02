package Statefarm;

import StateFarm.PageObjects.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmQuoteGeneration extends CommonAPI {
    @Test(description = "Test quote form validation, providing a wrong zip code should alert user with error text")
    @Parameters({"url", "product", "zipCode"})
    public void testQuoteFormValidation(String url, String product, String zipCode) {
        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.navigateToHomePage(url);
        stateFarmHomepage.selectProduct(product);
        stateFarmHomepage.enterZipCode(zipCode);
        stateFarmHomepage.clickStartQuoteButton();
        stateFarmHomepage.checkQuoteErrorAlert();
    }
}
