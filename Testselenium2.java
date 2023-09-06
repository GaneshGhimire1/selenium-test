package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (expectedTitle.endsWith(actualTitle)) {
			System.out.println("Test case 1 pass");

		} else {
			System.out.println("Test case 1 fail");
		}

	}
	}


