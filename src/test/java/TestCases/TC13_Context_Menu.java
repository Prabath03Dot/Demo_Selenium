package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.ContextMenu;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC13_Context_Menu extends TestBase {

    final static Logger logger = Logger.getLogger(TC13_Context_Menu.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Context_Menu_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnContextMenuLink();

        logger.info("Log: User clicked on Context_Menu_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Context_Menu_Page");

    }

    @Test(priority = 2)
    public void Context_Menu_Action() throws InterruptedException {

        ContextMenu contextMenu = PageFactory.initElements(driver, ContextMenu.class);
        contextMenu.ContextMenuActions();

        logger.info("Log: Context_Menu_Page Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Context_Menu_Page Actions");

    }


}

