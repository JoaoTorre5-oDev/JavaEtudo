package piramide;

public class Torre {
    public static void main(String[] args) {

        // Parte que cresce
        // Laço externo: controla o número de linhas, de 1 até 5
        for (int a = 1; a <= 5; a++) {      // Laço de controle da altura, começa em 1 e vai até a altura
            for (int b = 0; b < a; b++) {   // Laço interno imprime a quantidade de '*' correspondente ao valor de 'a'
                System.out.print("*");    // Imprime '*' sem pular linha (como "escreva" em Portugol)
            }
            System.out.println();    // se não tiver essa quebra de linha os * ficaram lado a lao 
        }

         System.out.println();     // adicionando uma Quebra de linha após imprimir os '*'

        // Parte que desce
        // Ajustado para evitar repetição da linha com 5 '*'
        for (int a = 5; a >= 1; a--) {     // Laço de controle da altura, começa em 4 e vai até 1
            for (int b = 0; b < a; b++) {  // Laço interno imprime a quantidade de '*' correspondente ao valor de 'a'
                System.out.print("*");    // Imprime '*' sem pular linha
            }
           System.out.println();
        }

    }
    
}