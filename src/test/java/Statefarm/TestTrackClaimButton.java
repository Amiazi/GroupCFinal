package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrackClaimButton extends CommonAPI {
    @Test
    public void testTrackClaimBtn(){
        StateFarm stateFarm=new StateFarm(getDriver());
        stateFarm.ClickTrackBtn();
        stateFarm.ClickContinueBtn();
        stateFarm.ClickFileClaimBtn();
        //Assert.assertEquals(getDriver(),"https://reportloss.claims.statefarm.com/claimant?lossType=auto&reporterType=otherInsuranceCompany");
    }
}