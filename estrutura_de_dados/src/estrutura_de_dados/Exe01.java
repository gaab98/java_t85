package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("    1 - Adicionar Cliente na Fila                    ");
            System.out.println("    2 - Listar todos os Clientes                     ");
            System.out.println("    3 - Retirar Cliente da Fila                      ");
            System.out.println("    0 - Sair                                         ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();
            leia.nextLine();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    
                    System.out.println("\nFila: ");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        fila.poll();
                        
                        System.out.println("Fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite uma opção entre 0 e 3.");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }
}