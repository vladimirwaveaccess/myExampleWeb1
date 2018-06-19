package com.it.Pages;

import com.it.Common.Constants;
import com.it.Drivers.DriverFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected Logger log = LogManager.getLogger(this.getClass());
    protected static WebDriver driver = DriverFactory.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
