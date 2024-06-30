// Estrutura Condicional Composta \\

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        if(nota >= 7)
            System.out.println("A nota obtida pelo aluno foi: " + nota + ". Portanto, o status do aluno é: " + "Aprovado!");

        else
            System.out.println("A nota obtida pelo aluno foi: " + nota + ". Portanto, o status do aluno é: " + "Reprovado!");
    }
}

// Vale ressaltar aqui que no Java em uma condição **if/else** às vezes necessitamos adicionar um bloco de **{ }** se a lógica conter mais de uma linha de código.
