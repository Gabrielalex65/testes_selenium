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

	public class REQ10LoginTests {

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
		public void ct01LoginValidoFuncionalidades() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("maria");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("456");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Empréstimo")).click();
		    espera();
		    driver.findElement(By.linkText("Voltar")).click();
		    espera();
		    driver.findElement(By.linkText("Livros")).click();
		    espera();
		    driver.findElement(By.linkText("Voltar")).click();
		    espera();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.linkText("Voltar")).click();
		}

		

		public void espera() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

