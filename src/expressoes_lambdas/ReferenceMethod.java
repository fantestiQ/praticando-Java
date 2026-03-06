package expressoes_lambdas;

import expressoes_lambdas.interfaces_funcionais.Finder;
import expressoes_lambdas.interfaces_funcionais.MyClass;
import expressoes_lambdas.interfaces_funcionais.MyEventConsumer;

public class ReferenceMethod {
    public static void main(String[] args) {

        //Reference Method
        MyEventConsumer referenceMethod = System.out::println;
        referenceMethod.consume("Olá");

        //Lambda
        MyEventConsumer lambda = s -> System.out.println(s);
        lambda.consume("Olá");

        //Referência de método estático
        Finder find = MyClass::doFind;
        find.find("Isac", "Blah");

        //Referência de método no parâmetro
        Finder findParam = String::indexOf;
        int resultParam = findParam.find("Teste", "Teste");
        System.out.println(resultParam);

        //Referência de método no parâmetro
        Finder findLamb = (s1, s2) -> s1.indexOf(s2);
        int resultLamb = findLamb.find("Teste", "Teste");
        System.out.println(resultParam);
    }
}
