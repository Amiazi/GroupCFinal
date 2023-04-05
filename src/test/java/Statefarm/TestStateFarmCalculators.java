package Statefarm;

import StateFarm.CalculatorsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStateFarmCalculators extends CommonAPI {
    @Test
    public void testUserCanSuccessfullyNavigateToCalculatorPageClickingCarouselCard() {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.scrollToCarouselView();
        CalculatorsPage calculatorsPage = homepage.clickCalculatorCarouselCard();
        String currentUrl = calculatorsPage.getPageUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase("https://www.statefarm.com/simple-insights/calculators"));
    }
}
