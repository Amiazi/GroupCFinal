package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedToolsLocator extends CommonAPI {

    @Test
    public void testUsedToolsLocator(){
        HomeDepotHomepage homeDepotHomepage = new HomeDepotHomepage(getDriver());
        homeDepotHomepage.clickForThePro();
        homeDepotHomepage.clickRental();
        homeDepotHomepage.clickUsedTools();
        homeDepotHomepage.clickUsedToolsSearchBox();
        homeDepotHomepage.typeInZip("10026");
        Assert.assertEquals(getUrlLink(),"https://www.homedepot.com/tool-truck-rental/used-tools/index.html");
    }
}
