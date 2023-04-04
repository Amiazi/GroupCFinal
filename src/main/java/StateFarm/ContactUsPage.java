package StateFarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    private WebDriver driver;

    @FindBy(name = "topic")
    private WebElement topicField;

    @FindBy(name = "firstName")
    private WebElement firstNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "phone")
    private WebElement phoneField;

    @FindBy(name = "message")
    private WebElement messageField;

    @FindBy(xpath = "//button[text()='Send']")
    private WebElement sendButton;

    @FindBy(xpath = "//div[text()='Your message has been sent.']")
    private WebElement successMessageElement;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillOutForm(String topic, String firstName, String lastName, String email, String phone, String message) {
        topicField.sendKeys(topic);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        messageField.sendKeys(message);
    }

    public void submitForm() {
        sendButton.click();
    }

    public boolean isSentSuccessMessageDisplayed() {
        return successMessageElement.isDisplayed();
    }
}
