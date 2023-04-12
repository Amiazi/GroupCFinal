package Statefarm;

import HomeDepot.HomeDepotHomepage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadUtil;
import zmq.io.coder.IDecoder;

import javax.swing.plaf.nimbus.State;
import java.util.concurrent.TimeUnit;

public class TestContinueAsGuest extends CommonAPI {

    @Test
    public void testContinueAsGuest(){
        StateFarmHomepage stateFarmHomepage = new StateFarmHomepage(getDriver());
        stateFarmHomepage.clickBanking();
        stateFarmHomepage.clickPaymentSolutions();
        stateFarmHomepage.clickFindSolutions();
        stateFarmHomepage.clickContinueAsGuest();
        Assert.assertEquals(getUrlLink(),"https://onboarding.usbank.com/talech/statefarm/acq/te/industry?transactionId=c452f0a6-2747-4cf2-93ac-227583ea316f");

    }
}
