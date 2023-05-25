package steps.hooks;


import io.cucumber.java.After;
import org.saucedemo.test2.driver.DriverManager;

public class Hooks {

    @After
    public void closeDriver(){
        DriverManager.getDriverManagerInstance().quitDriver();

    }
}