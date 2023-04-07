package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSFHelpButton extends CommonAPI {
    @Test
    public void testStartQuote() throws InterruptedException {
        StateFarm stateFarm = new StateFarm(getDriver());
        stateFarm.selectProduct("Auto");// select product
        Thread.sleep(4000);
        stateFarm.setInputZipCode("11108");
        Thread.sleep(4000);
        stateFarm.clickOnStartQuoteButton();
        Thread.sleep(3000);
    }
    @Test
    public void testHelpButton()throws InterruptedException{
        StateFarm statefarm = new StateFarm(getDriver());
        statefarm.clickOnHelpButton();
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.statefarm.com/customer-care");
        Thread.sleep(3000);
}}


