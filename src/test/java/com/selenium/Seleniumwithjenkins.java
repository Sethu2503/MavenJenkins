/*

Author - Sethu
 */

package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Seleniumwithjenkins {

    @Test(description = "TestSummary")
    public void TitleCheck() {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("Browser is opened");
        driver.get("https://www.amazon.in/");
        String title = driver.getTitle();

        Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title, "Incorrect");


        driver.close();
    }

}
