package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.HomePage;
import BasePages.JS_Errors;
import BasePages.SpellCheck;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC30_JS_Errors extends TestBase {

    final static Logger logger = Logger.getLogger(TC30_JS_Errors.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_JS_Error_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnJSErrorsLink();
        logger.info("Log: User clicked on JSError Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "JSError_page");

    }

    @Test(priority = 2)
    public void JS_Errors_List_Outputs() throws InterruptedException {

        JS_Errors js_errors = PageFactory.initElements(driver, JS_Errors.class);

        js_errors.JS_Errors_List();

        logger.info("Log: JS_Errors_List_Outputs Testing");

    }


}

