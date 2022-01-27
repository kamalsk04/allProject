package org.baseclass;

	
	import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Output;

	public class BaseClass {
		
		  
	public static WebDriver driver;
	
	
	public static void browser(String browserName) {
		
		if (browserName.startsWith("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	 			
		}
		
		else if (browserName.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			 driver=new EdgeDriver();
			
		}
		
		else {
			WebDriverManager.chromedriver().setup();
			 driver=new FirefoxDriver();
		}
		

	}
		
		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	       return driver;
		}
	       
	    public static void urlLanunch(String url) {
	      driver.get(url);
		}       
	      
	    
	    public static void impWait(int sec) {
	    driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    	
		}
	      
	    
	    public static String getCurrenturl() {
	   String currentUrl = driver.getCurrentUrl();
	   return currentUrl;
	    	
		}
	      
	    public static void sendKeys(WebElement e,String data) {
	    e.sendKeys(data);
		}
	    
	    
	    public static void findelement(WebElement e,String a) {
	    
	    	 e.findElement(By.id(a));
	    	
		}
	    
	    
	    public static void quit()
	    {
	    	driver.quit();
	    }
	       
	       
	    public static void dragAndDrop(WebElement from,WebElement to) {

	    	Actions a=new Actions(driver);
	    	a.dragAndDrop(from, to).perform();
	    
	    	
	    	   	
		}
	       
	       public static void actionClick(WebElement e) {
			Actions a =new Actions(driver);
			a.click(e).perform();
			
		}
	       
	       public static void selectByIndex(WebElement e,int Index) {

	    	   Select s=new Select(e);
	    	   s.selectByIndex(Index);
		}
	             
	       public static void takesScreenShot(String imagename) throws IOException {
	    	   
	    	   TakesScreenshot tk=(TakesScreenshot)driver;
	    	   File src = tk.getScreenshotAs(OutputType.FILE);
	    	   File des=new File(System.getProperty("user.dir")+"src\\test\\resources\\Screenshots\\"+imagename);
	    	   FileUtils.copyFile(src, des);
	       }
	       
	       
	     	  
	       
	       
	       
			  }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	


