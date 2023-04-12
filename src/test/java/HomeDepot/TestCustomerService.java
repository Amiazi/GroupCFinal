package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class TestCustomerService extends CommonAPI {
    @Test(enabled = false)
    public void customerServiceTest() {
        HomeDepotHomepage depotHomePage = new HomeDepotHomepage(getDriver());
        depotHomePage.clickHelpLink();
        Assert.assertTrue(checkDisplayed(depotHomePage.onlineOrderSupportHeader));
        Assert.assertTrue(checkDisplayed(depotHomePage.inStorePurchaseSupportHeader));
        Assert.assertTrue(checkDisplayed(depotHomePage.creditCustomerServiceHeader));
    }


    @Test
    public void returnPolicyTest() throws InterruptedException {
        HomeDepotHomepage depotHomePage = new HomeDepotHomepage(getDriver());
        depotHomePage.clickHelpLink();
        depotHomePage.clickReturnPolicyLink();
        Thread.sleep(3000);
        Assert.assertTrue(getUrlLink().contains("Return_Policy"));
    }
}
