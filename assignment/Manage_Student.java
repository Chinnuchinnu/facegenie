package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Manage_Student {

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
		Actions a=new Actions(driver);
		WebElement job=	driver.findElement(By.xpath("//span[text()='Manage Student']"));
		a.moveToElement(job).build().perform();
		job.click();
		driver.close();
	}

}
