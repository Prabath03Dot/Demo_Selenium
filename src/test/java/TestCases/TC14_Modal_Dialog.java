package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.ModelDialog;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC14_Modal_Dialog extends TestBase {

    final static Logger logger = Logger.getLogger(TC14_Modal_Dialog.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Model_Dialog_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnModelDialogLink();

        logger.info("Log: User clicked on Model_Dialog_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Model_Dialog_Page");

    }

    @Test(priority = 2)
    public void Model_Dialog_Action() throws InterruptedException {

        ModelDialog modelDialog = PageFactory.initElements(driver, ModelDialog.class);
        modelDialog.ModelDialogActionClose();

        logger.info("Log: Model_Dialog_Page Action : Window Closed");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Model_Dialog_Page Actions");

    }

    @Test(priority = 3)
    public void Model_Dialog_Action_Re_Enable() throws InterruptedException {

        ModelDialog modelDialog = PageFactory.initElements(driver, ModelDialog.class);
        modelDialog.ModelDialogActionReEnable();

        logger.info("Log: Model_Dialog_Page Action : Window Re-Enabled");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Model_Dialog_Re_Enabled");

    }


}

