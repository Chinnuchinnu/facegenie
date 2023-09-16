package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class Dashboard {

	 public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harish\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/form[2]/button")).click();
		Thread.sleep(2000);
		Select obj=new Select(driver.findElement(By.xpath("//div[text()='1234']")));
		obj.selectByVisibleText("1234");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/main/div[2]/div/div/div/div[3]/div[2]/button"))
				.click();
		driver.close();
	}
}


