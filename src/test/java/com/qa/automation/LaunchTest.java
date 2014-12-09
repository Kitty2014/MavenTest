package com.qa.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Srikanth on 12/5/14.
 */
public class LaunchTest {

    @Test
    public void testCommand() throws Exception{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName",System.getProperty("platformType"));
        capabilities.setCapability("platformVersion",System.getProperty("platformVersion"));
        capabilities.setCapability("deviceName",System.getProperty("deviceName"));
        capabilities.setCapability("udid",System.getProperty("deviceUDID"));
        capabilities.setCapability("bundleId","com.shopkick.debug-qa");
        AppiumDriver driver= new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElementsByClassName("UIAButton").get(2).click(); //Next on Deals
        driver.findElementsByClassName("UIAButton").get(3).click(); //Select Country USA
        driver.findElementsByClassName("UIAButton").get(4).click(); //Next on Country Picker
        driver.findElementsByClassName("UIAButton").get(3).click(); //Next on Walkin
        driver.findElementsByClassName("UIAButton").get(2).click(); //Next on Rewards
        driver.findElementsByClassName("UIAButton").get(2).click(); //Next on Rewards Picker
        driver.findElementsByClassName("UIAButton").get(3).click(); //Signup on LoginFlow
        driver.findElementsByClassName("UIAButton").get(4).click(); //Click on Email Login
        driver.findElementsByClassName("UIATextField").get(0).sendKeys("srikanth.vejendla@yahoo.com"); //Set UserName
        Thread.sleep(1000);
        driver.findElementsByClassName("UIASecureTextField").get(0).sendKeys("satyam123$"); //Set Password
        driver.findElementsByClassName("UIAButton").get(3).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();  //Close Window
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        driver.scrollTo("Settings");
        driver.findElementByName("Settings").click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")).click();
        driver.quit();
    }
}
