package mytest;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public void classLevelSetup() throws IOException {

    /*    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(ChromeOptions.CAPABILITY, options);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new FirefoxDriver(options);*/
        driver=new FirefoxDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void getResult() throws IOException {
       driver.close();

    }
    @AfterClass
    public void Afterclass(){
        driver.quit();
    }
}
