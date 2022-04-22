package tttfg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fgmk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		System.out.print(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		//gygh
//driver.close();
//System.exit(0);
	}

}
