package AmericanAirlines;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;

import java.util.List;

public class TestAmericanAirlineSearchBar extends CommonAPI {
    @Test
    public void searchMultipleStatesTest(){
        AmericanHomepage airlinesHomePage = new AmericanHomepage(getDriver());
        ExcelReader excelReader = new ExcelReader("C:/Users/rcabr/OneDrive/Desktop/SEL-WEM/GroupCFinal/Random States.xlsx");
        List<String> states = excelReader.getEntireColumnForGivenHeader("Sheet1", "Random States"); // converting excel into an List
        for (String state : states) { // using enhanced for loop to iterate over excel sheet
            if (state.equalsIgnoreCase("")) {   // breaks if excel sheet is empty
                break;
            }
            airlinesHomePage.typeAndSearch(state);
            Assert.assertTrue(getUrlLink().contains(state));
            airlinesHomePage.clearSearchBar(); // not clearing for some reason
        }

    }
}
