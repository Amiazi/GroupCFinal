package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedToolsLocator extends CommonAPI {
    @Test
    public void testUsedToolsLocator() {
        HomeDepot homeDepot = new HomeDepot(getDriver());
        homeDepot.clickForThePro();
        homeDepot.clickRental();
        homeDepot.clickUsedTools();
        homeDepot.clickUsedToolsSearchBox();
        homeDepot.typeInZip("10026");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.homedepot.com/tool-truck-rental/used-tools/index.html");
    }
}
