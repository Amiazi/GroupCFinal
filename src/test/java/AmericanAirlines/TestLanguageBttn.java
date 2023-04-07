package AmericanAirlines;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestLanguageBttn extends CommonAPI {
    @Test
    public void testLanguageBttn(){
        //String languageChange="PLANIFIQUE SU VIAJE";
        AmericanAirlines americanAirlines =new AmericanAirlines(getDriver());
        americanAirlines.clickOnLanguageDropdownBttn();
        americanAirlines.clickOnSelectorLanguageBttn();
        americanAirlines.clickOnSelectOnLanguagePage();

    }

}
