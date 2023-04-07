package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedbackBttn extends CommonAPI {
    @Test
    public void testFeedbackBttn(){
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.clickOnFeedbackBttn();
        homeDepot.clickOnFeedbackType();
        //homeDepotHomepage.clickOnFeedbackType(homeDepotHomepage.getTextFromWebElement(homeDepotHomepage.websiteFeedbackBttn));
        homeDepot.clickOnFeedbackNextBttn();
        homeDepot.clickOnExcellentBttn();
        homeDepot.clickOnSendFeedbackBttn();
        homeDepot.clickOnSendFeedbackBttn2();
        Assert.assertEquals(getDriver().getTitle(),"Thank you for your feedback!");




    }


}
