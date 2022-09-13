package BaseClasses;

import com.paulhammant.ngwebdriver.NgWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static WebDriver driver;
    public static Properties prop = new Properties();

    @BeforeSuite
    public void setupFolder() {
        Reporting.writeRequestAndResponse();
    }


    @Parameters({"browser.name"})
    @BeforeSuite

    public void beforeMethod(@Optional("chrome") String browser ) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();

            //Maximize the browser
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {

        } else if (browser.equalsIgnoreCase("edge")) {

        } else if (browser.equalsIgnoreCase("safari")) {

        } else if (browser.equalsIgnoreCase("chrome-headless")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox-headless")) {
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary(firefoxBinary);
            driver = new FirefoxDriver(options);

        } else {
            System.exit(-1);
        }

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        NgWebDriver ngWebDriver = new NgWebDriver(jsDriver);
        driver.manage().window().maximize();
        ngWebDriver.waitForAngularRequestsToFinish();

        setup_file();

        create_Folder();
    }

    @BeforeSuite
    public void navigate_to_url() {
            driver.navigate().to(StaticData.BASE_URL);
            System.out.println();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private void setup_file() {
        try {
            prop.load(new FileInputStream("./src\\test\\Utill\\txtData.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void create_Folder()
    {
        Reporting.writeRequestAndResponse();
    }

    @AfterSuite
    public void afterSuite() {
       //driver.quit();
    }

}
