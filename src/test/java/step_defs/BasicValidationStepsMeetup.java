package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.EnvironmentManager;

public class BasicValidationStepsMeetup {

    WebDriver driver = Driver.getDriver();
    @Given("^the user is on the meetup homepage$")
    public void the_user_is_on_the_meetup_homepage() {
        driver.get(EnvironmentManager.baseUrl);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.meetup.com/");
    }

    @Then("^verify the title contains \"([^\"]*)\"$")
    public void verify_the_title_contains(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("^verify the url contains \"([^\"]*)\"$")
    public void verify_the_url_contains(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }
}
