package teste.selenium;


	import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class REQ08LoginTests {

		private WebDriver driver;
		private Map<String, Object> vars;
		JavascriptExecutor js;

		@BeforeEach
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");
			driver = new ChromeDriver();
			js = (JavascriptExecutor) driver;
			vars = new HashMap<String, Object>();
		}

		@AfterEach
		public void tearDown() {
			driver.quit();
		}

		@Test
		public void ct01LoginValido() {
			   driver.get("https://ts-scel.herokuapp.com/login");
			    driver.manage().window().setSize(new Dimension(945, 1020));
			    driver.findElement(By.name("username")).click();
			    driver.findElement(By.name("username")).sendKeys("jose");
			    driver.findElement(By.name("password")).click();
			    driver.findElement(By.name("password")).sendKeys("123");
			    driver.findElement(By.cssSelector("button")).click();
			    espera();
			    driver.findElement(By.linkText("Logout")).click();
			    espera();
			    driver.findElement(By.name("username")).click();
			    driver.findElement(By.name("username")).sendKeys("maria");
			    driver.findElement(By.name("password")).click();
			    driver.findElement(By.name("password")).sendKeys("456");
			    driver.findElement(By.cssSelector("button")).click();
			    espera();
			    driver.findElement(By.linkText("Logout")).click();
		}
		
		@Test
		public void ct02LoginSenhaInvalida() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("777");
		    driver.findElement(By.cssSelector("button")).click();
		    espera();
		    driver.findElement(By.cssSelector("body > div")).click();
		}
		
		@Test
		public void ct03LoginUsuarioInvalido() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("chapolin");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("1313");
		    driver.findElement(By.cssSelector("button")).click();
		    espera();
		    driver.findElement(By.cssSelector("body > div")).click();
		}
		

		public void espera() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

