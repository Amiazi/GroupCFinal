package Statefarm;

import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Test;
import utility.ExcelDataProvider;

public class TestMultilingualism extends CommonAPI {
    @Test
    public void testChangeLanguageToSpanish() {
        ExcelDataProvider dataProvider = ExcelDataProvider.getInstance();
        dataProvider.loadFile("src/test/resources/StateFarmTestData.xlsx", "LanguageTestData");

        String expectedHeading = dataProvider.getDataFromCell(1, 0);

        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.clickEspanonLink();
        homepage.checkIfLanguageChangedToSpanish(expectedHeading);
    }
}
