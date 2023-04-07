package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestPayBill extends CommonAPI {
    public void testPayBillBtn() throws InterruptedException {
        StateFarm stateFarm=new StateFarm(getDriver());
        stateFarm.ClickPayBill();
        stateFarm.SelectUsingPay("Phone Number");
        stateFarm.EnterPhoneNumber("9292729877");
        stateFarm.EnterDOB("04-03-2023");
        stateFarm.ClickSubmitBtn();
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://financials.statefarm.com/guest-pay/error");
        Thread.sleep(2000);
    }
}