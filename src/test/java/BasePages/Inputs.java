package BasePages;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static BaseClasses.StaticData.BASE_URL;

public class Inputs extends TestBase {

    public Inputs InsertNumbers(String num) throws InterruptedException {
        WebElement inputNumber = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        inputNumber.sendKeys(num);
//        BaseSetup.waitTime();
//        inputNumber.sendKeys("-3");
//        inputNumber.clear();
//        BaseSetup.waitTime();
//        inputNumber.sendKeys("0");
//        inputNumber.clear();
//        BaseSetup.waitTime();
//        inputNumber.sendKeys("8");
//        inputNumber.clear();
//        BaseSetup.waitTime();
//        inputNumber.sendKeys("iopppppppppppppp");
//        inputNumber.clear();
//        BaseSetup.waitTime();
//        inputNumber.sendKeys("7ioo");
//        inputNumber.clear();
//        BaseSetup.waitTime();
        return this;
    }

    public Inputs navigateToHomePage(){
        driver.get(BASE_URL);
        return this;
    }

    public static class DragAndDrop extends TestBase {

        final static Logger logger = Logger.getLogger(DragAndDrop.class);

        @Test(priority = 1)
        public void verify_that_user_able_to_navigate_to_the_AB_Testing_Page () {

            HomePage homePage = PageFactory.initElements(driver, HomePage.class);

            homePage.clickOnABLinkButton();

            logger.info("Log: User clicked on A/B Link");

            Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "AB_Testing_page");

        }

        @Test(priority = 2)
        public void verify_that_selected_wording_includes() {

            AB_Testing ab_testing = PageFactory.initElements(driver, AB_Testing.class);

            ab_testing.abAssertions();

            logger.info("Log: Title Testing");

        }


    }
}
