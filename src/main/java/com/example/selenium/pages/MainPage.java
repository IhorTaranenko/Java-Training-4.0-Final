package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends com.example.selenium.pages.BasePage {

    @FindBy (css="h2")
    private static WebElement titleLocator; //private static By titleLocator = By.cssSelector("h2");
    @FindBy (css=".radius")
    private WebElement logoutLocator; //private By logoutLocator = By.linkText("Logout");

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); //Not needed if using By
    }

    public static String getTitle() {
        return titleLocator.getText(); //return driver.findElement(titleLocator).getText();
    }

    public MainPage clickLogout() {
        logoutLocator.click(); //driver.findElement(logoutLocator).click();
        return this;
    }
}