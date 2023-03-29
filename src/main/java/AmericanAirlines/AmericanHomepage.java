package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmericanHomepage extends CommonAPI {

    public AmericanHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
