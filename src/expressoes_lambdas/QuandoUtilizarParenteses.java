package expressoes_lambdas;

import expressoes_lambdas.interfaces_funcionais.MyEventConsumer;
import expressoes_lambdas.interfaces_funcionais.MyEventConsumerReturn;

public class QuandoUtilizarParenteses {
    public static void main(String[] args) {

        MyEventConsumer consumer = (Object s)->{
            System.out.println(s);
        };

        MyEventConsumer consumer1 = (s)-> System.out.println(s);

        MyEventConsumerReturn consumer2 = s->  s;
        var exp = consumer2.consumeReturn("Exemplo de repressão com retorno");
        System.out.println(exp);

        MyEventConsumer println = System.out::println;

    }
}
