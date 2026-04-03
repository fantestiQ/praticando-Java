package generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Com generic

        List list1 = new ArrayList<>(); // Sem Generics
    }

    public static <T> void imprimir(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }

    public static <T> T pegarprimeiroLista(List<T>list){
        return list.get(0);
    }
}
