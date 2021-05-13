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

	public class REQ05EmprestimoTests {

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
		public void ct01CEPbaseDosCorreios() {
		    driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.id("endereco")).click();
		    driver.findElement(By.id("endereco")).sendKeys("03810110");
		    driver.findElement(By.name("tipoCEP")).click();
		    espera();
		    {
		      WebElement dropdown = driver.findElement(By.name("tipoCEP"));
		      dropdown.findElement(By.xpath("//option[. = 'Localidade/Logradouro']")).click();
		    }
		    driver.findElement(By.name("tipoCEP")).click();
		    driver.findElement(By.id("btn_pesquisar")).click();
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

