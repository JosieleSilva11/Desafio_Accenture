package steps;


import org.openqa.selenium.By;

import config.GerenciadorJava;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.PageObject;
import page.PageTesteAccenture;

public class accenture_step {
	PageTesteAccenture elementos = new PageTesteAccenture();
	PageObject po = new PageObject();
	GerenciadorJava chromedriver = new GerenciadorJava();  
 
	@Given("que acesso o sistema")
	public void acesso_sistema() {  
		GerenciadorJava.getDriver().get("http://sampleapp.tricentis.com/101/app.php");    
	}
	
	@When("selecionar no menu automobile")
	public void clicoMakeSuzuki() {
        GerenciadorJava.getDriver().findElement(By.id("nav_automobile")).click();
    } 
	
	@And("preencho o formulario Enter Vehicle Data")
	public void preerncho_formulario_com_indormacoes_Vehicle() {
		po.clicar(elementos.select_make);
		po.digitar(elementos.input_egperformance, "63");
		po.digitar(elementos.input_data, "11/25/2021");
		po.clicar(elementos.select_seats);
		po.clicar(elementos.select_fuel);
		po.digitar(elementos.input_listprice, "530");
		po.digitar(elementos.input_license, "JKH 5896");
		po.digitar(elementos.input_milege, "2000");
		po.clicar(elementos.button_next);
	}
	
	@And("preencho o formulario Enter Insurant Data")
	public void preerncho_formulario_com_indormacoes_Insurant() {
		po.digitar(elementos.input_firstname, "Josiele");
		po.digitar(elementos.input_lastname, "Silva");
		po.digitar(elementos.input_birthdate, "12/11/1997");
		po.clicar(elementos.input_female);
		po.digitar(elementos.input_streetaddress, "Qs. 2");
		po.clicar(elementos.select_country);
		po.digitar(elementos.input_zipcode, "58968596");
		po.clicar(elementos.select_occupation);
		po.clicar(elementos.select_hobby);
		po.clicar(elementos.button_next_product);
	}
	
	@And("preencho o formulario Enter Product Data")
	public void preerncho_formulario_com_indormacoes_Product() {
		po.digitar(elementos.input_startdate, "01/01/2023");
		po.clicar(elementos.select_Insurance);
		po.clicar(elementos.select_merit);
		po.clicar(elementos.select_damage_insurance);
		po.clicar(elementos.select_optional_products);
		po.clicar(elementos.select_courtesy_car);
		po.clicar(elementos.button_next_priceoption);
	}
		
	@And("preencho o formulario Select Price Option")
	public void preerncho_formulario_com_indormacoes_price_option() {
	po.clicar(elementos.select_radio);
	po.esperar_elemento_id(elementos.button_next_sendquote);
	po.clicar(elementos.button_next_sendquote);	
	}
	
	@And("preencho o formulario Send Quote")
	public void preerncho_formulario_com_indormacoes_send_quote() {
		po.digitar(elementos.input_email, "j@hotmail.com");
		po.digitar(elementos.input_phone, "999999999");
		po.digitar(elementos.input_username, "Josy");
		po.digitar(elementos.input_password, "Mais123ma");
		po.digitar(elementos.input_passwordConfirm, "Mais123ma");
		po.digitar(elementos.textarea_comments, "Teste da Accenture");
		po.clicar(elementos.button_sendemail);
	}
	
	@Then("verifica a mensagem de sucesso")
	public void verificar_mensagem_sucesso() {
	po.esperar_elemento_xpath(elementos.h2_success);
	po.clicar(elementos.h2_success);
	String texto_validacao = po.recuperar_texto_elemento(elementos.h2_success);
	po.validar_mensagem("Sending e-mail success!", texto_validacao);
	}
	
	
}
