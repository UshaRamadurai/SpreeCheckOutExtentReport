package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage1 {
    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    private WebElement radioButtonCheck;

    @FindBy(name = "commit")
    private WebElement buttonSaveAndContinue;

    public PaymentPage1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickCheck(){
        radioButtonCheck.click();
    }
    public void clickSaveAndContinue(){
        buttonSaveAndContinue.click();
    }
}
