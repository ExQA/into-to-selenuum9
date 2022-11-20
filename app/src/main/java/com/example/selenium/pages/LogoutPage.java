package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage extends BasePage{
    @FindBy(how = How.CSS, using = ".icon-2x")
    private WebElement logOut;

    @FindBy(how = How.CSS, using = "h2")
    private WebElement SecureArea;


    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public LogoutPage clickLogOut() {
        logOut.click();
        return this;
    }

    public LogoutPage checkSecureArea() {
        SecureArea.getText();
        System.out.println(SecureArea.getText());
        return this;
    }

}
