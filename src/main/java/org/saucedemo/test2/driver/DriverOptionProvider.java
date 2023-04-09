package org.saucedemo.test2.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariOptions;

public class DriverOptionProvider {
    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--incognito");
        return chromeOptions;
    }

    public static EdgeOptions getEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("disable-popup-blocking");
        edgeOptions.addArguments("inprivate");
        return edgeOptions;
    }

    public static SafariOptions getSafariOptions() {
        SafariOptions safariOptions = new SafariOptions();
        safariOptions.setAutomaticInspection(true); //private mode
        return safariOptions;
    }
}