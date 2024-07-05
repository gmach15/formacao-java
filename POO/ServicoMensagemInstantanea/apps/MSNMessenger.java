package ServicoMensagemInstantanea.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
        salvarHistoricoMensagem();
    }
}
