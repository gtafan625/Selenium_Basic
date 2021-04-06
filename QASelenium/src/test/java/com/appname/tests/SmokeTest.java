package com.appname.tests;

import static org.testng.Assert.assertEquals;

import java.awt.TrayIcon.MessageType;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;
import org.testng.asserts.SoftAssert;


public class SmokeTest {

	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	WebDriverWait wait;
	String username = "standard_user";
	String password = "secret_sauce";
	int waittime = 2000;
	
	
	
}
