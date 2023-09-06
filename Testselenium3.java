package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver","C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 	
		
		
		
		
		// is_displayed() 
		  // q1 ----- true 
		  WebElement header =driver.findElement(By.cssSelector("#main-header > h1")); 
		  if(header.isDisplayed()) {  
			   System.out.println("Test case pass");  
			   }
			  	else { 
			  		System.out.println("Test case fail");
			  	}   
		   
		 
		  // is_selected() 
		  // q2 ------false 
		   
		  WebElement notselected_checkerB = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]")); 
		  boolean q2 = notselected_checkerB.isSelected(); 
		  System.out.println(q2); 

		  // q3 --- false 
		  WebElement notselected1_checkerB  = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]")); 
		  boolean q3 = notselected1_checkerB.isSelected(); 
		  System.out.println(q3); 
		  
		   
		  // is_selected() 
		  // q4 --- true 
		  WebElement isSelected_checkerB  = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]")); 
		  boolean q4 = isSelected_checkerB.isSelected(); 
		  System.out.println(q4);
		  
		  //q5--- FALSE
		 WebElement isSelected_checkerc  = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]")); 
		  boolean q5 = isSelected_checkerc.isSelected(); 
		  System.out.println(q5);
				  
				  
	}

}
