package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage1 {
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement firstName;

    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement lastName;

    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement address1;

    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement city;

    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement state;

    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement zipcode;

    @FindBy(id = "order_bill_address_attributes_country_id")
    private WebElement country;

    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement phone;

    @FindBy(id = "save_user_address")
    private WebElement checkBoxSaveUserAddress;

    @FindBy(name = "commit")
    private WebElement buttonSaveAndContinue;

    public AddressPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterAddressDetails(){
        firstName.sendKeys("Sathish");
        lastName.sendKeys("Kumar");
        address1.sendKeys("No:81,SIP Avenue");
        city.sendKeys("New Jersey");
        WebElement stateDropDown =state;
        Select selectState = new Select(stateDropDown);
       selectState.selectByVisibleText("New Jersey");
       zipcode.sendKeys("07303");
        WebElement countryDropDown =country;
        Select selectCountry = new Select(countryDropDown);
     selectCountry.selectByVisibleText("United States of America");
     phone.sendKeys("2904019580");
    }
    public void clickSaveAndContinue(){
        checkBoxSaveUserAddress.click();
        buttonSaveAndContinue.click();
    }
}
