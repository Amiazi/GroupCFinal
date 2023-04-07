package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAgentBttn extends CommonAPI {
@Test
public void testAgentBttn() throws InterruptedException {
    StateFarm stateFarm = new StateFarm(getDriver());
    stateFarm.clickFindAgent();
    stateFarm.EnterZipCode("10459");
    stateFarm.clickFindAnAgentSearch();
    Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.statefarm.com/agent/?zipCode=10459");
}}