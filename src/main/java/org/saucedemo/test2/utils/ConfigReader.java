package org.saucedemo.test2.utils;

import org.aeonbits.owner.Config;
import org.saucedemo.test2.driver.DriverType;

@Config.Sources("classpath:config.properties")
public interface ConfigReader extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    @ConverterClass(DriverTypeConverter.class)
    DriverType getBrowser();

    @Key("chromeDriver")
    String getChromeDriver();

    @Key("baseUrl")
    String getBaseUrl();

}