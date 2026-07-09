package aula_03_condicionais;

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        System.out.println("****  Tabela de produtos  ****");
		System.out.println("1 - Cachorro quente - R$ 10,00");
		System.out.println("2 - X-Salada        - R$ 15,00");
		System.out.println("3 - X-Bacon         - R$ 18,00");
		System.out.println("4 - Bauru           - R$ 12,00");
		System.out.println("5 - Refrigerante    - R$  8,00");
		System.out.println("6 - Suco de laranja - R$ 13,00");

        System.out.print("Código do Produto: ");
        int codigoProduto = leia.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = leia.nextInt();

        String produto = "";
        double preco = 0.0;

        switch (codigoProduto) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código do produto inválido!");
                leia.close();
                return;
        }

        double valorTotal = quantidade * preco;

        System.out.println("\nProduto: " + produto);
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        leia.close();
    }
}