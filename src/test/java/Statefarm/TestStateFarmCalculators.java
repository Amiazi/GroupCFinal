package Statefarm;

import StateFarm.CalculatorsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmCalculators extends CommonAPI {
    @Test
    public void testUserCanSuccessfullyNavigateToCalculatorPageClickingCarouselCard() {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.scrollToCarouselView();
        homepage.clickCalculatorCarouselCard();

        CalculatorsPage calculatorsPage = new CalculatorsPage(getDriver());
        calculatorsPage.checkIfUserIsCurrentlyOnThisPage();
    }
}
