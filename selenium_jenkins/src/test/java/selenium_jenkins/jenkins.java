package selenium_jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkins {
	@Test
	public void demo()
	{
		Reporter.log("executed in jenkins",true);
	}

}
