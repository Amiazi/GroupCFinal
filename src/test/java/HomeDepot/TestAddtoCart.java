package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddtoCart extends CommonAPI {
    @Test
    public void TestItemAdded() {
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.ClickCartBtn();
        homeDepot.ClickAddToCart();
        Assert.assertEquals(getDriver().getTitle(),"Added to Cart");
    }}