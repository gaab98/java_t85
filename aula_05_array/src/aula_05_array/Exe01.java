package aula_05_array;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		// Variável para guardar a posição encontrada 
		int indice = -1;
		
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = leia.nextInt();
		
		// Procura o número no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroProcurado) {
				indice = i; 
				break; 
			}
		}
		
		// Exibe o resultado 
		System.out.println(); 
		if (indice != -1) {
			System.out.printf("O número %d está localizado na posição: %d\n", numeroProcurado, indice);
		} else {
			System.out.printf("O número %d não foi encontrado!\n", numeroProcurado);
		}
		
		leia.close();
	}
}