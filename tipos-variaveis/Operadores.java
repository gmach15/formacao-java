public class Operadores {
    public static void main(String[] args) {
        
        // Operador de atribuição " = " \\

        String nome = "GLEYSON"; // Conjunto de caracteres.
        int idade = 22; // Números inteiros.
        double peso = 68.5; // Números fracionários.
        char sexo = 'M'; // Um único caractere.
        boolean doadorOrgao = false; // Expressão booleana.
        Date dataNascimento = new Date(); //Nova instância de uma classe.

        // Operadores aritiméticos \\

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4); //Sempre se atentar à precedência das operações.

        // O operador (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

        String nomeCompleto = "LINGUAGEM" + "JAVA";
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);

        // Operadores unários \\

        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // Operadores ternários \\ <Expressão Condicional>`` ? ``<Caso condição seja true>`` :  ``<Caso condição seja false>

        int a, b;

        a = 5;
        b = 6;

        String resultadoTernario = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultadoTernario);

        // Operadores relacionais \\

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");


        // Operadores lógicos \\

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

    }
}