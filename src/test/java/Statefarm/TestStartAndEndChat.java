package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStartAndEndChat extends CommonAPI {

    @Test
    public void testEndChat(){
        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.clickTrackClaim();
        stateFarmHomepage.clickStartChat();
        stateFarmHomepage.clickCancel();
        stateFarmHomepage.clickYes();
        Assert.assertEquals(getUrlLink(),"https://www.statefarm.com/claims/check-existing-claim");
    }


}
