package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.FileDownload;
import BasePages.HomePage;
import BasePages.RedirectLinks;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class TC24_FileDownload extends TestBase {

    final static Logger logger = Logger.getLogger(TC24_FileDownload.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_File_Download_Page () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnFileDownloadLink();
        logger.info("Log: User clicked on File_Download_Page  Link");

        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "File_Download_Page ");
    }

    @Test(priority = 2)
    public void File_Download_Action_1 () throws InterruptedException {
        FileDownload fileDownload = PageFactory.initElements(driver, FileDownload.class);
        fileDownload.ClickOnFileAction1();
        logger.info("Log: User clicked on File_Download_1");

    }


}

