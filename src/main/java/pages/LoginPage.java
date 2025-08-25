package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.PasswordEncryption;
import utilities.ElementUtil;

public class LoginPage {

    private WebDriver driver;
    private ElementUtil elementUtil;   // use proper camel case
    private PasswordEncryption pwEncrypt;
    private Properties prop;

    // Locators
    @FindBy(xpath = "//input[@name='q']")
    private WebElement flipKartSearchTextBox;

    @FindBy(xpath="(//div[@class='YGcVZO _2VHNef'])[1]")
    private WebElement firstSuggestedPhone;

    @FindBy(xpath ="//div[text()='Apple iPhone 14 (Starlight, 128 GB)']")
    private WebElement firstPhoneName;

    @FindBy(xpath = "//span[text()='✕']")
    private WebElement loginPopupCloseBtn;


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;

        // Initialize utilities
        this.elementUtil = new ElementUtil(driver);

        // Load config properties
        ConfigReader configReader = new ConfigReader();
        this.prop = configReader.init_prop();
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void userEntersUrl() {
        driver.get(prop.getProperty("url"));
    }

    public void enterTextonSearchTextBox(String inputText) {
        elementUtil.input(flipKartSearchTextBox,inputText);
    }


    public void closeLoginPopupIfPresent() {
        try {
            if (loginPopupCloseBtn.isDisplayed()) {
                loginPopupCloseBtn.click();
                System.out.println("Login popup closed successfully.");
            }
        } catch (Exception e) {
            System.out.println("Login popup not displayed.");
        }
    }
    public void clickOnFirstSuggestedPhone() {
        elementUtil.click(firstSuggestedPhone);
    }
    public String getTextOfFirstPhoneInList() {
        String phoneName = firstPhoneName.getText();
        return phoneName;
    }
}
