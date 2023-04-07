package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCarLink extends CommonAPI {
    @Test
    public void TestCar() throws InterruptedException {
        AmericanAirlines americanAirlines=new AmericanAirlines(getDriver());
        String actualResultCar="Results list";
        americanAirlines.clickCar();
        americanAirlines.switchToWindowCar(getDriver());
        americanAirlines.typeCityOfAirport("ORD");
        americanAirlines.pickUpDate("10/04/2023");
        americanAirlines.dropOfDate("10/05/2023");
        americanAirlines.clickSearButtonCar();
        String expectResultCare= americanAirlines.getResultCare();
        Assert.assertEquals(actualResultCar,expectResultCare);
        Thread.sleep(5000);
    }
}

