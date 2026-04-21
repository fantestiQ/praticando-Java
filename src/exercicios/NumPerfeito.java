package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = scanner.nextInt();
        List<Integer> divisores = new ArrayList<>();

        for (int i = num; i != 0; i--){
            if (num % i == 0){
                divisores.add(i);
            }
        }
        divisores.remove(0);

        int somaDivisores = divisores.stream().reduce(0, Integer::sum);

        if (somaDivisores == num){
            System.out.println(num + " é considerado um número perfeito");
        } else System.out.println(num + " não é considerado um número perfeito");
    }
}
