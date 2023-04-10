package org.saucedemo.test2.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.saucedemo.test2.driver.DriverOptionProvider.*;

public class DriverFactory {
    public static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getChromeOptions());
    }

    public static WebDriver createEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver(getEdgeOptions());
    }

    public static WebDriver createSafariDriver() {
        return new SafariDriver(getSafariOptions());
    }

    public static WebDriver createDriver(DriverType driverType) {
        switch (driverType) {
            case CHROME:
                return createChromeDriver();
            case EDGE:
                return createEdgeDriver();
            case SAFARI:
                return createSafariDriver();
            default:
               return createChromeDriver();
               //throw new UnsupportedBrowserException("Unsupported browser name: " + driverType);
        }
    }
}