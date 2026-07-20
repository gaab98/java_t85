package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        ArrayList<String> listaDeCores = new ArrayList<>();

        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            String cor = leia.nextLine();
            listaDeCores.add(cor);
        }

        // Lista todas as cores
        System.out.println("\nListar todas as cores:\n");
        for (String cor : listaDeCores) {
            System.out.println(cor);
        }

        // Ordena as cores
        Collections.sort(listaDeCores);

        
        System.out.println("\nOrdenar as cores:\n");
        for (String cor : listaDeCores) {
            System.out.println(cor);
        }

        leia.close();
    }
}