package aula_03_condicionais;

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        float numero1, numero2;
        int operacao;

        System.out.print("Digite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        numero2 = leia.nextFloat();
        
        System.out.println(""
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão");

        System.out.print("Selecione o código da operação: ");
        operacao = leia.nextInt();

        System.out.println(); 

        switch (operacao) {
            case 1:
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case 2:
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case 3:
                System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possível divisão por zero!");
                } else {
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

        leia.close();
    }
}