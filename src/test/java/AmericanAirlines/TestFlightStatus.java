package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFlightStatus extends CommonAPI {
    @Test
    public void testflightstatus(){
        AmericanAirlines americanAirlines=new AmericanAirlines(getDriver());
        americanAirlines.clickFlightStatusTab();
        americanAirlines.InputFromAirport("JFK");
        americanAirlines.InputToAirportDestination("MIA");
        americanAirlines.ClickSearchBar();
        Assert.assertEquals(getElementText(americanAirlines.flightResults()), "New York, NY to Miami, FL");
    }
}