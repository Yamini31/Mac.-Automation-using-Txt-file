package SendMavenEmail.MacmillanInstructorModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TxtFileRead {
	static String locatorValue="";
	static String locatorType="";

	public static String getLocatorValue(WebDriver driver,String locatorName, String fileName) {
	
		StringBuilder contents = new StringBuilder();
		
		  String file = "/home/qainfotech/eclipse-workspace/MacmillanInstructorModule"; 
		  File filePath = new File(file + File.separator +"Data.txt");
		  System.out.println(filePath);
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String s;

			while ((s = br.readLine()) != null) {
				contents.append(s);
				contents.append("->");
			}

		} catch (IOException e) {
			System.out.println("Cannot read the text file");
		}
		return contents.toString();
		
		}
	
	
public static WebElement getElement(WebDriver driver, String locator, String fileName) {
		
	String data = TxtFileRead.getLocatorValue(driver,locator, fileName);
	String[] dataArray = data.split("->");
	
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i].split(":")[0].equalsIgnoreCase(locator)) {
				locatorType=dataArray[i].split(":")[1];
				locatorValue=dataArray[i].split(":")[2];
				
			}
		}
		if(locatorType.equals("css")) {
			return driver.findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		}
	    else if(locatorType.equals("id")) {
		    return driver.findElement(By.id(locatorValue));
	    }
	    else {
		    return driver.findElement(By.className(locatorValue));
	    }
	}
	

public static String getValues(WebDriver driver, String locator, String fileName) {
	
	String data = TxtFileRead.getLocatorValue(driver,locator, fileName);
	String[] dataArray = data.split("->");
	
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i].split(":")[0].equalsIgnoreCase(locator)) {
				locatorType=dataArray[i].split(":")[1];
				locatorValue=dataArray[i].split(":")[2];
				
			}
		}
			
	if(locatorType.equals("value")) {
		return locatorValue;
	}else
		return null;

}
}
