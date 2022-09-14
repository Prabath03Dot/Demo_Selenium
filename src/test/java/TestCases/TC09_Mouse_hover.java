package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.Hover;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC09_Mouse_hover extends TestBase {

    final static Logger logger = Logger.getLogger(TC09_Mouse_hover.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Mouse_Hover_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnHoverLink();

        logger.info("Log: User clicked on Hover Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Hovers_page");

    }

    @Test(priority = 2)
    public void Click_On_Mouse_Hover() throws InterruptedException {

        Hover hoverr = PageFactory.initElements(driver, Hover.class);
        hoverr.Hover();

        logger.info("Log: User Hover On Element");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Hover_Element");

    }


}

