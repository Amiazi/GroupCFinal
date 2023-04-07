package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBagTracking extends CommonAPI {
    @Test
    public void testInvalidBagTrackingNumber() {
        AmericanAirlines americanAirlines =new AmericanAirlines(getDriver());
        americanAirlines.clickOnBagsandOptionalBttn();
        americanAirlines.clickOnPayforBagsOnline();
        americanAirlines.clickOnTrackyourBagsBttn();
        americanAirlines.enterLastNameTracking("");
        Assert.assertTrue(checkDisplayed(americanAirlines.errorHeader));
}}
