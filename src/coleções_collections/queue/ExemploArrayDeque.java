package coleções_collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        acessandoDaFila();
        removendoDaFila();
        adicionandoDaFila();



    }




    private static void acessandoDaFila() {
        System.out.println("**** Acessando a Fila ****");
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Red");
        queue.add("Blue");
        queue.add("White");
        queue.add("Yellow");
        queue.add("Black");

        Deque<String> queue1 = new ArrayDeque<>();

        queue1.add("Green");
        queue1.add("Orange");

        queue.addAll(queue1);
        System.out.println(queue);
        System.out.println(queue1.contains("White"));
        System.out.println(queue1.contains("Brown"));
        System.out.println(queue1.containsAll(queue));

        System.out.println("Output of element: " + queue.element());
        System.out.println("Get first element using GetFirst: " + queue.getFirst());
        System.out.println("Get last element using GetLast: " + queue.getLast());
        System.out.println("Get first element using GetFirst: " + queue.getFirst());
        System.out.println("Output of peek: " + queue.peek());
        System.out.println("Get first element using peekFirst: " + queue.peekFirst());
        System.out.println("Get Last element using peekLast: " + queue.peekLast());
        System.out.println();
    }

    private static void removendoDaFila() {
        System.out.println("**** Removendo da Fila ****");
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Red");
        queue.add("Blue");
        queue.add("White");
        queue.add("Yellow");
        queue.add("Black");

        Deque<String> queue1 = new ArrayDeque<>();

        queue1.add("Green");
        queue1.add("Orange");
        queue1.add("Purple");
        queue1.add("Brown");

        queue.addAll(queue1);
        System.out.println("Elements in the ArrayDeque: " + queue);

        String val = queue.remove();
        queue.remove("Green");

        System.out.println("Elements in the ArrayDeque after remove: " + queue);

        queue.removeFirst();
        queue.removeLast();

        System.out.println("Elements in the ArrayDeque after removeFirst and RemoveLast: " + queue);


        String varPoll = queue.poll();
        queue.pollFirst();
        queue.pollLast();
        System.out.println("Elements in the ArrayDeque after poll,  pollFirst, pollLast: " + queue);


        queue.pop();
        System.out.println("Elements in the ArrayDeque after pop: " + queue);


        queue.retainAll(queue1);
        System.out.println("Elements in the ArrayDeque after RetainAll: " + queue);

        queue.removeAll(queue1);
        System.out.println("Elements in the ArrayDeque after removeall: " + queue);

    }
    private static void adicionandoDaFila() {
        System.out.println("**** Adicionando na Fila ****");
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Red");
        queue.add("Blue");
        queue.add("White");
        queue.add("Yellow");
        queue.add("Black");

        Deque<String> queue1 = new ArrayDeque<>();

        queue1.add("Green");
        queue1.add("Orange");
        queue1.add("Purple");
        queue1.add("Brown");


        queue.addAll(queue1);

        System.out.println("Elements in the Deque after addAll:" + queue);
        boolean val = queue.offer("Roxo");
        queue.offerFirst("Preto");
        queue.offerLast("Azul");

        System.out.println("Elements in the Deque after, offerFirst and offerLast:" + queue);

        queue.push("Linda");
        System.out.println("Elements in the Deque after push:" + queue);
        System.out.println("");
    }
}
