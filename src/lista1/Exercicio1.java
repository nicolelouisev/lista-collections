package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {
	
    public static void main(String[] args) {

        ArrayList<String> coresList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a cor #" + (i + 1) + ": ");
            String cor = scanner.nextLine();
            coresList.add(cor);
        }


        System.out.println("\nCores adicionadas:");
        for (String cor : coresList) {
            System.out.println(cor);
        }

        Collections.sort(coresList);

        System.out.println("\nCores ordenadas em ordem crescente:");
        for (String cor : coresList) {
            System.out.println(cor);
        }

        scanner.close();
    }
}

