package coleções_collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendentes();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("***** exemplo de Numeros *****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);
    }

    private static void exemploListaSimples(){
        System.out.println("***** exemplo de Lista *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Isac dos Santos Silva");
        lista.add("Francisco das Chagas Silva");
        lista.add("Teresa de Jesus dos Santos");
        lista.add("Inacia dos Santos Silva");
        System.out.println(lista);
        System.out.println("");
    }
    private static void exemploListaSimplesOrdemAscendentes(){
        System.out.println("***** exemplo de Lista *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Isac dos Santos Silva");
        lista.add("Francisco das Chagas Silva");
        lista.add("Teresa de Jesus dos Santos");
        lista.add("Inacia dos Santos Silva");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
