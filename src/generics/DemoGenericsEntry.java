package generics;

import generics.frutas.AbsFruta;
import generics.frutas.Banana;
import generics.frutas.Fruta;
import generics.frutas.Maca;
import padroes_de_projeto.padroes_GOF.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class DemoGenericsEntry {
    public static void main(String[] args) {
        GenericEntry<String, Integer> g = new GenericEntry<String, Integer>("Teste");
        System.out.println(g.getData());

        GenericEntry<Integer, String> gI = new GenericEntry<Integer, String>(1);
        System.out.println(gI.getData());

        GenericEntry<Long, Long> gL = new GenericEntry<Long, Long>(3L);
        System.out.println(gL.getData());

        //Exemplo Wildcard extends

        List<AbsFruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        //frutas.add(new Maca());
        imprimeFrutas(frutas);
    }

    public static void imprimeFrutas(List<? super AbsFruta> frutas){
        for (Object fruta : frutas){
            System.out.println(fruta.getClass().getSimpleName());
        }
    }
}
