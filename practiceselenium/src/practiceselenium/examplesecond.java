package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplesecond {
	public static void main(String[] args) {
	          //upcasting
		WebDriver driver = new ChromeDriver();
	
		//maximize window
		driver.manage().window().maximize();
		
		// to fetch the url
		driver.get("https://www.facebook.com/");
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		//get title
		System.out.println(driver.getTitle());
		
		//navigation
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
