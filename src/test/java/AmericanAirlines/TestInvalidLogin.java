package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class TestInvalidLogin extends CommonAPI {
    @Test
    public void testInvalidLogin() throws InterruptedException {
        AmericanAirlines americanAirlines = new AmericanAirlines(getDriver());
        americanAirlines.clickOnLoginBtn();
        americanAirlines.setInputUsername("sabrina");
        americanAirlines.setInputLastname("biba");
        americanAirlines.setInputPassword("0000");
        americanAirlines.clickOnLogin();
        Thread.sleep(5000);
    }
}
