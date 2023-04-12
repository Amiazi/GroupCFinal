package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSFHelpBttn extends CommonAPI {

    @Test
    public void testHelpButton()throws InterruptedException{
        StateFarmHomepage statefarmhomepage = new StateFarmHomepage(getDriver());
        statefarmhomepage.clickOnHelpButton();
        Assert.assertEquals(getUrlLink(),"https://www.statefarm.com/");

}
}



