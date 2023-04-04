package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmHomepage extends CommonAPI {
    @Test
    @Parameters({"expectedHeading"})
    public void testChangeLanguageToSpanish(String expectedHeading) {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.clickEspanonLink();
        homepage.checkIfLanguageChangedToSpanish(expectedHeading);
    }
}
