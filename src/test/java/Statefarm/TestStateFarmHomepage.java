package Statefarm;

import StateFarm.ContactUsPage;
import StateFarm.CustomerCarePage;
import StateFarm.SearchResultsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmHomepage extends CommonAPI {
    @Test
    @Parameters({"expectedHeading"})
    public void testChangeLanguageToSpanish(String expectedHeading) {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.clickEspanonLink();
        homepage.checkIfLanguageChangedToSpanish(expectedHeading);
    }
    @Test
    public void testBrokenLinks() {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.checkForBrokenLinks();
    }
    @Test
    @Parameters({"expectedConsumerPhone", "expectedBusinessPhone"})
    public void testContactUs(String expectedConsumerPhone, String expectedBusinessPhone) {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        ContactUsPage contactUsPage = stateFarmHomePage.clickContactUsLink();

        String consumerPhone = contactUsPage.getCreditCardInquiriesUSBankConsumerPhoneNumber();
        String businessPhone = contactUsPage.getCreditCardInquiriesUSBankBusinessPhoneNumber();

        Assert.assertEquals(consumerPhone, expectedConsumerPhone);
        Assert.assertEquals(businessPhone, expectedBusinessPhone);
    }
    @Test
    public void testSearch() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());

        stateFarmHomePage.clickSearchButton();

        // Perform a search
        SearchResultsPage searchResultsPage = stateFarmHomePage.search("Auto insurance");

        // Verify that the search results are displayed
        Assert.assertTrue(searchResultsPage.isSearchResultsDisplayed());

        // Navigate back to the homepage
        stateFarmHomePage = searchResultsPage.navigateToHomePage();

        // Verify that the State Farm logo is displayed on the homepage
        Assert.assertTrue(stateFarmHomePage.isLogoDisplayed());
    }
    @Test
    public void testHelpButtonFunctionality() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        CustomerCarePage customerCarePage = stateFarmHomePage.clickHelpButton();
        String customerCarePageUrl = customerCarePage.getCurrentUrl();
        Assert.assertEquals(customerCarePageUrl, "https://www.statefarm.com/customer-care");
    }
}
