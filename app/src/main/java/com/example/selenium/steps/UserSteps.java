package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.LogoutPage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;


public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    LogoutPage logoutPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }
    public UserSteps login(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();
        return this;
    }

    public UserSteps checkSecureArea (String expected) {
        logoutPage = new LogoutPage(driver);
        assertEquals(logoutPage.checkSecureArea(), "Secure Area");
        return this;
    }

    public UserSteps logOut () {
        logoutPage = new LogoutPage(driver);
        logoutPage.clickLogOut();
        return this;
    }


}
