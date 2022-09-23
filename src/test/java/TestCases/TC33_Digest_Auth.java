package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.Digestinc_Auth;
import BasePages.HomePage;
import BasePages.User_Auth;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC33_Digest_Auth extends TestBase {

    final static Logger logger = Logger.getLogger(TC33_Digest_Auth.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Digest_Auth_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDigestAuthLink();

        logger.info("Log: User clicked on Digest_Auth_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Digest_Auth_Page");

    }

    @Test(priority = 2)
    public void Send_User_Name_Auth_Digestic() {

        Digestinc_Auth digestinc_auth = PageFactory.initElements(driver, Digestinc_Auth.class);
        digestinc_auth.abAssertions();

        logger.info("Log: User Authenticated");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "User_Authenticated");

    }


}

