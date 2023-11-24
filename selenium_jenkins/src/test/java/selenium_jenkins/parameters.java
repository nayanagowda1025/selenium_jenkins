package selenium_jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parameters {
	WebDriver driver;
	@Test
	public void parameterized()
	{
		String browser=System.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			Reporter.log("executed with chrome",true);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			Reporter.log("executed with firefox",true);
		}
			

}
}
