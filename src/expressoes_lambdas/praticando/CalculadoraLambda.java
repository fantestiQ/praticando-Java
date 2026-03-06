package expressoes_lambdas.praticando;


import java.util.function.BiFunction;
import java.util.function.Function;

public class CalculadoraLambda {
    public static void main(String[] args) {
        Integer v1 = 15;
        Integer v2 = 5;

        System.out.println("Soma:"+ calcular(v1, v2, (a,b)-> a+b));
        System.out.println("Subtrai:"+ calcular(v1, v2, (a,b)-> a-b));
        System.out.println("Divide:"+ calcular(v1, v2, (a,b)-> a/b));
        System.out.println("Multiplica:"+ calcular(v1, v2, (a,b)-> a*b));


    }
    static Integer calcular(Integer x, Integer y, BiFunction<Integer, Integer, Integer> function){
     return function.apply(x,y);
    }
}
