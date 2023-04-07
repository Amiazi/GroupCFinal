package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;

public class TestFindInsurance extends CommonAPI {
    public void testInsuranceOptions () {
        StateFarm stateFarm = new StateFarm(getDriver());
        stateFarm.clickInsuranceOp();
        stateFarm.clickLifeBttn();
        //stateFarm.selectFromDropdown("NY");
        stateFarm.clickGoForLifeInsurance();
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://life.statefarm.com/LifeQuoteCustomer-web/getStarted");
    }}
