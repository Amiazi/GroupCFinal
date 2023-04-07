package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;

public class TestStartAndEndChat extends CommonAPI {
    public void testEndChat(){
        StateFarm stateFarm =new StateFarm(getDriver());
        stateFarm.clickTrackAClaim();
        stateFarm.clickStartChat();
        stateFarm.clickCancel();
        stateFarm.clickYes();
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.statefarm.com/claims/check-existing-claim");
    }}

