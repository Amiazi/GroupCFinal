package AmericanAirlines;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestFeedBack extends CommonAPI {
    @Test(enabled = false)
    public void testPostFeedBack() {
        AmericanAirlines americanAirlines = new AmericanAirlines(getDriver());
        americanAirlines.clickOnFeedBackButton();
        americanAirlines.clickOnFiveStarRating();
        americanAirlines.clickOnSubmitRate();
    }
}
