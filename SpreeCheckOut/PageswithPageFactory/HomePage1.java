package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
    @FindBy(linkText ="Bags")
    private WebElement category;

    @FindBy(css = "[title='Ruby on Rails Tote']")
    private WebElement product;

    public HomePage1(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void clickCategory() {
        category.click();
    }
    public void clickProduct(){
        product.click();
    }
}
