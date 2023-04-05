package Statefarm;

import StateFarm.SearchResultsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFunctionality extends CommonAPI {
    @Test
    public void testSearchResultActuallyDisplayed() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        stateFarmHomePage.clickSearchButton();

        SearchResultsPage searchResultsPage = stateFarmHomePage.search("Auto insurance");
        Assert.assertTrue(searchResultsPage.isSearchResultsDisplayed());

        stateFarmHomePage = searchResultsPage.navigateToHomePage();
        Assert.assertTrue(stateFarmHomePage.isLogoDisplayed());
    }
}
