package StateFarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StateFarmHomepage extends CommonAPI {

    public StateFarmHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
