package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage1{
    @FindBy(name = "commit")
    private WebElement buttonSaveAndContinue;

    public DeliveryPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickSaveAndContinue(){
       buttonSaveAndContinue.click();
    }
}
