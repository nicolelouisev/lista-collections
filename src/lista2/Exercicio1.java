package lista2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1  {
	
	public static void main(String[] args) {
	
        Set<Integer> integerSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for(int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();

            if (integerSet.contains(valor)) {
                System.out.println("Valor repetido. Digite novamente.");
                i--; 
            } else {
                integerSet.add(valor);
            }
        }
        scanner.close();

        System.out.println("\nElementos da Collection Set:");

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}