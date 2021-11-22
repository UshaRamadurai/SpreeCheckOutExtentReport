package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderPage1 {
    @FindBy(css = "div.alert.alert-notice")
    private WebElement orderSuccessMessage;

    public OrderPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String verifyOrderSuccessMessage(){

        String orderMessage=orderSuccessMessage.getText();
        return orderMessage;

    }



}
