public class TiposVariaveis {
    public static void main(String[] args) {
        // <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional> \\
        
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído (provavelmente terá o valor padrão (0)). 
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500 (incorreto: 2.500 = 2.5).
   
        // Tipos Primitivos (inteiros e fracionários) \\

        byte idade2 = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo.
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo. Necessário acrescentar um "L" ao fim do número.
        float pi = 3.14F; // Necessário acrescentar um "F" ao fim do número.
        double salario = 1275.33;

        // Representação de uma Constante \\

        final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI= 3.15; //Esta linha vai apresentar erro de compilação! a palavra reservada "final" garante a impossibilidade de alterar o valor dessa variável/constante.
    }
}
