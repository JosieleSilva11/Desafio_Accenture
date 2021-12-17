package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.GerenciadorJava;
import junit.framework.Assert;

public class PageObject {
	//Classe na qual será usada para alocar métodos que usaremos em todo o projeto

		public WebDriverWait wait;

		public void clicar(String elemento) {
			try {
				GerenciadorJava.getDriver().findElement(By.id(elemento)).click();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				GerenciadorJava.getDriver().findElement(By.xpath(elemento)).click();
			}
		}	 

		public void digitar(String elemento, String texto) {
			try {
				GerenciadorJava.getDriver().findElement(By.id(elemento)).sendKeys(texto);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				GerenciadorJava.getDriver().findElement(By.xpath(elemento)).sendKeys(texto);
			}
		}

		public void esperar_elemento_xpath(String elemento) {
			wait = new WebDriverWait(GerenciadorJava.getDriver(), 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento)));
		}

		public void esperar_elemento_id(String elemento) {
			wait = new WebDriverWait(GerenciadorJava.getDriver(), 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elemento)));
		}
		
		public String recuperar_texto_elemento(String elemento) {
			wait = new WebDriverWait(GerenciadorJava.getDriver(), 10);
			String texto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemento))).getText();
			return texto;
		}
		
		public void validar_mensagem(String texto_esperado, String texto) {
			Assert.assertEquals(texto_esperado, texto);
		}


}
