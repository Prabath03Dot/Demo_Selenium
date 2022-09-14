package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.CheckBoxes;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC06_CheckBoxes extends TestBase {

    final static Logger logger = Logger.getLogger(TC06_CheckBoxes.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_CheckBox_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnCheckBoxPage();

        logger.info("Log: User clicked on CheckBox Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "CheckBox_page");
    }

    @Test(priority = 2)
    public void Click_On_CheckBox_Button() {

        CheckBoxes checkBoxes = PageFactory.initElements(driver, CheckBoxes.class);

        checkBoxes.ClickOnCheckBox1();

        logger.info("Log: User Clicked on CheckBox Button");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "CheckBox_page");

    }

    @Test(priority = 3)
    public void Verify_CheckBox_Button_is_Clicked() {
        CheckBoxes checkBoxes = PageFactory.initElements(driver, CheckBoxes.class);

        checkBoxes.ClickOnCheckBox2();

        logger.info("Log: Verify the CheckBox Button is Selected");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "CheckBox_page");
    }


}

