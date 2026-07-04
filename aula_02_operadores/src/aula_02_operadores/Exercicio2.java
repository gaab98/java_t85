package aula_02_operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
			
		float nota1;
		float nota2;
		float nota3;
		float nota4;
			
		float calcularMedia;
			
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextFloat();
			
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextFloat();
			
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextFloat();
			
		System.out.print("Digite a nota 4: ");
		nota4 = leia.nextFloat();
			
		calcularMedia = (nota1 + nota2 + nota3 + nota4) / 4;
			
		System.out.printf("\nA média final é: %.1f", calcularMedia);
			
				
		leia.close();
			

	}

}