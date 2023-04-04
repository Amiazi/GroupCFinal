package Statefarm;

import StateFarm.ContactUsPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmHomepage extends CommonAPI {
    @Test
    @Parameters({"expectedHeading"})
    public void testChangeLanguageToSpanish(String expectedHeading) {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.clickEspanonLink();
        homepage.checkIfLanguageChangedToSpanish(expectedHeading);
    }
    @Test
    public void testBrokenLinks() {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.checkForBrokenLinks();
    }
    @Test
    public void testContactUs() {
        StateFarmHomepage stateFarmHomePage = new StateFarmHomepage(getDriver());

        // Click the "Contact Us" link on the homepage
        ContactUsPage contactUsPage = stateFarmHomePage.clickContactUsLink();

        // Fill out the "Contact Us" form
        contactUsPage.fillOutForm("Billing", "John", "Doe", "johndoe@example.com", "123-456-7890", "I have a question about my billing.");

        // Submit the form
        contactUsPage.submitForm();

        // Verify that the message was sent successfully
        Assert.assertTrue(contactUsPage.isSentSuccessMessageDisplayed());
    }
}
