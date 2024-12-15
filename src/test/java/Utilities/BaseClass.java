package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseClass {


    public static WebDriver driver;   // declared the driver object


    @BeforeMethod
    public static WebDriver getDriver(){
        if(driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "edge-private":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--inprivate");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                case "chrome-incognito":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--incognito");
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
            driver.get(ConfigurationReader.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.implicitlyWaitTime));
            PageInitializer.initialize();
        }
        return driver;
    }


    @AfterMethod
    public void methodName() {
        if(driver != null){
            driver.close();
            driver = null;
        }
    }







}