package ServicoMensagemInstantanea;

import ServicoMensagemInstantanea.apps.FacebookMessenger;
import ServicoMensagemInstantanea.apps.MSNMessenger;
import ServicoMensagemInstantanea.apps.ServicoMensagemInstantanea;
import ServicoMensagemInstantanea.apps.Telegram;

public class ComputadorPedinho {
    public static void main(String[] args) {
       ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="Facebook"; 
		
		if(appEscolhido.equals("MSN"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("Facebook"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("Telegram"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
    }

}
