package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.ExitContent;
import BasePages.HomePage;
import BasePages.SpellCheck;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;

public class TC31_Exit_Content extends TestBase {

    final static Logger logger = Logger.getLogger(TC31_Exit_Content.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Spell_Check_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnExitContentLink();
        logger.info("Log: User clicked on ExitContentLink");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "ExitContentLink_page");

    }

    @Test(priority = 2)
    public void Exit_Content_Actions() throws InterruptedException, AWTException {

        ExitContent exitContent = PageFactory.initElements(driver, ExitContent.class);

        exitContent.ExitContent_Actions();

        logger.info("Log: ExitContent_Actions Testing");

    }


}

