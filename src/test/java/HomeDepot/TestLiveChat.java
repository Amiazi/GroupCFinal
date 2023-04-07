package HomeDepot;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestLiveChat extends CommonAPI {
    @Test
    public void TestChat(){
        HomeDepot homeDepot=new HomeDepot(getDriver());
        homeDepot.ClickOnLiveChat();
        homeDepot.EnterText("Hello");
        homeDepot.ClickSubmit();
    }
}