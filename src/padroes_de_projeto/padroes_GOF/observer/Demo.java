package padroes_de_projeto.padroes_GOF.observer;

public class Demo {
    public static void main(String[] args) {
        Journalist jour = new Journalist();
        jour.registerObserver(new Newspaper());
        jour.registerObserver(new TV());

        jour.publish("Teste", "sasd", "Ola", "Texto aq");
    }
}
