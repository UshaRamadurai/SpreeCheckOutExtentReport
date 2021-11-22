package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

    @FindBy(id="link-to-login")
    private WebElement loginLink;

    @FindBy(id="spree_user_email")
    private WebElement userEmail;

    @FindBy(id="spree_user_password")
    private WebElement userPassword;

    @FindBy(css ="[name='commit']")
    private WebElement loginButton;

    public LoginPage1(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void login1(String email, String pwd){
        loginLink.click();
        userEmail.sendKeys(email);
        userPassword.sendKeys(pwd);
        loginButton.click();

    }
}
