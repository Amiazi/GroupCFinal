package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static java.sql.DriverManager.getDriver;

public class TestLogIn extends CommonAPI {
    @Test
    public void testLogInHomeDepot() throws InterruptedException {
        HomeDepot homeDepot = new HomeDepot(getDriver());
        String url="https://www.homedepot.com/auth/view/signin?redirect=/&ref=null";
        homeDepot.clickOnMyAccountHD();
        homeDepot.clickSignInButtonHD();
        homeDepot.InputEmailAddressHD("bibaznt@gmail.com");
        homeDepot.clickSubmitButtonHD();
        Thread.sleep(3000);
        String expected =homeDepot.getDriver().getCurrentUrl();
        Assert.assertEquals(url,expected);
}
}