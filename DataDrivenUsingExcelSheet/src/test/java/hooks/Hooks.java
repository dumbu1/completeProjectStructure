package hooks;

import io.cucumber.java.Before;
import utility.DriverManager;

public class Hooks {
	
	@Before(order = 0)
	public void openBrowserAndUrl() {
		DriverManager.openUrl();
	}

}
