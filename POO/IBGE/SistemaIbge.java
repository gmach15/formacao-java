package IBGE;
public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro uf: EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo());
        }

        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.BAHIA;

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
    }
}
