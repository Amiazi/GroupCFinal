package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDropDown extends CommonAPI {

    @Test
    public void productAutoOptionDropDownTest() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        stateFarmHomePage.clickGetAQuoteTab();
        stateFarmHomePage.selectProductDropDown("Auto");
        stateFarmHomePage.enterZipCode("11373");
        stateFarmHomePage.clickStartAQuoteBttn();
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.productDropDown));
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.zipCodeField));
    }


    @Test
    public void productHomeownerDropDownTest() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        stateFarmHomePage.clickGetAQuoteTab();
        stateFarmHomePage.selectProductDropDown("Homeowners");
        stateFarmHomePage.enterZipCode("11373");
        stateFarmHomePage.clickStartAQuoteBttn();
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.productDropDown));
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.zipCodeField));
    }

    @Test
    public void productMedicareSupplementDropDownTest() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        stateFarmHomePage.clickGetAQuoteTab();
        stateFarmHomePage.selectProductDropDown("Medicare Supplement");
        stateFarmHomePage.selectStateDropDown("NY");
        stateFarmHomePage.clickStartAQuoteBttn();
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.productDropDown));
        Assert.assertTrue(checkDisplayed(stateFarmHomePage.stateDropDown));
    }
}
