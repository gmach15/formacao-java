package POO.lanchonete;

import POO.lanchonete.areacliente.Cliente;
import POO.lanchonete.atendimento.Atendente;
import POO.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
	
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();

		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		
	}
}
