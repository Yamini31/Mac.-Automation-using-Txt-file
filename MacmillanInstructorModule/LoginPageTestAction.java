package SendMavenEmail.MacmillanInstructorModule;

public class LoginPageTestAction extends GetPage {

	
	public static void launching() {
		launchbrowser();
		getDriver("https://" + TxtFileRead.getValues(driver,"url","Data.txt"));
	}
	
	public static void signoptionclick() throws InterruptedException
	{
		TxtFileRead.getElement(driver,"signin","Data.txt").click();
		waiting(2000);
	}
	
	public static  void username() throws InterruptedException
	{
		 TxtFileRead.getElement(driver,"user","Data.txt").sendKeys("testdemo");
		waiting(2000);
	}
	
	public static void password() throws InterruptedException
	{
		 TxtFileRead.getElement(driver,"passwo","Data.txt").sendKeys("testdemo");
		waiting(2000);

	}
	public static void loginbtn() throws InterruptedException {
		TxtFileRead.getElement(driver,"loginbutton","Data.txt").click();
		waiting(2000);
	}
	
	
	
}
