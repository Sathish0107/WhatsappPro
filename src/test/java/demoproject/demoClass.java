package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoClass {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.close();
	}

}
