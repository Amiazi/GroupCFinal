package HomeDepot;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends CommonAPI {

    @FindBy(xpath = "//h1[@class='results-header__keyword']") public WebElement searchHeader;

    public ResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String getSearchText(){
        return getTextFromWebElement(searchHeader);
    }
}
