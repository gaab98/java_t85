package aula_02_operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.print("Digite o salário: ");
		salario = leia.nextFloat();
			
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
			
		novoSalario = salario + abono;
			
		System.out.printf("\nO valor do novo salário é: %.2f", novoSalario);

			
		leia.close();

	}

}