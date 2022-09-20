package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.AB_Testing;
import BasePages.HomePage;
import BasePages.KeyPress;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC19_KeyPress extends TestBase {

    final static Logger logger = Logger.getLogger(TC19_KeyPress.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Key_Press_Page () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnKeyPressLink();
        logger.info("Log: User clicked on KeyPressLink");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "KeyPressLink_page");
    }

    @Test(priority = 2)
    public void KeyPress_Actions1() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActions1();
        logger.info("Log: KeyPressActions1 Testing");
    }

    @Test(priority = 3)
    public void KeyPress_Actions_Verifications1() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActionsVerify1();
        logger.info("Log: KeyPressActions1 Verifications");
    }

    @Test(priority = 4)
    public void KeyPress_Actions2() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActions2();
        logger.info("Log: KeyPressActions2 Testing");
    }

    @Test(priority = 5)
    public void KeyPress_Actions_Verifications2() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActionsVerify2();
        logger.info("Log: KeyPressActions2 Verifications");
    }

    @Test(priority = 6)
    public void KeyPress_Actions3() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActions3();
        logger.info("Log: KeyPressActions2 Testing");
    }

    @Test(priority = 7)
    public void KeyPress_Actions_Verifications3() throws InterruptedException {
        KeyPress keyPress = PageFactory.initElements(driver, KeyPress.class);
        keyPress.KeyPressActionsVerify3();
        logger.info("Log: KeyPressActions2 Verifications");
    }


}

