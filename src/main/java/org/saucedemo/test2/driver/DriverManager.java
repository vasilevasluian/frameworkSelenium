package org.saucedemo.test2.driver;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.saucedemo.test2.utils.ConfigReader;

import static org.saucedemo.test2.driver.DriverFactory.createDriver;

public class DriverManager {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);

    private final WebDriver driver;
    private static DriverManager driverManagerInstance;

    private DriverManager() {
        this.driver = createDriver(configReader.getBrowser());
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public static DriverManager getDriverManagerInstance() {
        if (driverManagerInstance == null) {
            driverManagerInstance = new DriverManager();
        }
        return driverManagerInstance;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}