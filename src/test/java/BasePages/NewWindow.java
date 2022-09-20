package BasePages;

import BaseClasses.BaseSetup;
import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

import static BaseClasses.StaticData.BASE_URL;

public class NewWindow extends TestBase {

    @CacheLookup
    @FindBy (xpath ="//a[normalize-space()='Click Here']")
    private WebElement LinkToNewWindow;

    public NewWindow NewWindowActions(){
        LinkToNewWindow.click();
        BaseSetup.waitTime();

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandel =driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandel.iterator();

        while (iterator.hasNext()){
            String childWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                WebElement text =  driver.findElement(By.xpath("//h3[normalize-space()='New Window']"));
                System.out.println("Child Window text : " + text.getText() );
            }
        }
        return this;
    }


    public NewWindow navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
