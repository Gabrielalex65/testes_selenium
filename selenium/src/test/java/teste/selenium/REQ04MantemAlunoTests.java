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

	public class REQ04MantemAlunoTests {

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
		public void ct01cadastraralunoInvalidoJafeito() {
			   driver.get("https://ts-scel.herokuapp.com/login");
			    driver.manage().window().setSize(new Dimension(945, 1020));
			    driver.findElement(By.name("username")).click();
			    driver.findElement(By.name("username")).sendKeys("jose");
			    driver.findElement(By.name("password")).click();
			    driver.findElement(By.name("password")).sendKeys("123");
			    driver.findElement(By.cssSelector("button")).click();
			    driver.findElement(By.linkText("Alunos")).click();
			    espera();
			    driver.findElement(By.id("ra")).click();
			    driver.findElement(By.id("ra")).sendKeys("2128");
			    driver.findElement(By.id("nome")).click();
			    driver.findElement(By.id("nome")).sendKeys("Gabriel Alex");
			    driver.findElement(By.id("cep")).sendKeys("03810-110");
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).sendKeys("will@teste");
			    driver.findElement(By.cssSelector("body")).click();
			    driver.findElement(By.id("cep")).sendKeys("03810110");
			    espera();
			    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
			    driver.findElement(By.cssSelector(".text-danger")).click();
		}
		
		@Test
		public void ct02cadastraralunoInvalido5caracteres() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("24857");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("Gabriel Alex");
		    driver.findElement(By.id("cep")).sendKeys("03810-110");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("teste@email");
		    driver.findElement(By.cssSelector(".my-5")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		@Test
		public void ct03cadastraralunoInvalido3caracteres() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("241");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("Gabriel Alex");
		    driver.findElement(By.id("cep")).sendKeys("03810-110");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("teste@email");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.cssSelector(".card-body")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		@Test
		public void ct04cadastraralunoNomeInvalidoVazio() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("2128");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("teste@email");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		public void ct05cadastraralunoNomeInvalidoCaracteresAcima() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("1471");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("teste@email");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		
		public void ct06cadastraralunoEmailInvalidoCaracteresVazio() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("2890");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("William Bourroghs");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		public void ct07cadastraralunoEmailInvalidoCaracteresAcima() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    espera();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("4190");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("Carl Sagan");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03810110");
		    espera();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).click();
		}
		public void espera() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

