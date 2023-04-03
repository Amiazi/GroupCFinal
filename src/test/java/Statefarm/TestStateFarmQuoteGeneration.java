package Statefarm;

import StateFarm.RetrieveQuotePage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.ExcelReader;

import java.util.List;

public class TestStateFarmQuoteGeneration extends CommonAPI {
    @Test(description = "Test quote form validation, providing a wrong zip code should alert user with error text")
//    @Parameters({"url", "product", "zipCode"})
//    public void testQuoteFormValidation(String url, String product, String zipCode) {
    public void testQuoteFormValidation() {
        ExcelReader excelReader = new ExcelReader("src/test/resources/StateFarmTestData.xlsx");
        String url = excelReader.getDataFromCell("QuoteFormValidationData", 1, 0);
        String product = excelReader.getDataFromCell("QuoteFormValidationData", 1, 1);
        String zipCode = excelReader.getDataFromCell("QuoteFormValidationData", 1, 2);

        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.navigateToHomePage(url);
        stateFarmHomepage.selectProduct(product);
        stateFarmHomepage.enterZipCode(zipCode);
        stateFarmHomepage.clickStartQuoteButton();
        stateFarmHomepage.checkQuoteErrorAlert();
    }

    @Test(description = "Test retrieve saved quote validation, submitting not saved email should alert user with error text")
    @Parameters({"url"})
    public void testRetrieveSavedQuotesValidation(String url) {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.navigateToHomePage(url);
        homepage.clickContinueSavedQuoteLink();

        RetrieveQuotePage retrieveQuotePage = new RetrieveQuotePage(getDriver());
        retrieveQuotePage.checkIfUserIsCurrentlyOnThisPage();
        retrieveQuotePage.clickContinueQuoteButton();
    }
}
