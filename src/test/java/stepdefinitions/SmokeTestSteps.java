package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.LoginPage;
import factory.DriverFactory;

public class SmokeTestSteps {

    private LoginPage loginPage;
    private WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }
    @Given("I navigate to url")
    public void i_navigate_to_url() {
        loginPage.userEntersUrl();
        loginPage.closeLoginPopupIfPresent();
    }

    @When("User enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String mobileName) throws Exception {
       loginPage.enterTextonSearchTextBox(mobileName);
    }


    @Then("User clicks on the first search result")
    public void user_clicks_on_the_first_search_result() {
        loginPage.clickOnFirstSuggestedPhone();
    }

    @Then("Mobile details page should be displayed")
    public void mobile_details_page_should_be_displayed() {
        // Just a validation that product page is opened (example: title contains mobile name)
        String actualPhoneName = loginPage.getTextOfFirstPhoneInList();
        System.out.println("First phone in list: " + actualPhoneName);

        // Expected phone name
        String expectedPhoneName = "Apple iPhone 14 (Starlight, 128 GB)";

        // TestNG exact match assertion
        Assert.assertEquals(
                actualPhoneName.trim(),
                expectedPhoneName,
                "Expected phone name does not match!"
        );

    }
}
