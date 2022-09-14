package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.Add_Remove;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TC02_Add_Remove extends TestBase {

    final static Logger logger = Logger.getLogger(TC02_Add_Remove.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_Add_Remove_Testing_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.clickOnAddRemoveLinkButton();

        logger.info("Log: User clicked on Add Remove Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Add_Remove_page");

    }

    @Test(priority = 2)
    public void Click_On_Add_Button() {

        Add_Remove add_remove = PageFactory.initElements(driver, Add_Remove.class);

            add_remove.clickOnAddButton(5);

        logger.info("Log: User Clicked on Add Button");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Add_page");

    }

    @Test(priority = 3)
    public void Click_On_Delete_Button() throws InterruptedException {

        Add_Remove add_remove = PageFactory.initElements(driver, Add_Remove.class);

        add_remove.clickOnDeleteButton(5);

        logger.info("Log: User Clicked on Delete Button");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Delete_page");
    }


}

