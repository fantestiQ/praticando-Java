package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


@ExemploAnotacao(value = 2,nomes = {"Isac, Inacia"}, value2 = {RetentionPolicy.RUNTIME})
public class Teste {


    String teste;
}
