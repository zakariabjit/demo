package mytest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
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
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void getResult() throws IOException {


    }
    @AfterClass
    public void Afterclass(){
        driver.quit();
    }
}
