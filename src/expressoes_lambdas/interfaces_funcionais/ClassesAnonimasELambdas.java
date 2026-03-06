package expressoes_lambdas.interfaces_funcionais;

public class ClassesAnonimasELambdas {

    public static void main(String[] args) {
        MyEventConsumer consumer = new MyEventConsumer() {
            @Override
            public void consume(Object event) {
                System.out.println(event);
            }
        };

        consumer.consume("Passando String como teste");

        MyEventConsumer consumerLambda = (s) -> System.out.println(s);
        consumerLambda.consume("Isac");

        MyEventConsumer consumerLambda1 = System.out::println;
        consumerLambda.consume("Inacia");

        recebeInterface(10, System.out::println);
    }

    static void recebeInterface(Object o,MyEventConsumer consumer){
        consumer.consume(o);
    }
}
