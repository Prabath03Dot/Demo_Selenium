package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC04_Brokern_Images extends TestBase {

    final static Logger logger = Logger.getLogger(TC04_Brokern_Images.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Broken_Link_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnBrokenImagesLink();

        logger.info("Log: User clicked on Broken Images Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Broken_Images_page");

    }

    @Test(priority = 2)
    public void Verify_Broken_Images_Auth() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.BrokenImages();

        logger.info("Log: List of Broken Images");
//        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Broken_Images_page");

    }


}

