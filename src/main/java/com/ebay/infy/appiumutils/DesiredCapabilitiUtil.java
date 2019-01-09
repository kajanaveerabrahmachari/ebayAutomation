package com.ebay.infy.appiumutils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.eaby.infy.loadproperties.LoadProperties;



public class DesiredCapabilitiUtil {
		public static DesiredCapabilities capabilities = null;
		public static RemoteWebDriver driver;
		public static String HubAddress;
		public static String portNumber;

		public static WebDriver getdriver() {
			try{
				
				HubAddress=LoadProperties.getdesiredProperty("HUBADDRESS");
				String PortNumber=LoadProperties.getdesiredProperty("PORTNUMBER");
				portNumber = String.valueOf(PortNumber);
				try {
					driver = new RemoteWebDriver(new URL("http://"+HubAddress+":"+portNumber+"/wd/hub"),getDesiredCapabilities());
					return driver;
				} catch (MalformedURLException m) {
					return driver;
				}
			}catch(Exception e){
				
			}
			return driver;
			
		}

		

		public static DesiredCapabilities getDesiredCapabilities() {
			try{
				capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
				capabilities.setCapability("deviceName",LoadProperties.getdesiredProperty("deviceName") );
				capabilities.setCapability("platformVersion",LoadProperties.getdesiredProperty("platformVersion"));
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("appPackage",LoadProperties.getdesiredProperty("androidapp_package"));
				capabilities.setCapability("appActivity",LoadProperties.getdesiredProperty("androidapp_activity"));
				capabilities.setCapability("newCommandTimeout",500000);
				capabilities.setCapability("autoAcceptAlerts", true);
				capabilities.setCapability("autoDismissAlerts", true);
				return capabilities;
			}catch(Exception e){
				e.printStackTrace();
			}
			return capabilities;
			
		}

}
