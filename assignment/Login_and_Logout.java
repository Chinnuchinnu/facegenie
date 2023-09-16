package assignment;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Login_and_Logout {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Harish\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://facegenie-ams-school.web.app/dashboard/home");
			driver.manage().window().maximize();
			Thread.sleep(7000);
			driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
			driver.findElement(By.id("password")).sendKeys("facegenie");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/form[2]/button")).click();
			driver.findElement(By.xpath("//span[text()='Log Out']")).click();
			Thread.sleep(3000);
			driver.close();

		}
}
