package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// is_selected() 
		  // q1 --- false 
		  WebElement isSelected_radioB  = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)")); 
		  boolean q1 = isSelected_radioB.isSelected(); 
		  System.out.println(q1);
		  
		  
	}

}
