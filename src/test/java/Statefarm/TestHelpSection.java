package Statefarm;

import StateFarm.CustomerCarePage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpSection extends CommonAPI {
    @Test
    public void testHelpButtonActuallyRedirectsToCustomerCarePage() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        CustomerCarePage customerCarePage = stateFarmHomePage.clickHelpButton();
        String customerCarePageUrl = customerCarePage.getCurrentUrl();
        Assert.assertEquals(customerCarePageUrl, "https://www.statefarm.com/customer-care");
    }
}
