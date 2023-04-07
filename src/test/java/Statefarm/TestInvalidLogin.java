package Statefarm;

import StateFarm.StateFarm;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

@Test
public class TestInvalidLogin extends CommonAPI {
    public void testInvalidLogIn() throws InterruptedException {
        StateFarm stateFarm=new StateFarm(getDriver());
        String actualText="Trouble logging in?";
        stateFarm.clickLogInButton();
        stateFarm.cliickUserId("abcd");
        stateFarm.clickPassword("1234");
        stateFarm.clickLogInBtn();
        Thread.sleep(5000);
        String expectedText=stateFarm.troubleLogIn();
        Assert.assertEquals(actualText,expectedText);

    }}
