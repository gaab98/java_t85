package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class Exe02 {

    public static void main(String[] args) {
    	
        Stack<String> pilhaLivros = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*********************************");
            System.out.println("1 - Adicionar Livro na pilha     ");
            System.out.println("2 - Listar todos os Livros       ");
            System.out.println("3 - Retirar Livro da pilha       ");
            System.out.println("0 - Sair                         ");
            System.out.println("*********************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();
            leia.nextLine();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    
                    System.out.println("\nPilha:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;

                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        pilhaLivros.pop();
                        
                        System.out.println("Pilha:");
                        if (!pilhaLivros.isEmpty()) {
                            for (String livro : pilhaLivros) {
                                System.out.println(livro);
                            }
                        }
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        leia.close();
    }
}