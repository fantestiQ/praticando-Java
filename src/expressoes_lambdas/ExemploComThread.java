package expressoes_lambdas;

public class ExemploComThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread com classe interna!");
            }
        };
        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Thread com expressão lambda!");
        new Thread(rLambda).start();

        new Thread(() -> System.out.println("Thread com expressão lambda passada por parâmetro!")).start();
    }
}
