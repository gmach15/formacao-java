package ServicoMensagemInstantanea.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico da mensagem...");
    }

    // Método privado
    protected void verificarConexaoInternet() {
        System.out.println("Verificando conexão com a internet");
    }

    }

