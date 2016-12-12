package leiloesmvn;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;

	@After
	public void encerra() {
		driver.close();
	}

	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "/home/daniel/chromedriver");
		this.driver = new ChromeDriver();
		driver.get("http://localhost:8484/leiloesmvn/apenas-teste/limpa");
	}
}
