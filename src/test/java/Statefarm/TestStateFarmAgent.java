package Statefarm;

import StateFarm.AgentPage;
import StateFarm.StateFarmHomepage;
import base.CommonAPI;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.ExcelDataProvider;

public class TestStateFarmAgent extends CommonAPI {
    @Test(description = "Tests find an agent, for a specific zip code their should be a specific number of agents")
    public void testTotalNumberOfAgentsRetrievedOnFindAnAgentForSpecificZip() {
        ExcelDataProvider dataProvider = ExcelDataProvider.getInstance();
        dataProvider.loadFile("src/test/resources/StateFarmTestData.xlsx", "AgentSearchData");

        String zip = dataProvider.getDataFromCell(1, 0);
        String expectedAgents = dataProvider.getDataFromCell(1, 1);

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
