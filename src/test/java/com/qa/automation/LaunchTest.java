package com.qa.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Srikanth on 12/5/14.
 */
public class LaunchTest {

    @Test
    public void testCommand() throws Exception{
        //System.out.println(System.getProperty("platformType"));
        //System.out.println(System.getProperty("platformVersion"));
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName",System.getProperty("platformType"));
        capabilities.setCapability("platformVersion",System.getProperty("platformVersion"));
        capabilities.setCapability("deviceName",System.getProperty("deviceName"));
        capabilities.setCapability("udid",System.getProperty("deviceUDID"));
        capabilities.setCapability("bundleId","com.shopkick.debug-qa");
        AppiumDriver driver= new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);

    }
}
