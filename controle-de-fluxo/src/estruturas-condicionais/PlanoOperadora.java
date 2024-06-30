// Estrutura Condicional Switch Case : omitindo os conceitos **break** e **default** \\

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube!");
            }    
            case "M":{
                System.out.println("WhatsApp e Instagram grátis!");
            }
            case "B":{
                System.out.println("100 minutos de ligação!");
            }
        }
    }
}