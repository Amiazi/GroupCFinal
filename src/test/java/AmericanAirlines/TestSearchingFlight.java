package AmericanAirlines;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestSearchingFlight extends CommonAPI {
    @Test
    public void testSearchFlight(){
        AmericanAirlines americanAirlines = new AmericanAirlines(getDriver());
        // Thread.sleep(1000);
        //americanHomepage.selectTripType("Search flights one way");
        americanAirlines.setDestinationInput("MIA");
        americanAirlines.setSelectPassenger("2");
        americanAirlines.selectTrip("type");
    }
}

