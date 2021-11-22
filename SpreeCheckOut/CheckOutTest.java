package org.vapasi.SpreeCheckOut;

import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.vapasi.Reports.Utils.Screenshot;
import org.vapasi.SpreeCheckOut.PageswithPageFactory.*;

import java.io.File;
import java.io.IOException;

import static org.vapasi.Reports.Utils.Screenshot.takeScreenshot;


public class CheckOutTest extends BaseTest{
    @Test
    public void testCheckOut() {
        ExtentTest test=extent.createTest("CheckOut Testcase");
        LoginPage1 loginPage = new LoginPage1(driver);
        HomePage1 homePage= new HomePage1(driver);
        ProductPage1 productPage = new ProductPage1(driver);
        CartPage1 cartPage = new CartPage1(driver);
        AddressPage1 addressPage = new AddressPage1(driver);
        DeliveryPage1 deliveryPage = new DeliveryPage1(driver);
        PaymentPage1 paymentPage = new PaymentPage1(driver);
        OrderPage1 orderPage = new OrderPage1(driver);

        loginPage.login1("test21@gmail.com","testpassword");
        homePage.clickCategory();
        homePage.clickProduct();
        productPage.enterQuantity("2");
        productPage.clickAddToCart();
        Assert.assertEquals(cartPage.getCartValue(),"$31.98");
        test.info("Product added to the cart");
        cartPage.clickCheckOut();
        addressPage.enterAddressDetails();
        addressPage.clickSaveAndContinue();
        deliveryPage.clickSaveAndContinue();
        paymentPage.clickCheck();
        paymentPage.clickSaveAndContinue();
        Assert.assertEquals(orderPage.verifyOrderSuccessMessage(),"Your order has been processed successfully");
        test.info("Order successful");
        extent.flush();
    }
    @Test
    public void testFail() throws IOException {
        ExtentTest test1=extent.createTest("AddToCart Testcase");
        LoginPage1 loginPage = new LoginPage1(driver);
        HomePage1 homePage= new HomePage1(driver);
        ProductPage1 productPage = new ProductPage1(driver);
        CartPage1 cartPage = new CartPage1(driver);

        loginPage.login1("test21@gmail.com","testpassword");
        homePage.clickCategory();
        homePage.clickProduct();
        test1.info("User in Home page");
        productPage.enterQuantity("2");
        productPage.clickAddToCart();
        test1.info("user clicks add to cart");
        try {
            Assert.assertEquals(cartPage.getCartValue(), "$32.98");
        }
        catch (AssertionError e){
            test1.fail(e.getMessage());
            test1.addScreenCaptureFromPath("./snaps/"+ takeScreenshot(driver));
        }
        cartPage.clickCheckOut();
        extent.flush();
    }


}
