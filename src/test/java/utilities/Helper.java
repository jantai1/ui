package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public static void mouseClick(WebElement element){
        waitForElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();
    }

    public static void javascriptClick(WebElement element){
        waitForElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

        js.executeScript("arguments[0].click();", element);
    }

    public static void highlightElement(WebElement element) throws InterruptedException {
        String style = "border: 4px dashed red";
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, style);
        Thread.sleep(2000);
    }

    public static void waitForElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void weClick(WebElement element){
        waitForElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        element.click();
    }
}
