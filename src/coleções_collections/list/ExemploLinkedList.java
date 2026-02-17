package coleções_collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
       exemploListaSimples();
        // exemploListaSimplesOrdemAscendentes();
        //exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("***** exemplo de Numeros *****");
        List<Integer> numeros = new LinkedList<>();
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
       // System.out.println(lista);
        System.out.println("");

//        for (String nome: lista) {
//            System.out.println(nome);
//        }

        for (int i = 0 ; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

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
