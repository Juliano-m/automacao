package desafio.automacao.acceptance.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Desafio2Steps {

	@Dado("que acesse o site {string}")
	public void que_acesse_o_site(String string) {
	    
	}

	@Quando("seleciono a opcao {string}")
	public void seleciono_a_opcao(String string) {
	
	}

	@Quando("clico no botao {string}")
	public void clico_no_botao(String string) {

	}

	@Quando("o alerta eh apresentado")
	public void o_alerta_eh_apresentado() {
	    
	}

	@Entao("clico em {string}")
	public void clico_em(String string) {
	
	}

	@Entao("o alerta eh fechado")
	public void o_alerta_eh_fechado() {
	   System.out.println("teste rodando");
	}
}
