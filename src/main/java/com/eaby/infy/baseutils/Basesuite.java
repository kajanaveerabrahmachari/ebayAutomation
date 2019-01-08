package com.eaby.infy.baseutils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eaby.infy.browserfactory.BrowserFactory;
import com.eaby.infy.loadproperties.LoadProperties;




public class Basesuite {
	public static WebDriver driver;
	
	


	public WebDriver Webdriverintialization() {
		if (driver == null) {
			try {
				driver = BrowserFactory.getbrowser(AppConstants.BROWSER);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.get(LoadProperties.getdesiredProperty(AppConstants.URL));
		return driver;
	}

	public static void captureScreenShot() {
		File file = new File(System.getProperty("user.dir") + "/ScreenShots/");
		if (!file.exists()) {
			file.mkdirs();
		}
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,
					new File(file.getAbsolutePath() +"/"+ System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void javaScriptClick(WebElement webelement) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", webelement);
	}
	public static void implicitlyWait(){
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	public void quit(){
		driver.quit();
	}
	public void close(){
		driver.close();
	}
	


}
