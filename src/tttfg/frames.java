package tttfg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32_95\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.switchTo().frame("classFrame");
		
	driver.findElement(By.linkText("Deprecated")).click();
	//driver.close();
	driver.navigate().to("http://jsbin.com/usidix/1");
	driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
		

	}

}
