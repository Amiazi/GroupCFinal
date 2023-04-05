package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class TestBrokenLinks extends CommonAPI {
    @Test
    public void testBrokenLinksOnHomepage() {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.checkForBrokenLinks();
    }
}
