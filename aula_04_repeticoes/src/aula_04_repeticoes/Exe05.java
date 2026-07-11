package aula_04_repeticoes;

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
            
        } while (numero != 0);

        System.out.printf("\nA soma dos números positivos é: %d\n", soma);
        
        leia.close();
    }
}