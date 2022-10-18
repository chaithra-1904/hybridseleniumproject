package WindowMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 
	//maximize
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ref=nav_logo");
	
	//fullscreen
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
	
	//minimize
    Thread.sleep(3000);
    driver.manage().window().minimize();

	}

}
