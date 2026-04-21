package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       // executaClasse();
        //executeConstrutores();
        //executaPropriedades();
        //executaMetodos();
        //executaPackegeInfo();
       // executaSuperClass();
        //executaInterfaces();
        executaAnnotation();
    }
    private static void executaAnnotation() {
        ReflectionClass cls = new ReflectionClass();
        Annotation[] annotations = cls.getClass().getAnnotations();

        for (Annotation annotation : annotations){
            System.out.println("Annotation type: " + annotation.annotationType());
        }

        System.out.println();

        if (cls.getClass().isAnnotationPresent(ReflectionTeste.class)){
            for (Field field: cls.getClass().getDeclaredFields()){
                System.out.println("Nome do campo: " + field.getName());
                System.out.println("Tipo do campo: " + field.getType());
                System.out.println();
            }
        }

        if (cls.getClass().isAnnotationPresent(ReflectionTeste.class)){
            for (Field field: cls.getClass().getDeclaredFields()){
                if (field.isAnnotationPresent(ReflectionTeste.class)){
                    ReflectionTeste annotationCampo = field.getAnnotation(ReflectionTeste.class);
                    System.out.println("Valor da anotação: " + annotationCampo.value());
                }
            }
        }
    }

    private static void executaInterfaces() {
        ReflectionClass cls = new ReflectionClass();

        Class<?>[] interfaces = cls.getClass().getInterfaces();
        for (Class<?> intrc :interfaces){
            System.out.println("Nome interface: " + intrc.getName());
        }

    }

    private static void executaSuperClass() {
        ReflectionClass cls = new ReflectionClass();
        Class superClass  = cls.getClass().getSuperclass();
        System.out.println("Super Class:" + superClass.getName());
    }

    private static void executaPackegeInfo() {
        ReflectionClass cls = new ReflectionClass();
        Package pckg = cls.getClass().getPackage();
        System.out.println("Nome completo: " + pckg.getName());
        System.out.println("Nome: " + cls.getClass().getPackageName());
    }

    private static void executaMetodos() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ReflectionClass cls = new ReflectionClass();

        Method[] methods = cls.getClass().getDeclaredMethods();
        for (Method metodo: methods){
            System.out.println(metodo.getName());
        }

        Method getName = cls.getClass().getMethod("getName");
        Method setName = cls.getClass().getMethod("setName", String.class);

        System.out.println("Usando getName sem set: "+getName.invoke(cls));

        setName.invoke(cls, "Isac");

        System.out.println("Usando getName depois set: "+getName.invoke(cls));
    }

    private static void executaPropriedades() {
        ReflectionClass rlx = new ReflectionClass(1L);
        rlx.setName("Isac");
        rlx.setSaldo(30D);

        Field[] propriedades = rlx.getClass().getDeclaredFields();

        for (Field propriedade : propriedades){
            System.out.println("Nome: " + propriedade);
            System.out.println("Nome Simples: " + propriedade.getName());
            System.out.println("Tipo da propriedade: " + propriedade.getType());
            System.out.println();
        }
    }

    private static void executeConstrutores() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = ReflectionClass.class;

        Constructor ctr = cls.getConstructor();
        System.out.println(ctr);

        ReflectionClass rlx = (ReflectionClass)ctr.newInstance();
        System.out.println(rlx);

        Constructor longCtr = cls.getConstructor(Long.class);
        System.out.println(longCtr);

        ReflectionClass longRfx = (ReflectionClass) longCtr.newInstance(10l);
        System.out.println(longRfx);

        Constructor[] constructors = cls.getConstructors();
    }

    private static void executaClasse() throws ClassNotFoundException {

        Class cs = ReflectionClass.class;
        System.out.println(cs);

        Class cs1 = java.io.PrintStream.class;
        System.out.println(cs1);

        Class c = Class.forName("reflections.ReflectionClass");
        System.out.println(c);

        System.out.println(ReflectionClass.class);
    }
}
