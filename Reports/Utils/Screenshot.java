package org.vapasi.Reports.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.vapasi.SpreeCheckOut.BaseTest;

import java.io.File;
import java.io.IOException;

public class Screenshot  {
    public static String takeScreenshot(WebDriver driver) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("Reports/snaps/spreeScreenshot.png");
String img = "spreeScreenshot.png";
        FileUtils.copyFile(srcFile, destFile);
        return img;
    }

}
