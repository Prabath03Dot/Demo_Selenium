package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.NestedFrames;
import BasePages.NewWindow;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC22_NestedFrames extends TestBase {

    final static Logger logger = Logger.getLogger(TC22_NestedFrames.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Nested_Frames_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.ClickOnNestedFramesLink();

        logger.info("Log: User clicked on Nested_Frames_Page Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Nested_Frames_Page");

    }

    @Test(priority = 2)
    public void Verify_Actions_Nested_Frames() throws InterruptedException {

        NestedFrames nestedFrames = PageFactory.initElements(driver, NestedFrames.class);

        nestedFrames.NestedFramesActions();

        logger.info("Log: Nested_Frames_Page Testing");

    }


}

