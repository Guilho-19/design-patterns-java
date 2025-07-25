package gof.facade;

import subSistema1.crm.CrmService;
import subSistema2.cep.CepAPI;

public class Facade {
	public void migrarCliente(String nome, String cep, String cidade, String estado) {
		CepAPI.getInstancia().recuperarCidade(cep);
		CepAPI.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
