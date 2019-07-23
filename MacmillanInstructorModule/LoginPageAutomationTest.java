package SendMavenEmail.MacmillanInstructorModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageAutomationTest extends XpathClass{


     @BeforeTest
	public void Test1LaunchDriver() throws InterruptedException {
    	 LoginPageTestAction.launching();
	}

	@Test
	public void Test2Clickonsignin() throws InterruptedException {
		LoginPageTestAction.signoptionclick();
	}

	@Test
	public void Test3Username() throws InterruptedException {

		LoginPageTestAction.username();

	}

	@Test
	public void Test4Password() throws InterruptedException {

		LoginPageTestAction.password();

	}

	@Test
	public void Test5() throws InterruptedException {

		LoginPageTestAction.loginbtn();
	}

}
