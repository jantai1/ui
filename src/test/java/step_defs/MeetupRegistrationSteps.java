package step_defs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import utilities.Driver;

public class MeetupRegistrationSteps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    @When("^the user clicks on \"([^\"]*)\" button$")
    public void theUserClicksOnButton(String arg0) throws Throwable {
        mainPage.clickJoinMeetup();
    }

    @Then("^the user should verify if \"([^\"]*)\" is displayed$")
    public void theUserShouldVerifyIfIsDisplayed(String arg0) throws Throwable {
    }

    @Then("^the user should verify if \"([^\"]*)\" is provided$")
    public void theUserShouldVerifyIfIsProvided(String arg0) throws Throwable {
    }
}
