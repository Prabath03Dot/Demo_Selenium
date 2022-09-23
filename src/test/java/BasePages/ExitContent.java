package BasePages;

import BaseClasses.TestBase;
import javafx.util.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.util.Collections;

import static BaseClasses.StaticData.BASE_URL;

public class ExitContent extends TestBase {

    public ExitContent ExitContent_Actions() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.mouseMove(600,0);
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='ouibounce-modal']/div[2]/div[3]/p")).click();

        driver.quit();

        return this;
    }

    public ExitContent navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
