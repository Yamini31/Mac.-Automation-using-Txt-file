package SendMavenEmail.MacmillanInstructorModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageAutomationTestAction extends GetPage{

	public static void launch() {
		launchbrowser();
	    getDriver("https://" + TxtFileRead.getValues(driver,"url","Data.txt"));
	}

	public static void signin() throws InterruptedException {
	TxtFileRead.getElement(driver,"signin","Data.txt").click();
	waiting(2000);
	}

	
	  public static void createaccount() throws InterruptedException {
	  TxtFileRead.getElement(driver,"createacc","Data.txt").click();
	  waiting(2000); }
	 
	
	  public static void details() throws InterruptedException {
	  
	  TxtFileRead.getElement(driver,"firstname","Data.txt").sendKeys("test");
	  waiting(2000);
	  
	  TxtFileRead.getElement(driver,"lastname","Data.txt").sendKeys("demo");
	  waiting(2000);
	  
	  TxtFileRead.getElement(driver,"email","Data.txt").sendKeys("testdemo160719+04@gmail.com");
	  waiting(2000);
	  TxtFileRead.getElement(driver,"pass","Data.txt").sendKeys("Password@123");
	  waiting(2000);
	  TxtFileRead.getElement(driver,"confirmpass","Data.txt").sendKeys("Password@123");
	  waiting(2000);
	  
	  }
	  
	
	  public static void securityques1() throws InterruptedException {
	  
	  WebElement element = TxtFileRead.getElement(driver,"secques1","Data.txt");
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(element).build().perform();
	  
	  TxtFileRead.getElement(driver,"ques1","Data.txt").click();
	  
	  waiting(2000);
	  TxtFileRead.getElement(driver,"answer1","Data.txt").sendKeys("qaz");
	  waiting(2000);
	  
	  }
	  
	  public static void securityques2() throws InterruptedException {
	 
	  Select ques2 = new Select(TxtFileRead.getElement(driver,"secques2","Data.txt"));
	  ques2.selectByVisibleText(TxtFileRead.getValues(driver,"vistext2","Data.txt"));
	  TxtFileRead.getElement(driver,"answer2","Data.txt").sendKeys("qaz"); 
	  waiting(2000);
	  
	  }
	  
	  public static void securityques3() throws InterruptedException { 
		  
	  Select ques3=new Select(TxtFileRead.getElement(driver,"secques3","Data.txt"));
	  ques3.selectByVisibleText(TxtFileRead.getValues(driver,"vistext3","Data.txt"));
	  TxtFileRead.getElement(driver,"answer3","Data.txt").sendKeys("qaz"); 
	  waiting(2000);
	  
	  }
	  
	  public static void filldetails() throws InterruptedException {
		  
	  TxtFileRead.getElement(driver,"college","Data.txt").sendKeys("Fortis College"); 
	  Thread.sleep(1000);
	  
	  TxtFileRead.getElement(driver,"selectfromdropdown","Data.txt").click();
	  waiting(2000); 
	  }
	  
	  public static void checkboxes() throws InterruptedException {
	  
	  WebElement tcCheckbox1 = TxtFileRead.getElement(driver,"checkbox1","Data.txt");
	  tcCheckbox1.click();
	  
	  WebElement tcCheckbox2 = TxtFileRead.getElement(driver,"checkbox2","Data.txt");
	  tcCheckbox2.click();
	  
	  TxtFileRead.getElement(driver,"signup","Data.txt").click();
	  waiting(2000);
	  
	  }
	 
	 
}
