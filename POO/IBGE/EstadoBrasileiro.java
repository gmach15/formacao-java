package IBGE;
public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA", "Maranhão", 14),
    BAHIA ("BA", "Bahia", 15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public int getIbge() {
        return ibge;
    }

    
}
