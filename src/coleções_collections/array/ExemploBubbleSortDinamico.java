package coleções_collections.array;

import java.util.Scanner;

public class ExemploBubbleSortDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do array:");
        int vetTamanho = scanner.nextInt();
        int [] vet = new int[vetTamanho];
        int i = 0;

        System.out.println("Populando o array:");
        for (i = 0; i < vet.length; i++) {
            scanner.nextLine();
            System.out.println("Informe o valor para a posição " + i +":");
            vet[i] = scanner.nextInt();
        }

        int aux = 0;


        System.out.println("Vetor desordenado:");


        for (i = 0; i <vet.length ; i++) {
            System.out.println(" " + vet[i]);
        }
        System.out.println(" ");
        for (i = 0; i < vet.length; i++) {
            for (int j = 0; j <vet.length - 1 ; j++) {
                if (vet[j]> vet[j + 1]) {
                    aux= vet[j];
                    vet[j] =  vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado:");

        for (i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
    }
}
