package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchProduct extends CommonAPI {
    /*
    test case search product
    1 open app with chrome
    2 enter search term in search input
    3 click on search button
    4 validate the search term is the same as result
    */
    @Test
    public void testValidSearch() throws InterruptedException {
        String searchTerm = "table";
        HomeDepot homeDepot = new HomeDepot(getDriver());
        ResultPage resultPage = new ResultPage(getDriver());
        Thread.sleep(3000);
        homeDepot.doSearch(searchTerm);
        homeDepot.clickOnSearchButton();
        String expectedResult = resultPage.getSearchText();
        Assert.assertTrue(expectedResult.equalsIgnoreCase(searchTerm));


    }
}
