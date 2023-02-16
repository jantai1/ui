package step_defs;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import utilities.Driver;

public class LoginFlowSteps {
    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();

    @Then("^the user should be able to see \"([^\"]*)\" button$")
    public void the_user_should_be_able_to_see_button(String button){
        if(button.equalsIgnoreCase("Log in")){
            Assert.assertTrue("Button is not displayed", mainPage.loginButton.isDisplayed());
        } else if (button.equalsIgnoreCase("Sign up")){
            Assert.assertTrue("Button is not displayed", mainPage.signupButton.isDisplayed());
        } else if (button.equalsIgnoreCase("Join Meetup")){
            Assert.assertTrue("Button is not displayed", mainPage.joinMeetupButton.isDisplayed());
        }
    }
}
