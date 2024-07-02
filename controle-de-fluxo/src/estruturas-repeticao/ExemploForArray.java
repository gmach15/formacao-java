public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Júlia", "Marcos"};

        // O índice dos arrays começa em 0.
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O Aluno no índice x = " + x + " é " + alunos[x]);
        }

    // Observe que como os arrays começam com indice igual a 0 (zero), 
    // iniciamos a nossa variável x também com valor zero e 
    // validamos a quantidade de repetições a partir da quantidade de elementos do array.

        // For each: o uso dos dois pontos **:** indica que a cada iteração do array, atualiza-se o índice da variável \\
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}


