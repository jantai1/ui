package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JoinMeetupPage {

    public JoinMeetupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='facebook-register']")
    public WebElement continueWithFacebookButton;

    @FindBy(xpath = "//*[@id='google-register']")
    public WebElement continueWithGoogleButton;

    @FindBy(xpath = "//*[@id='apple-register']")
    public WebElement continueWithAppleButton;

    @FindBy(xpath = "//*[@id='email-register']")
    public WebElement signUpWithEmailButton;

    @FindBy(xpath = "//a[@data-element-name='register-log-in-link']")
    public WebElement logInLink;
}
