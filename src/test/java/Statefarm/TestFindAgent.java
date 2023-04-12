package Statefarm;

import StateFarm.StateFarmHomepage;
import WebElements.StateFarm;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindAgent extends CommonAPI {

    @Test
    public void testAgentBttn() throws InterruptedException {
        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.clickFindAgent();
        stateFarmHomepage.EnterZipCode("10459");
        stateFarmHomepage.clickFindAnAgentSearch();
       Assert.assertEquals(getUrlLink(),"https://www.statefarm.com/agent/?zipCode=10459");
    }
}
