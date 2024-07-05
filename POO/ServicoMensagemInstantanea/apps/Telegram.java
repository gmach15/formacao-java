package ServicoMensagemInstantanea.apps;

public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    
}
