package org.saucedemo.test2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement logInButton;

    @FindBy(css = "div[class='app_logo']")
    public WebElement productPageLogo;

    public LogInPage(WebDriver driver) {
        super(driver);
    }
}
