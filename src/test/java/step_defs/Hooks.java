package step_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.EnvironmentManager;

public class Hooks {
    @Before
    public void setUp() throws Exception {
        EnvironmentManager.setUpEnvironment();
    }

    @After
    public void tearDown(Scenario scenario){
        try{
            if (scenario.isFailed()){
                //we will take a screenshot
                final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                //add screenshot to the html report
                scenario.embed(screenshot, "image/jpeg");
            }
        }catch (Exception e){
            System.out.println("The error happened while taking screeshot and cleaining up after the test");
            e.getMessage();
        }
        Driver.closeDriver();
    }
}
