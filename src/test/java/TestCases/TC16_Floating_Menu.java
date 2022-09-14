package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.FloatingMenu;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC16_Floating_Menu extends TestBase {

    final static Logger logger = Logger.getLogger(TC16_Floating_Menu.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Floating_Menu_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnFloatingMenuLink();

        logger.info("Log: User clicked on Floating_Menu Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Floating_Menu_page");

    }

    @Test(priority = 2)
    public void Floating_Menu_Actions() throws InterruptedException {

        FloatingMenu floatingMenu = PageFactory.initElements(driver, FloatingMenu.class);
        floatingMenu.FloatingMenuActions();

        logger.info("Log: Floating_Menu : Actions");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Floating_Menu Actions");

    }


}

