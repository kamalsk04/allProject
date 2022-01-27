package org.runner;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.baseclass.JVMReoprt;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

import cucumber.api.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.definition",
               dryRun=false,
               plugin= {"pretty",
//            		   "html:src\\test\\resources\\Reports",
            		   "json:src\\test\\resources\\Reports\\jsonReport.json",
//            		   "junit:src\\test\\resources\\Reports\\junitReport.xml"
            		   
               },
               
               monochrome=true)

public class TestRunner extends BaseClass{
	
	
@AfterClass
public static void report() throws IOException {
		

	JVMReoprt.generateJVMReport("src\\test\\resources\\Reports\\jsonReport.json");
	
	takesScreenShot("E:\\Users\\Kamal\\eclipse-workspace\\TargetEcommerce\\src\\test\\resources\\Reports\\Screenshot");

}


}
