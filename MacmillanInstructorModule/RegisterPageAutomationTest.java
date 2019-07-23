package SendMavenEmail.MacmillanInstructorModule;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import SendMavenEmail.MacmillanInstructorModule.XpathClass;

public class RegisterPageAutomationTest extends XpathClass {

	@BeforeTest
	public void launchdriver() throws InterruptedException {
		RegisterPageAutomationTestAction.launch();
	}

	@Test
	public void Test01Clickonsignin() throws InterruptedException {
		RegisterPageAutomationTestAction.signin();
	}
	
	  @Test public void Test02CreateAccount() throws InterruptedException {
	  RegisterPageAutomationTestAction.createaccount(); }
	 
	
	  @Test public void Test03FillDetails() throws InterruptedException {
	  RegisterPageAutomationTestAction.details(); }
	
	  @Test public void Test04SecurityquestionNo1() throws InterruptedException {
	  RegisterPageAutomationTestAction.securityques1(); }
	  
	  @Test public void Test05SecurityquestionNo2() throws InterruptedException {
	  RegisterPageAutomationTestAction.securityques2();
	  
	  }
	  
	  @Test public void Test06SecurityquestionNo3() throws InterruptedException {
	  RegisterPageAutomationTestAction.securityques3(); }
	  
	  @Test public void Test07FillDetails() throws InterruptedException {
	  
	  RegisterPageAutomationTestAction.filldetails(); }
	  
	  @AfterTest public void Test08CheckBoxClicking() throws InterruptedException {
	  RegisterPageAutomationTestAction.checkboxes(); }
	 
}
