package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCheckHotel extends CommonAPI {
    @Test
    public void TestCheckHotel() throws InterruptedException {
        AmericanAirlines americanAirlines=new AmericanAirlines(getDriver());
        americanAirlines.checkHotel();
        americanAirlines.switchToWindow(getDriver());
        americanAirlines.setDestinationInput("new york");
        americanAirlines.clickOnSearchButton();
        List<String> hotelLocation = americanAirlines.getListHotelLocation();
        for(String s : hotelLocation){
            if (s.contains("New York") || s.contains("Jersey City")){
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
            }
        }
    }
}
