package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUpdateZip extends CommonAPI {

    @Test
    public void testChangeZip(){
        HomeDepotHomepage homeDepotHomepage = new HomeDepotHomepage(getDriver());
        homeDepotHomepage.clickDeliveringTo();
        homeDepotHomepage.clickEnterZipCode();
        homeDepotHomepage.typeZipCode("10001");
        Assert.assertTrue(checkDisplayed(homeDepotHomepage.newZipCode));


    }
}
