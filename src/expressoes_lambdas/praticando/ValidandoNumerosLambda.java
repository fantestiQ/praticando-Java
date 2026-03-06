package expressoes_lambdas.praticando;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ValidandoNumerosLambda {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9,10,11);

        System.out.println("Lista pares:");
        validaLista(lista, (n)-> n%2==0);

        System.out.println("Lista Impares: ");
        validaLista(lista, (n)-> n%2==1);

        System.out.println("lista todos:");
        validaLista(lista, (n)-> true);

        System.out.println("lista nenhum:");
        validaLista(lista, (n)-> false);

    }
    static void validaLista(List<Integer> lista, Predicate<Integer> predicate) {
        lista.forEach(n-> {
            if (predicate.test(n)){
                System.out.println(n);
            }
        });
    }
}
