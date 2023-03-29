package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotHomepage extends CommonAPI {

    public HomeDepotHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
