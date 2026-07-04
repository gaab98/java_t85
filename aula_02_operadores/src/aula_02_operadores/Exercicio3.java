package aula_02_operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO valor do salário líquido é: R$ %.2f", salarioLiquido);
				
		
		leia.close();
	}

}