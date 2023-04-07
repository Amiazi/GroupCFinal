package HomeDepot;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLocation extends CommonAPI {
   /* @Test
    public void testChangeLocation() throws InterruptedException {
        String expected = "Alsip";
        HomeDepot homeDepot = new HomeDepot(getDriver());
        homeDepot.clickOnLocationDropDown();
        Thread.sleep(5000);
        homeDepot.clickOnFindStoreButton();
        Thread.sleep(2000);
        homeDepot.clickOnSelectStore(2);
        String actual = homeDepot.getMyStoreName();
        Assert.assertEquals(actual,expected);
        Thread.sleep(10000);*/

    @Test
    public void testChangeLocation() throws InterruptedException {
        String expectName="Alsip";
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.clickLocationDropDown();
        Thread.sleep(5000);
        homeDepot.clickFindStoreButton();
        Thread.sleep(5000);
        homeDepot.selectMyStore("2");
        String actualName= homeDepot.getMyStoreName();
        Assert.assertEquals(actualName,expectName);
    }
    }

