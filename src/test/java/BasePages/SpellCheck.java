package BasePages;

import BaseClasses.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static BaseClasses.StaticData.BASE_URL;
import static org.junit.Assert.assertEquals;

public class SpellCheck extends TestBase {

    public SpellCheck SpellCheck_WebSite_Navigation() throws InterruptedException {
        driver.get("https://www.grammar.com/check-website.php");
        WebElement passLink = driver.findElement(By.xpath("//input[@id='url']"));
        passLink.clear();
        Thread.sleep(1000);
        passLink.sendKeys("https://the-internet.herokuapp.com/typos");
        driver.findElement(By.xpath("//button[normalize-space()='Check']")).click();

        return this;
    }

    public SpellCheck navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
