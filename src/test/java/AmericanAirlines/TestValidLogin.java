package AmericanAirlines;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestValidLogin extends CommonAPI {
    @Test
    public void TestLoginButton() throws InterruptedException {
        AmericanAirlines americanAirlines=new AmericanAirlines(getDriver());
        americanAirlines.ClickLoginBtn();
        americanAirlines.EnterUserName("madjid");
        americanAirlines.EnterLastNamelogin("chebrine");
        americanAirlines.EnterPassword("12345");
        americanAirlines.ClickLoggin();
        Thread.sleep(2000);
    }
}