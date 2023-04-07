package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterForJobPostings extends CommonAPI {
    @Test
    public void testJobPostingDateFilter(){
        AmericanAirlines americanAirlines =new AmericanAirlines(getDriver());
        americanAirlines.clickOnWereHiringBttn();
        americanAirlines.switchToWindow(getDriver());
        americanAirlines.clickOnSearchOpenJobsLink();
        americanAirlines.clickOnDateFilterforJobs();
        Assert.assertEquals(getUrlLink(),"https://jobs.aa.com/search/?q=&sortColumn=referencedate&sortDirection=asc&searchby=location&d=10#hdrDateButton");
    }
}
