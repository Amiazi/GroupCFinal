package Statefarm;


import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFunction extends CommonAPI {
    @Test
    public void TestSearchBtn() throws InterruptedException {
        StateFarm stateFarm=new StateFarm(getDriver());
        stateFarm.ClickOnSearchBtn();
        stateFarm.EnterOnSearchBar("Discount");
        stateFarm.ClickSubmit();
        // Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.statefarm.com/sfsearch?k=discount");
        Thread.sleep(2000);
    }
}