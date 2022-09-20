package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.AB_Testing;
import BasePages.HomePage;
import BasePages.NMsg;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC20_NotificationMsg extends TestBase {

    final static Logger logger = Logger.getLogger(TC20_NotificationMsg.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_AB_Testing_Page () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnMsgLink();
        logger.info("Log: User clicked on Notification Msg Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Notification_Msg_page");
    }

    @Test(priority = 2)
    public void VerifyNotificationMsg() {
        NMsg nMsg = PageFactory.initElements(driver, NMsg.class);
        nMsg.NMsgActionsVerification();
        logger.info("Log: NMsgActionVerification Testing");
    }

    @Test(priority = 3)
    public void MsgCloseActions() throws InterruptedException {
        NMsg nMsg = PageFactory.initElements(driver, NMsg.class);
        nMsg.NMsgActionsClose();
        logger.info("Log: NMsgActionVerification Closing");
    }

    @Test(priority = 4)
    public void MsgReloadActions() {
        NMsg nMsg = PageFactory.initElements(driver, NMsg.class);
        nMsg.NMsgActionsReload();
        logger.info("Log: NMsgActionVerification Reloading");
    }



}

