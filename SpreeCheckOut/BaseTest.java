package org.vapasi.SpreeCheckOut;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public ExtentReports extent;

    @BeforeClass
    public void initExtentReport(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
        reporter.config().setDocumentTitle("Spree Project");
        reporter.config().setReportName("Check out functionality");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

    }
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
}
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}