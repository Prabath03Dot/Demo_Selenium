package BaseClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static BaseClasses.StaticData.folderPath2;

public class Reporting extends TestBase{

    public static String writeRequestAndResponse() {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");

        String currentDateTime = format.format(date);

        String folderPath = "./src\\test\\Utill\\images" + "_LastRunOn_"
                + currentDateTime;

        folderPath2=folderPath;

        File theDir = new File(folderPath);

        // if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try {

                theDir.mkdirs();
                result = true;
            } catch (SecurityException se) {
                // handle it
                System.out.println(se.getMessage());
            }
            if (result) {
                System.out.println("Reporting created");
            }
        } else if (theDir.exists()) {

            System.out.println("Reporting exist");
        }

        return  folderPath2;
    }


    public static void capture_ScreenShot(String imageIdentificationName) {
        String location=folderPath2+"\\";
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

        TakesScreenshot ts = (TakesScreenshot) driver;

        //Capture screenshot as output type FILE
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            //Save the screenshot taken in destination path
            FileUtils.copyFile(file, new File(location + timeStamp + "_" + imageIdentificationName + ".png"));

            System.out.println(" Screenshot is taken" );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
