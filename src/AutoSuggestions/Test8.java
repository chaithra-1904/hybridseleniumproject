package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		s.selectByValue("199");
		//s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	
		
		List<WebElement> opt=s.getAllSelectedOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt)
		{
			System.out.println(b.getText());
		}
		
		s.deselectByIndex(1);
		s.deselectByValue("199");
	}

}
