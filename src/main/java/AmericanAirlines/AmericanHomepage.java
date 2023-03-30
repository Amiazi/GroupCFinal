package AmericanAirlines;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class AmericanHomepage extends CommonAPI {
    public static void main(String[] args) {

    }

    public AmericanHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

