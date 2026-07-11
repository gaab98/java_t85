package aula_04_repeticoes;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int par = 0;
        int impar = 0;
        int numero;

        for (int i = 1; i <= 10; i++) {
        	System.out.printf("Digite o %dº número: ", i);
            numero = leia.nextInt();

            if (numero % 2 == 0) {
            	par++;
            } else {
            	impar++;
            }
        }

        System.out.printf("\nTotal de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
        
        leia.close();
    }
}