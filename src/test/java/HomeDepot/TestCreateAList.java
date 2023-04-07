package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateAList extends CommonAPI {

    @Test
    public void testCreatingList(){
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.clickOnListBttn();
        homeDepot.clickOnSigninOrCreateBttn();
        homeDepot. clickOnEmailAddressBox("aniqamiazi424@gmail.com");
        homeDepot.clickOnContinueEmailBttn();
        homeDepot.clickOnNoThanksPasswordBttn();
        homeDepot.clickonSigninWithPassBttn();
        homeDepot.clickOnEnterPasswordBttn("PNTpass123!");
        homeDepot.clickOnSigninBttn();
        homeDepot.clickOnCreateList();
        homeDepot.clickOnListNameBox("Gift ideas");
        homeDepot.clickOnSubmitList();
        Assert.assertEquals(getDriver().getTitle(),"My Lists");
    }

}
