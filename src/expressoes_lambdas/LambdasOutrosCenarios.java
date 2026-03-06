package expressoes_lambdas;

import java.security.PrivilegedAction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasOutrosCenarios {
    public static void main(String[] args) {
        Runnable helloWorld = () -> {
            System.out.println("Olá mundo!");
        };

        helloWorld.run();

        Consumer<String> stringConsumer = (String s) -> {
            System.out.println("Olá " + s);
        };

        stringConsumer.accept("Isac");

        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> doubleCallable = ()-> 3412.3;

        System.out.println(integerCallable.get());
        System.out.println(doubleCallable.get());
    }
}
