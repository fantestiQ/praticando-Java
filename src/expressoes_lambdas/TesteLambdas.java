package expressoes_lambdas;

import expressoes_lambdas.interfaces_funcionais.IntBinaryOperatorClass;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TesteLambdas {
    public static void main(String[] args) {

        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        System.out.println("IntBinaryOperator: "+intBinaryOperator.applyAsInt(15,5));

        IntBinaryOperatorClass intBinaryOperatorClass = new IntBinaryOperatorClass();
        int a = 1, b = 1;
        int resultado =  intBinaryOperatorClass.applyAsInt(a,b);
        System.out.println("Classe implementando a interface: "+ resultado);

        BiFunction <Integer, Integer, Integer> biFunction = (Integer x, Integer y) -> {
            return x + y;
        };

        System.out.println( "BiFunction: "+biFunction.apply(10,20));

       int  resultMetodo = calcular(30,70 ,(int v1, int v2)->{
            return v1 + v2;
        });

        System.out.println("Resultado com expressão como parâmetro: " + resultMetodo);
    }

    static int calcular(int v1, int v2 , IntBinaryOperator function){
        return function.applyAsInt(v1,v2);
    }
}