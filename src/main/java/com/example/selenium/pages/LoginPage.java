package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends com.example.selenium.pages.BasePage {

    @FindBy (id = "username")
    private WebElement usernameLocator; //By usernameLocator = By.id("username");
    @FindBy (id = "password")
    private WebElement passwordLocator; //By passwordLocator = By.id("password");
    @FindBy (css = ".radius")
    private WebElement loginLocator; //By loginLocator = By.cssSelector(".radius");

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); ////Not needed if using By
    }

    public LoginPage setUsername(String text) {
        usernameLocator.sendKeys(text); //driver.findElement(usernameLocator).sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        passwordLocator.sendKeys(text); //driver.findElement(passwordLocator).sendKeys(text);
        return this;
    }

    public com.example.selenium.pages.MainPage clickLogin() {
        loginLocator.click(); //driver.findElement(loginLocator).click();
        return new com.example.selenium.pages.MainPage(driver);
    }
}