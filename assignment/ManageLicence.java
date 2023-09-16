package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageLicence {

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
		driver.findElement(By.xpath(
				"//div[@class=\"MuiListItemButton-root MuiListItemButton-gutters Mui-selected MuiButtonBase-root css-2poxpl\"]"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[1]/div[2]/div[4]/button"))
				.click();
		driver.findElement(By.name("empId")).sendKeys("001");
		driver.findElement(By.name("firstName")).sendKeys("Sravani");
		driver.findElement(By.name("lastName")).sendKeys("Ramineni");
		driver.findElement(By.name("phoneNumber")).sendKeys("0734956847");
		driver.findElement(By.name("busNo")).sendKeys("004");
		driver.findElement(By.name("email")).sendKeys("sravani.nk@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sravani123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[3]/div/form/div[5]/button/p"))
				.click();
	}

}
