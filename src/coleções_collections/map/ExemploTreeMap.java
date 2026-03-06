package coleções_collections.map;

import java.util.*;

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();


    }

    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("**** exemploListaSimplesIterandoChaveValor ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Isac dos Santos Silva");
        lista.put(2, "João Vitor Rodrigues Costa");
        lista.put(3, "Raul Reis Takarashi");
        lista.put(4, "Matheus Henrique dos Santos");

        System.out.println("For comum");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : lista.entrySet()){
            System.out.println("Chave:"  + e.getKey());
            System.out.println("Valor:"  + e.getValue());
        }
        System.out.println("**** forEch stream 1 ****");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave:"  + e.getKey());
            System.out.println("Valor:"  + e.getValue());
        });

        System.out.println("**** forEch stream 2 ****");
        lista.keySet().stream().forEach(System.out::println);
        lista.values().stream().forEach(System.out::println);

        System.out.println("**** forEch stream 3 ****");
        lista.forEach((key, value) -> System.out.println(key + " "+ value));

        System.out.println("**** iterator ****");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave:"  + entry1.getKey());
            System.out.println("Valor:"  + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("**** exemploListaSimplesIterandoValores ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Isac dos Santos Silva");
        lista.put(2, "João Vitor Rodrigues Costa");
        lista.put(3, "Raul Reis Takarashi");
        lista.put(4, "Matheus Henrique dos Santos");

        for (Integer keys : lista.keySet()){
            System.out.println(keys);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("**** exemploListaSimplesIterandoValores ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Isac dos Santos Silva");
        lista.put(2, "João Vitor Rodrigues Costa");
        lista.put(3, "Raul Reis Takarashi");
        lista.put(4, "Matheus Henrique dos Santos");

        for (String value : lista.values()){
            System.out.println(value);
        }
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Isac dos Santos Silva");
        lista.put(2, "João Vitor Rodrigues Costa");
        lista.put(3, "Raul Reis Takarashi");
        lista.put(4, "Matheus Henrique dos Santos");

        System.out.println(lista);
        System.out.println("");
    }
}
