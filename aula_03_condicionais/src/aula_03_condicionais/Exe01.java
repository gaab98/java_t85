package aula_03_condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC, soma;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		System.out.printf("\nValores digitados: %d, %d, %d", numeroA, numeroB, numeroC);
		
		soma = numeroA + numeroB;
		
		System.out.printf("\n%d + %d = %d\n", numeroA, numeroB, numeroA + numeroB);
		
		if(soma > numeroC) {
			System.out.println("A soma dos números A e B é maior do que o número C");
		} else if (soma == numeroC) {
			System.out.println("A soma dos números A e B é igual ao número C");
		} else {
			System.out.println("A soma dos números A e B é menor do que o número C");
		}
		
		leia.close();

	}

}