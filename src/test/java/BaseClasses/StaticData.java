package BaseClasses;

import org.openqa.selenium.WebDriver;

//Able to store and create static data for the current session

public class StaticData {
    public static WebDriver driver;
    public static String folderPath2 = "";
    public static String CompanyName ="";
    public static String SuperAdminEmail ="nirmal_s@epiclanka.net";
    public static String SubscriptionStartDate ="";
    public static String SubscriptionEndDate ="";

    //public static final String BASE_URL = "https://beta.doxprospaces.com/welcome";
    //public static final String BASE_URL = "http://159.138.83.4:8080/welcome";
    public static final String BASE_URL = "https://the-internet.herokuapp.com/";
    public static final String MAILINATOR_URL = "https://www.mailinator.com/";



}
