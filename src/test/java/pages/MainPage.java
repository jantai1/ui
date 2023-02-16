package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath ="//*[@id='login-link']")
    @FindBy(xpath ="//a[text()='Log in' and contains(@data-element-name,'header')]")
    public WebElement loginButton;
//    @FindBy(xpath ="//*[@id='register-link']")
    @FindBy(xpath ="//a[text()='Sign up' and contains(@data-element-name,'header')]")
    public WebElement signupButton;
    @FindBy(xpath ="//a[text()='Join Meetup']")
    public WebElement joinMeetupButton;

    @FindBy(id = "search-keyword-input")
    public WebElement searchInputField;

    @FindBy(xpath ="//input[@data-element-name='searchBarButton']")
    public WebElement searchButton;

    @FindBy(xpath ="//input[@data-element-name='searchLocation']")
    public WebElement locationInputField;

//    @FindBys({
//            @FindBy(xpath = "//a[@data-event-label='Online filter']"),
//            @FindBy(xpath = "//a[@aria-label='Online']")
//    })
//    public WebElement onlineLink;
//
//    @FindAll({
//            @FindBy(xpath = "//a[@data-event-label='Online filter']"),
//            @FindBy(xpath = "//a[@aria-label='Online']")
//    })
//    public WebElement onlineLink2;



    public void clickJoinMeetup(){
        joinMeetupButton.click();
    }

    public void search(String searchCriteria, String location){
        searchInputField.sendKeys(searchCriteria);
        if (location!=null){
//            locationInputField.clear();
            locationInputField.sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
            locationInputField.sendKeys(location);
        }
        searchButton.click();
    }

}


