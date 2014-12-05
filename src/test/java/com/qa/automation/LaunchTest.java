package com.qa.automation;

import org.junit.Test;

/**
 * Created by Srikanth on 12/5/14.
 */
public class LaunchTest {

    @Test
    public void testCommand(){
        System.out.println(System.getProperty("platformType"));
        System.out.println(System.getProperty("platformVersion"));
    }
}
