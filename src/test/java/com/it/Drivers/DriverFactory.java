package com.it.Drivers;

import com.it.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    static public WebDriver getDriver(){
        WebDriver driver = null;

        String name = System.getProperty("driver");
        if ("firefox".equals(name)){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if ("edge".equals(name)){
            System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else if ("ie".equals(name)){
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(Constants.BASE_URL);
        return driver;
    }


}
