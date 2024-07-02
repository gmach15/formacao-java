import java.util.Random;

// Estrutura do controle de fluxo Do While \\

// do
// {
//     // comando que será executado até que a 
//      // expressão de validação torne-se falsa 
// }
// while (expressão booleana de validação);

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            // Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando...");
        
        }while(tocando());

        System.out.println("Alô!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(5)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
