package esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa (inserisci 'q' per uscire): ");
            String input = scanner.nextLine();

            if (input.equals("q")){
                System.out.println("Programma terminato.");
                break;
            }

            String[] caratteri = input.split("");

            for (int i = 0; i < caratteri.length; i++){
                System.out.println(caratteri[i]);

                if (i < caratteri.length - 1){
                    System.out.println(",");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
