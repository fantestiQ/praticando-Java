package annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExemploAnotacao {

    long value();
    String[] nomes();
    RetentionPolicy[] value2();

    String nomeDefault() default "Isac";
}
