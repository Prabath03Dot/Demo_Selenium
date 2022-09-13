package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseSetup extends TestBase {

    public BaseSetup(WebDriver driver1) {
        this.driver = driver1;
    }

    //Scroll to a selected element
    public static void UI_scroll_IntoView(final WebElement element) {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.err.format("" + e);
        }

    }

    //Scroll the page up
    public static void UI_scroll_up() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)");

    }

    //Refresh the page
    public static void refreshPage() {
        driver.navigate().refresh();
    }

    //Check the element available
    public boolean isElementAvailable(String text, String elementPath) {
        boolean isAvailable = false;

        String availableTxt = driver.findElement(By.xpath(elementPath)).getText();

        if (availableTxt.equalsIgnoreCase(text)){
            isAvailable = true;
            return isAvailable;
        }

        return isAvailable;
    }

    //Generate random text
    public String createRandomText(String textToCombine) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String randomNumber = textToCombine + randomInt;
        return randomNumber;
    }

    //Open a new tab
    public void openTab(String mailinatorURL) {
        driver.get(mailinatorURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void waitTime(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
    }

    //Switch to iframe
    public void switchedToiFrame(String frame) {
        driver.switchTo().frame(frame);
    }

}







