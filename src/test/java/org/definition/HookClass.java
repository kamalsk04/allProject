package org.definition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.runner.*;

import cucumber.api.Scenario;
import io.cucumber.java.*;

public class HookClass extends BaseClass {
	
	@Before
	public void beforeScenario() {
		
		System.out.println("---------before----------");
	}

	
	
	
	
	@After
	private void afterscenario(Scenario sc) {
		
		
			if(sc.isFailed()) {
				TakesScreenshot tk= (TakesScreenshot)driver;
				byte[] b = tk.getScreenshotAs(OutputType.BYTES);
				sc.embed(b, "image/png");
					
				

			}
			quit();

	
	
	}
	
	
}
