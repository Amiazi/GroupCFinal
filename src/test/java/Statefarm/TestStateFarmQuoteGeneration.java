package Statefarm;

import StateFarm.RetrieveQuotePage;
import StateFarm.RetrieveSavedQuotesPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
import utility.ExcelDataProvider;
import utility.ExcelReader;

public class TestStateFarmQuoteGeneration extends CommonAPI {
    @Test(description = "Test quote form validation, providing a wrong zip code should alert user with error text")
    public void testQuoteFormValidation() {
        ExcelReader excelReader = new ExcelReader("src/test/resources/StateFarmTestData.xlsx");
        String url = excelReader.getDataFromCell("QuoteFormData", 1, 0);
        String product = excelReader.getDataFromCell("QuoteFormData", 1, 1);
        String zipCode = excelReader.getDataFromCell("QuoteFormData", 1, 2);

        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.navigateToHomePage(url);
        stateFarmHomepage.selectProduct(product);
        stateFarmHomepage.enterZipCode(zipCode);
        stateFarmHomepage.clickStartQuoteButton();
        stateFarmHomepage.checkQuoteErrorAlert();
    }

    @Test(description = "Test retrieve saved quote validation, submitting not saved email should alert user with error text")
    public void testRetrieveSavedQuotesValidation() {
        ExcelDataProvider dataProvider = ExcelDataProvider.getInstance();
        dataProvider.loadFile("src/test/resources/StateFarmTestData.xlsx", "SavedQuoteData");

        String url = dataProvider.getDataFromCell(1, 0);
        String firstName = dataProvider.getDataFromCell(1, 1);
        String lastName = dataProvider.getDataFromCell(1, 2);
        String dateOfBirth = dataProvider.getDataFromCell(1, 3);
        String emailAddress = dataProvider.getDataFromCell(1, 4);

        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.navigateToHomePage(url);
        RetrieveQuotePage retrieveQuotePage = homepage.clickContinueSavedQuoteLink();

        retrieveQuotePage.checkIfUserIsCurrentlyOnThisPage();
        RetrieveSavedQuotesPage savedQuotesPage = retrieveQuotePage.clickContinueQuoteButton();

        savedQuotesPage.checkIfUserIsOnThisPage();
        savedQuotesPage.enterFirstName(firstName);
        savedQuotesPage.enterLastName(lastName);
        savedQuotesPage.enterDateOfBirth(dateOfBirth);
        savedQuotesPage.enterEmailAddress(emailAddress);
        savedQuotesPage.clickFindQuoteButton();
        savedQuotesPage.checkIfErrorNotificationIsDisplayed();
    }
}
