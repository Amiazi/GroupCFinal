package HomeDepot;

import base.CommonAPI;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class TestFilter extends CommonAPI {
    @Test
    public void TestFilter() throws InterruptedException {
        String searchTerm ="oven";
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.doSearch(searchTerm);
        //homeDepot.clickSearchButton();
        homeDepot.clickDropDownFilter();
        Thread.sleep(5000);
        homeDepot.clickInStockFilter("In Stock at Store Today");
        Thread.sleep(5000);
}}
