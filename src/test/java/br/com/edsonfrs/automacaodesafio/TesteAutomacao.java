package br.com.edsonfrs.automacaodesafio;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomacao {
		
	@Test
	public void deveAcessarPaginaDesafio() {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		browser.navigate().to("https://www.google.com.br");
		browser.findElement(By.id("APjFqb")).sendKeys("nttdata"+"\n");
		
		//clicando no link nttdatabrasil
		browser.findElement(By.xpath("//h3[contains(text(),'NTT DATA Business Solutions')]")).click();
		
		//fechando popup
		browser.findElement(By.xpath("//*[@id=\"all\"]")).click();
		
		//clicando em carreira
		browser.findElement(By.xpath("//*[@id=\"menu-item-32094\"]/a/span")).click();
		
		//clicando junte-se a nossa equipe
		browser.findElement(By.xpath("/html/body/main/div[4]/div/div/div[2]/a")).click();
		
		//pesquisando arquiteto
		ArrayList<String> handles = new ArrayList<>(browser.getWindowHandles()); 
		browser.switchTo().window(handles.get(1));
		browser.findElement(By.xpath("//*[@id=\"pesquisar-vaga-localidade-etc\"]")).sendKeys("Arquiteto");				
				
		browser.quit();
		
		
		
	}

}
