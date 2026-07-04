package aula_02_operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, diferenca;
		
		System.out.print("Digite o 1º valor: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o 2º valor: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o 3º valor: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite o 4º valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);

		System.out.printf("\nDiferença = %.1f", diferenca);
		
		
		leia.close();

	}

}