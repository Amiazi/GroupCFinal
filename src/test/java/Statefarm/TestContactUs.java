package Statefarm;

import StateFarm.ContactUsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelDataProvider;

public class TestContactUs extends CommonAPI {
    @Test
    public void testCreditCardInquiriesUSBankPhoneNumbers() {
        ExcelDataProvider dataProvider = ExcelDataProvider.getInstance();
        dataProvider.loadFile("src/test/resources/StateFarmTestData.xlsx", "ContactTestData");

        String expectedConsumerPhone = dataProvider.getDataFromCell(1, 0);
        String expectedBusinessPhone = dataProvider.getDataFromCell(1, 1);

        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());
        ContactUsPage contactUsPage = stateFarmHomePage.clickContactUsLink();

        String consumerPhone = contactUsPage.getCreditCardInquiriesUSBankConsumerPhoneNumber();
        String businessPhone = contactUsPage.getCreditCardInquiriesUSBankBusinessPhoneNumber();

        Assert.assertEquals(consumerPhone, expectedConsumerPhone);
        Assert.assertEquals(businessPhone, expectedBusinessPhone);
    }
}
