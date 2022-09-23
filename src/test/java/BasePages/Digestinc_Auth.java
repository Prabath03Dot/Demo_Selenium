package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;

import static BaseClasses.StaticData.BASE_URL;
import static org.junit.Assert.assertEquals;

public class Digestinc_Auth extends TestBase {

    public Digestinc_Auth abAssertions(){
        String pageMessage = driver.findElement(By.xpath("//h3[normalize-space()='Digest Auth']")).getText();
        assertEquals(pageMessage, "Digest Auth");
        return this;
    }


    public Digestinc_Auth navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
