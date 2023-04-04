package Statefarm;

import StateFarm.AgentPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestStateFarmAgent extends CommonAPI {
    @Test(description = "Tests find an agent, for a specific zip code their should be a specific number of agents")
    @Parameters({"zip", "expectedAgents"})
    public void testTotalNumberOfAgentsRetrievedOnFindAnAgentForSpecificZip(String zip, String expectedAgents) {
        StateFarmHomepage homepage = new StateFarmHomepage(getDriver());
        homepage.clickFindAgentNavItem();
        homepage.enterZipCodeOnFindAgentSection(zip);
        homepage.clickFindAnAgentButton();

        waitFor(5);

        AgentPage agentPage = new AgentPage(getDriver());
        agentPage.checkIfUserIsCurrentlyOnThisPage();
        agentPage.checkIfUserWasSentWithSearchedZipCode(zip);
        agentPage.checkIfValidAgentsCountDisplayed(expectedAgents);
    }
}
