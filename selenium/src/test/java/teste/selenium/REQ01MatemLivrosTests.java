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
import org.openqa.selenium.chrome.ChromeDriver;

	public class REQ01MatemLivrosTests {

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
		public void ct01cadastrarlivrocomsucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Livros")).click();
			espera();
		    driver.findElement(By.id("isbn")).click();
		    driver.findElement(By.id("isbn")).sendKeys("2514");
		    driver.findElement(By.id("autor")).click();
		    driver.findElement(By.id("autor")).sendKeys("William Bourroughs");
		    driver.findElement(By.id("titulo")).click();
		    driver.findElement(By.id("titulo")).sendKeys("Junk");
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
			espera();
		}
		@Test
		public void ct02exclusaolivroscomsucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Livros")).click();
		    espera();
		    driver.findElement(By.linkText("Lista de Livros")).click();
		    espera();
		    driver.findElement(By.linkText("Excluir")).click();
		    espera();
		}
		@Test
		public void ct03atualizaalunocomsucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Livros")).click();
		    espera();
		    driver.findElement(By.linkText("Lista de Livros")).click();
		    driver.findElement(By.linkText("Editar")).click();
		    driver.findElement(By.id("isbn")).click();
		    driver.findElement(By.id("isbn")).sendKeys("1425");
		    driver.findElement(By.id("autor")).click();
		    driver.findElement(By.id("autor")).sendKeys("William edita");
		    driver.findElement(By.cssSelector(".card-body")).click();
		    driver.findElement(By.id("titulo")).sendKeys("Pulp");
		    driver.findElement(By.cssSelector(".btn")).click();
		}

		@Test
		public void ct04listalivrocomsucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Livros")).click();
		    espera();
		    driver.findElement(By.linkText("Lista de Livros")).click();
		    espera();
		}
	
		public void espera() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

