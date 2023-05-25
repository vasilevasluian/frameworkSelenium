package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.saucedemo.test2.driver.DriverManager;
import org.saucedemo.test2.pages.LogInPage;
import org.saucedemo.test2.utils.ConfigReader;


public class LogInSteps {

    static ConfigReader configReader = ConfigFactory.create(ConfigReader.class);
    LogInPage logInPage= new LogInPage(DriverManager.getDriverManagerInstance().getDriver());
    @Given("Open app page")
    public void open_app_page() throws InterruptedException {
        Thread.sleep(5000);
        DriverManager.getDriverManagerInstance().getDriver().navigate().to(configReader.getBaseUrl());
    }
    @When("Enter credentials and press LogIn button")
    public void enter_credentials_and_press_log_in_button() {
        logInPage.usernameField.sendKeys("standard_user");
        logInPage.passwordField.sendKeys("secret_sauce");
        logInPage.logInButton.click();

    }
    @Then("User are logged in")
    public void user_are_logged_in() {
        Assertions.assertTrue(logInPage.productPageLogo.isDisplayed());
    }
}
