package pageNavigation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class MeetupLogin {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
    }

    @After
    public void tearDown(){
//        Driver.closeDriver();
    }

    @Test
    public void meetupLogin(){
        driver.navigate().to("https://www.meetup.com/");
        WebElement loginButton1 = driver.findElement(By.id("login-link"));
        loginButton1.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("learningtestinggrowing@gmail.com");

        WebElement passwordField = driver.findElement(By.id("current-password"));
        passwordField.sendKeys("m@Etup2020");

        WebElement loginButton2 = driver.findElement(By.xpath("//*[@name='submitButton']"));
        loginButton2.click();
    }
}
