package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFindTrips extends CommonAPI {
    @Test
    public void testFindTrips() throws InterruptedException {
        AmericanAirlines americanAirlines=new AmericanAirlines(getDriver());
        americanAirlines.ClickManageTrips();
        americanAirlines.ClickManage();
        americanAirlines.EnterLastName("madjid");
        americanAirlines.EnterConfirmation("1234");
        americanAirlines.ClickSubmit();
        Thread.sleep(2000);
    }
}