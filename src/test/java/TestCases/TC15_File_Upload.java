package TestCases;

import BaseClasses.Reporting;
import BaseClasses.TestBase;
import BasePages.FileUpload;
import BasePages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC15_File_Upload extends TestBase {

    final static Logger logger = Logger.getLogger(TC15_File_Upload.class);

    @Test(priority = 1)
    public void verify_that_user_able_to_navigate_to_the_File_Upload_Page () {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnFileUploadLink();

        logger.info("Log: User clicked on File_Upload_Page Link");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "File_Upload_Page ");

    }

    @Test(priority = 2)
    public void File_Upload_Page_Actions() throws InterruptedException {

        FileUpload fileUpload = PageFactory.initElements(driver, FileUpload.class);
        fileUpload.FileUploadActions();

        logger.info("Log: File_Upload_Page Action : File Uploading......");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "File_Upload_Page Actions");

    }

    @Test(priority = 2)
    public void Verify_File_Uploaded() throws InterruptedException {

        FileUpload fileUpload = PageFactory.initElements(driver, FileUpload.class);
        fileUpload.FileUploadVerification();

        logger.info("Log: File_Upload_Page Action : Verify File Uploaded");
        Reporting.capture_ScreenShot(getClass().getSimpleName().substring(0,5) + "Verify_File_Uploaded");

    }


}

