package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC11_Dynamic_Controls extends TestBase {

    final static Logger logger = Logger.getLogger(TC11_Dynamic_Controls.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Dynamic_Control_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDynamicControlLink();

        logger.info("Log: User clicked on Dynamic_Control_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Dynamic_Control_Page");

    }

    @Test(priority = 2)
    public void DynamicControlActionsRemove() throws InterruptedException {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.DynamicControlActionsRemove();

        logger.info("Log: DynamicControlRemove Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "DynamicControlRemove_Actions");

    }

    @Test(priority = 3)
    public void DynamicControlActionsDisable() throws InterruptedException {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.DynamicControlActionsDisable();

        logger.info("Log: DynamicControlDisable Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "DynamicControlDisable_Actions");

    }


}

