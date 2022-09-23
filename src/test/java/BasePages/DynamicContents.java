package BasePages;

import BaseClasses.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static BaseClasses.StaticData.BASE_URL;

public class DynamicContents extends TestBase {
    @CacheLookup
    @FindBy( xpath = "//div[@class='large-10 columns'][normalize-space()='Minus quia repudiandae hic sapiente quis quia perferendis debitis doloribus amet autem delectus consequuntur voluptatem exercitationem voluptates voluptatem et fugiat tempore explicabo ut aut nam omnis non qui quia et eveniet provident qui officiis.']")
    WebElement img1;

    public DynamicContents DynamicContents_Actions() throws InterruptedException {
        String expectedText = img1.getText();
        String actualText = "Minus quia repudiandae hic sapiente quis quia perferendis debitis doloribus amet autem delectus consequuntur voluptatem exercitationem voluptates voluptatem et fugiat tempore explicabo ut aut nam omnis non qui quia et eveniet provident qui officiis.";
        driver.navigate().refresh();
        Thread.sleep(2000);
        Assert.assertNotEquals(actualText,expectedText);
        if ( actualText != expectedText ){
            System.out.println("Location is Dynamic");
        }else {
            System.out.println("Location Static");
        }

        return this;
    }

    public DynamicContents StaticContents_Actions() throws InterruptedException {
        WebElement staticLink = driver.findElement(By.xpath("//a[normalize-space()='click here']"));
        staticLink.click();
        Thread.sleep(2000);

        String expectedText = img1.getText();
        String actualText = "Minus quia repudiandae hic sapiente quis quia perferendis debitis doloribus amet autem delectus consequuntur voluptatem exercitationem voluptates voluptatem et fugiat tempore explicabo ut aut nam omnis non qui quia et eveniet provident qui officiis.";
        driver.navigate().refresh();
        Thread.sleep(2000);
        Assert.assertEquals(actualText,expectedText);
        if ( actualText != expectedText ){
            System.out.println("Location is Dynamic");
        }else {
            System.out.println("Location Static");
        }

        driver.quit();

        return this;
    }

    public DynamicContents navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

}
