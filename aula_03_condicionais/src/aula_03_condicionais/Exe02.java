package aula_03_condicionais;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("\nO Número " + numero + " é par e positivo!");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("\nO Número " + numero + " é par e negativo!");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("\nO Número " + numero + " é ímpar e positivo!");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("\nO Número " + numero + " é ímpar e negativo!");
        } else {
            System.out.println("\nO número é zero!");
        }
        
        leia.close();
    }
}