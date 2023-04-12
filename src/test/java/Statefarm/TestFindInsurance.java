package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindInsurance extends CommonAPI {
    @Test
    public void testInsuranceOptions () {
        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.clickInsuranceOp();
        stateFarmHomepage.clickLifeBttn();
        stateFarmHomepage.SelectState("NY");
        stateFarmHomepage.clickGoForLifeInsurance();
        Assert.assertEquals(getUrlLink(),"https://www.statefarm.com/insurance/life");


    }
}
